package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.*;

import java.io.*;

@State(Scope.Benchmark)
public class SerialBenchLinkListRead {

    private static final int SIZE = 1000;
    private static final int LINKLIST_LENGTH = 100;

    private Item linklistBases[] = null;
    private ObjectInputStream in = null;
    private FileInputStream fin = null;
    private File serialFile;

    private static int curListSize = 0;

    @Setup
    public void setUpBenchmark() {
        serialFile = new File("serial1.out");
        curListSize = 0;

        linklistBases = new Item[SIZE];
        for (int i = 0; i < SIZE; i++) {
            curListSize = 0;
            linklistBases[i] = new Item();
            linklistBases[i].add();
        }

        try {
            FileOutputStream fout = new FileOutputStream(serialFile);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            for (int i = 0; i < SIZE; i++) {
                out.writeObject(linklistBases[i]);
            }
            out.flush();
            out.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Setup(Level.Invocation)
    public void setUpIteration() {
        linklistBases = new Item[SIZE];
        try {
            fin = new FileInputStream(serialFile);
            in = new ObjectInputStream(fin);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @TearDown(Level.Invocation)
    public void tearDownIteration() {
        linklistBases = null;
        try {
            fin.close();
            in.close();
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
    public void readingLinklist() {
        for (int i = 0; i < SIZE; i++) {
            try {
                linklistBases[i] = (Item) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    static class Item implements Serializable {
        Item next;
        int poss;

        public void add() {
            if (curListSize < LINKLIST_LENGTH) {
                next = new Item();
                curListSize++;
                next.poss = curListSize;
                next.add();
            }
        }
    }
}
