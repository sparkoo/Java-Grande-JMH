package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.*;

import java.io.*;

@State(Scope.Benchmark)
public class SerialBenchLinkListWrite {

    private final int size = 5120;

    private static int listSize = 0;
    private Item base[] = null;
    private ObjectOutputStream out = null;
    private File serialFile;
    private static final int LENGTH = 100;

    @Setup
    public void setUpBenchmark() {
        listSize = 0;

        base = new Item[size];
        for (int i = 0; i < size; i++) {
            listSize = 0;
            base[i] = new Item();
            base[i].add();
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
    public Item[] writingLinklist() {
        try {
            for (int i = 0; i < size; i++) {
                out.writeObject(base[i]);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return base;
    }

    static class Item implements Serializable {
        Item next;
        int poss;

        void add() {
            if (listSize < LENGTH) {
                next = new Item();
                listSize++;
                next.poss = listSize;
                next.add();
            }
        }
    }
}
