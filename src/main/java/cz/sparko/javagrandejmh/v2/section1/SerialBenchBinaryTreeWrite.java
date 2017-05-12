package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.*;

import java.io.*;

import static org.junit.Assert.assertTrue;

@State(Scope.Benchmark)
public class SerialBenchBinaryTreeWrite {
    private static final int SIZE = 10;

    private ItemTree treeBases[] = null;
    private ObjectOutputStream outtree = null;
    private static final int MAXDEPTH = 10;
    private File serialFile;

    private static int curDepth = 0;

    @Setup
    public void setUpBenchmark() {
        serialFile = new File("serial2.out");
        treeBases = new ItemTree[SIZE];

        for (int i = 0; i < SIZE; i++) {
            curDepth = 0;
            treeBases[i] = new ItemTree();
            treeBases[i].add();
        }
    }

    @Setup(Level.Invocation)
    public void setUpInvocation() {
        try {
            FileOutputStream fouttree = new FileOutputStream(serialFile);
            outtree = new ObjectOutputStream(fouttree);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        assertTrue(serialFile.exists());
    }

    @TearDown
    public void tearDownBenchmark() {
        try {
            outtree.flush();
            outtree.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        assertTrue(serialFile.delete());
    }

    @Benchmark
    public void writingBinaryTree() {
        try {
            for (int i = 0; i < SIZE; i++) {
                outtree.writeObject(treeBases[i]);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static class ItemTree implements Serializable {
        ItemTree nextl;
        ItemTree nextr;
        int poss;

        private void add() {
            if (curDepth < MAXDEPTH) {
                this.poss = curDepth;
                curDepth++;
                nextl = new ItemTree();
                nextl.add();
                curDepth++;
                nextr = new ItemTree();
                nextr.add();
            }
            curDepth--;
        }
    }
}
