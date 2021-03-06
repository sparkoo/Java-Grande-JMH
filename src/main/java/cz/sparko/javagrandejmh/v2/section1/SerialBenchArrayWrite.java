/**************************************************************************
 *                                                                         *
 *             Java Grande Forum Benchmark Suite - Version 2.0             *
 *                                                                         *
 *                            produced by                                  *
 *                                                                         *
 *                  Java Grande Benchmarking Project                       *
 *                                                                         *
 *                                at                                       *
 *                                                                         *
 *                Edinburgh Parallel Computing Centre                      *
 *                                                                         *
 *                email: epcc-javagrande@epcc.ed.ac.uk                     *
 *                                                                         *
 *                                                                         *
 *      This version copyright (c) The University of Edinburgh, 1999.      *
 *                         All rights reserved.                            *
 *                                                                         *
 **************************************************************************/

package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.*;

import java.io.*;

import static org.junit.Assert.assertTrue;

@State(Scope.Benchmark)
public class SerialBenchArrayWrite implements Section1Bench {
    private static final int LENGTH = 100;
    private static final int SIZE = 100;

    private arrayitem arrayBases[][] = null;
    private ObjectOutputStream arrayout = null;

    private File serialFile;

    @Setup
    public void setUpBenchmark() {
        arrayBases = new arrayitem[SIZE][LENGTH];
        for (int j = 0; j < SIZE; j++) {
            for (int i = 0; i < LENGTH; i++) {
                arrayBases[j][i] = new arrayitem();
            }
        }
    }

    @Setup(Level.Invocation)
    public void setUpInvocation() {
        serialFile = new File("serial4.out");
        try {
            FileOutputStream arrayfout = new FileOutputStream(serialFile);
            arrayout = new ObjectOutputStream(arrayfout);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        assertTrue(serialFile.exists());
    }

    @TearDown(Level.Invocation)
    public void tearDownInvocation() {
        try {
            arrayout.flush();
            arrayout.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        assertTrue(serialFile.delete());
    }

    @Benchmark
    public void writingArray() {
        try {
            for (int j = 0; j < SIZE; j++) {
                arrayout.writeObject(arrayBases[j]);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private static class arrayitem implements Serializable {
        int poss;
    }
}
