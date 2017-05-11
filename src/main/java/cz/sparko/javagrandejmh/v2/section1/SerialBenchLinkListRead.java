package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.*;

import java.io.*;

@State(Scope.Benchmark)
public class SerialBenchLinkListRead {

    private final int size = 5120;

    private static int listSize = 0;
    private Item base[] = null;
    private ObjectInputStream in = null;
    private FileInputStream fin = null;
    private File serialFile;
    private static final int LENGTH = 100;

    @Setup
    public void setUpBenchmark() {
        serialFile = new File("serial1.out");
        listSize = 0;

        base = new Item[size];
        for (int i = 0; i < size; i++) {
            listSize = 0;
            base[i] = new Item();
            base[i].add();
        }

        try {
            FileOutputStream fout = new FileOutputStream(serialFile);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            for (int i = 0; i < size; i++) {
                out.writeObject(base[i]);
            }
            out.flush();
            out.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Setup(Level.Invocation)
    public void setUpIteration() {
        try {
            fin = new FileInputStream(serialFile);
            in = new ObjectInputStream(fin);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @TearDown(Level.Invocation)
    public void tearDownIteration() {
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
    public Item[] readingLinklist() {
        for (int i = 0; i < size; i++) {
            try {
                base[i] = (Item) in.readObject();
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return base;
    }

    static class Item implements Serializable {
        Item next;
        int poss;

        public void add() {
            if (listSize < LENGTH) {
                next = new Item();
                listSize++;
                next.poss = listSize;
                next.add();
            }
        }
    }
}
