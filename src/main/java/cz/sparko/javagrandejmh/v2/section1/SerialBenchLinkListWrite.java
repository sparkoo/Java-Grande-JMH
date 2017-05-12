package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.*;

import java.io.*;

@State(Scope.Benchmark)
public class SerialBenchLinkListWrite {

    private static final int SIZE = 1000;
    private static final int LINKLIST_LENGTH = 100;

    private Item linklistBases[] = null;
    private ObjectOutputStream out = null;
    private File serialFile;

    private static int curListSize = 0;

    @Setup
    public void setUpBenchmark() {
        curListSize = 0;

        linklistBases = new Item[SIZE];
        for (int i = 0; i < SIZE; i++) {
            curListSize = 0;
            linklistBases[i] = new Item();
            linklistBases[i].add();
        }
    }

    @Setup(Level.Invocation)
    public void setUpIteration() {
        serialFile = new File("serial1.out");
        try {
            FileOutputStream fout = new FileOutputStream(serialFile);
            out = new ObjectOutputStream(fout);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @TearDown(Level.Invocation)
    public void tearDownIteration() {
        try {
            out.flush();
            out.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @TearDown
    public void tearDownBenchmark() {
        //noinspection ResultOfMethodCallIgnored
        serialFile.delete();
    }

    @Benchmark
    public void writingLinklist() {
        try {
            for (int i = 0; i < SIZE; i++) {
                out.writeObject(linklistBases[i]);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    static class Item implements Serializable {
        Item next;
        int poss;

        void add() {
            if (curListSize < LINKLIST_LENGTH) {
                next = new Item();
                curListSize++;
                next.poss = curListSize;
                next.add();
            }
        }
    }
}
