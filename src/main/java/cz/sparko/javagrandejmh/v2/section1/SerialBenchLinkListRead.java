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
public class SerialBenchLinkListRead implements Section1Bench {

    private static final int SIZE = 100;
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
    public void setUpInvocation() {
        linklistBases = new Item[SIZE];
        try {
            fin = new FileInputStream(serialFile);
            in = new ObjectInputStream(fin);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    @TearDown(Level.Invocation)
    public void tearDownInvocation() {
        linklistBases = null;
        try {
            fin.close();
            in.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        assertTrue(serialFile.exists());
    }

    @TearDown
    public void tearDownBenchmark() {
        assertTrue(serialFile.delete());
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

        private void add() {
            if (curListSize < LINKLIST_LENGTH) {
                next = new Item();
                curListSize++;
                next.poss = curListSize;
                next.add();
            }
        }
    }
}
