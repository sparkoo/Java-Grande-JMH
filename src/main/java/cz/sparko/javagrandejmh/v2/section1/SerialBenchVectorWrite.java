package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.*;

import java.io.*;
import java.util.Vector;

import static org.junit.Assert.assertTrue;

@State(Scope.Benchmark)
public class SerialBenchVectorWrite {
    private static final int SIZE = 100;
    private static final int LENGTH = 100;

    private ObjectOutputStream outvector = null;
    private Vector vect[] = null;

    private File serialFile;

    @Setup
    public void setUpBenchmark() {
        ItemVector basevector;
        vect = new Vector[SIZE];

        for (int j = 0; j < SIZE; j++) {
            vect[j] = new Vector();
            for (int i = 0; i < LENGTH; i++) {
                basevector = new ItemVector();
                vect[j].addElement(basevector);
            }
        }
    }

    @Setup(Level.Invocation)
    public void setUpInvocation() {
        serialFile = new File("serial3.out");
        try {
            FileOutputStream foutvector = new FileOutputStream(serialFile);
            outvector = new ObjectOutputStream(foutvector);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        assertTrue(serialFile.exists());
    }

    @TearDown(Level.Invocation)
    public void tearDownInvocation() {
        try {
            outvector.flush();
            outvector.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        assertTrue(serialFile.delete());
    }

    @Benchmark
    public void writingVector() {
        try {
            for (int j = 0; j < SIZE; j++) {
                outvector.writeObject(vect[j]);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    static class ItemVector implements Serializable {
        int poss;
    }
}
