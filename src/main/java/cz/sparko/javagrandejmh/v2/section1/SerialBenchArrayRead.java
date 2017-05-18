package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.*;

import java.io.*;

import static org.junit.Assert.assertTrue;

@State(Scope.Benchmark)
public class SerialBenchArrayRead implements Section1Bench {
    private static final int LENGTH = 100;
    private static final int SIZE = 100;

    private ArrayItem arrayBases[][] = null;
    private ObjectInputStream arrayin = null;

    private File serialFile;

    @Setup
    public void setUpBenchmark() {
        arrayBases = new ArrayItem[SIZE][LENGTH];
        serialFile = new File("serial4.out");

        try {
            for (int j = 0; j < SIZE; j++) {
                for (int i = 0; i < LENGTH; i++) {
                    arrayBases[j][i] = new ArrayItem();
                }
            }
            FileOutputStream arrayfout = new FileOutputStream(serialFile);
            ObjectOutputStream arrayout = new ObjectOutputStream(arrayfout);

            for (int j = 0; j < SIZE; j++) {
                arrayout.writeObject(arrayBases[j]);
            }

            arrayout.flush();
            arrayout.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Setup(Level.Invocation)
    public void setUpInvocation() {
        try {
            FileInputStream arrayfin = new FileInputStream(serialFile);
            arrayin = new ObjectInputStream(arrayfin);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        assertTrue(serialFile.exists());
    }

    @TearDown(Level.Invocation)
    public void tearDownInvocation() {
        try {
            arrayin.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @TearDown
    public void tearDownBenchmark() {
        assertTrue(serialFile.delete());
    }

    @Benchmark
    public void readingArray() {
        try {
            for (int i = 0; i < SIZE; i++) {
                arrayBases[i] = (ArrayItem[]) arrayin.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static class ArrayItem implements Serializable {
        int poss;
    }
}
