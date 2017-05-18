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
import java.util.Vector;

import static org.junit.Assert.assertTrue;

@State(Scope.Benchmark)
public class SerialBenchVectorRead implements Section1Bench {
    private static final int SIZE = 100;
    private static final int LENGTH = 100;

    private Vector vectorBases[] = null;

    private ObjectInputStream invector = null;
    private FileInputStream finvector = null;

    private File serialFile;

    @Setup
    public void setUpBenchmark() {
        serialFile = new File("serial3.out");
        vectorBases = new Vector[SIZE];

        try {
            ItemVector basevector;
            FileOutputStream foutvector = new FileOutputStream(serialFile);
            ObjectOutputStream outvector = new ObjectOutputStream(foutvector);

            for (int j = 0; j < SIZE; j++) {
                vectorBases[j] = new Vector();
                for (int i = 0; i < LENGTH; i++) {
                    basevector = new ItemVector();
                    basevector.poss = i;
                    vectorBases[j].addElement(basevector);
                }
            }

            for (int j = 0; j < SIZE; j++) {
                outvector.writeObject(vectorBases[j]);
            }

            outvector.flush();
            outvector.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @Setup(Level.Invocation)
    public void setUpInvocation() {
        try {
            finvector = new FileInputStream(serialFile);
            invector = new ObjectInputStream(finvector);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        assertTrue(serialFile.exists());
    }

    @TearDown(Level.Invocation)
    public void tearDownInvocation() {
        try {
            invector.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @TearDown
    public void tearDownBenchmark() {
        assertTrue(serialFile.delete());
    }

    @Benchmark
    public void readingVector() {
        try {
            for (int i = 0; i < SIZE; i++) {
                vectorBases[i] = (Vector) invector.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    static class ItemVector implements Serializable {
        int poss;
    }
}
