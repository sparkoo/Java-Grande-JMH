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

import org.openjdk.jmh.annotations.Benchmark;

@SuppressWarnings("ALL")
public class Assign {
    static final int INITSIZE = 10000;

    static int a1 = 1, a2 = 2, a3 = 3, a4 = 4, b[] = {1, 2, 3, 4};

    @Benchmark
    public int sameScalarLocal() {
        int e1 = 1, e2 = 2, e3 = 3, e4 = 4;

        for (int i = 0; i < INITSIZE; i++) {
            e1 = e2;
            e2 = e3;
            e3 = e4;
            e4 = e1;
            e1 = e2;
            e2 = e3;
            e3 = e4;
            e4 = e1;
            e1 = e2;
            e2 = e3;
            e3 = e4;
            e4 = e1;
            e1 = e2;
            e2 = e3;
            e3 = e4;
            e4 = e1;
        }

        return e1;
    }

    @Benchmark
    public int sameScalarInstance() {
        // In JMH we can't have instance variables, so we're creating instance of another class here and all benchmark
        // code is there. Overhead is insignificant.
        return new AssignClassInstanceTester().sameScalarInstance();
    }

    @Benchmark
    public int sameScalarClass() {
        for (int i = 0; i < INITSIZE; i++) {
            a1 = a2;
            a2 = a3;
            a3 = a4;
            a4 = a1;
            a1 = a2;
            a2 = a3;
            a3 = a4;
            a4 = a1;
            a1 = a2;
            a2 = a3;
            a3 = a4;
            a4 = a1;
            a1 = a2;
            a2 = a3;
            a3 = a4;
            a4 = a1;
        }

        return a1;
    }

    @Benchmark
    public int[] sameArrayLocal() {
        int f[] = {1, 2, 3, 4};

        for (int i = 0; i < INITSIZE; i++) {
            f[0] = f[1];
            f[1] = f[2];
            f[2] = f[3];
            f[3] = f[0];
            f[0] = f[1];
            f[1] = f[2];
            f[2] = f[3];
            f[3] = f[0];
            f[0] = f[1];
            f[1] = f[2];
            f[2] = f[3];
            f[3] = f[0];
            f[0] = f[1];
            f[1] = f[2];
            f[2] = f[3];
            f[3] = f[0];
        }

        return f;
    }

    @Benchmark
    public int[] sameArrayInstance() {
        // In JMH we can't have instance variables, so we're creating instance of another class here and all benchmark
        // code is there. Overhead is insignificant.
        return new AssignClassInstanceTester().sameArrayInstance();
    }

    @Benchmark
    public int[] sameArrayClass() {
        for (int i = 0; i < INITSIZE; i++) {
            b[0] = b[1];
            b[1] = b[2];
            b[2] = b[3];
            b[3] = b[0];
            b[0] = b[1];
            b[1] = b[2];
            b[2] = b[3];
            b[3] = b[0];
            b[0] = b[1];
            b[1] = b[2];
            b[2] = b[3];
            b[3] = b[0];
            b[0] = b[1];
            b[1] = b[2];
            b[2] = b[3];
            b[3] = b[0];
        }

        return b;
    }

    @Benchmark
    public int otherScalarInstance() {
        AssignTester at = new AssignTester();
        for (int i = 0; i < INITSIZE; i++) {
            at.c1 = at.c2;
            at.c2 = at.c3;
            at.c3 = at.c4;
            at.c4 = at.c1;
            at.c1 = at.c2;
            at.c2 = at.c3;
            at.c3 = at.c4;
            at.c4 = at.c1;
            at.c1 = at.c2;
            at.c2 = at.c3;
            at.c3 = at.c4;
            at.c4 = at.c1;
            at.c1 = at.c2;
            at.c2 = at.c3;
            at.c3 = at.c4;
            at.c4 = at.c1;
        }

        return at.c1;
    }

    @Benchmark
    public int otherScalarClass() {
        for (int i = 0; i < INITSIZE; i++) {
            AssignTester.a1 = AssignTester.a2;
            AssignTester.a2 = AssignTester.a3;
            AssignTester.a3 = AssignTester.a4;
            AssignTester.a4 = AssignTester.a1;
            AssignTester.a1 = AssignTester.a2;
            AssignTester.a2 = AssignTester.a3;
            AssignTester.a3 = AssignTester.a4;
            AssignTester.a4 = AssignTester.a1;
            AssignTester.a1 = AssignTester.a2;
            AssignTester.a2 = AssignTester.a3;
            AssignTester.a3 = AssignTester.a4;
            AssignTester.a4 = AssignTester.a1;
            AssignTester.a1 = AssignTester.a2;
            AssignTester.a2 = AssignTester.a3;
            AssignTester.a3 = AssignTester.a4;
            AssignTester.a4 = AssignTester.a1;
        }

        return AssignTester.a1;
    }

    @Benchmark
    public int otherArrayInstance() {
        AssignTester at = new AssignTester();
        for (int i = 0; i < INITSIZE; i++) {
            at.d[0] = at.d[1];
            at.d[1] = at.d[2];
            at.d[2] = at.d[3];
            at.d[3] = at.d[0];
            at.d[0] = at.d[1];
            at.d[1] = at.d[2];
            at.d[2] = at.d[3];
            at.d[3] = at.d[0];
            at.d[0] = at.d[1];
            at.d[1] = at.d[2];
            at.d[2] = at.d[3];
            at.d[3] = at.d[0];
            at.d[0] = at.d[1];
            at.d[1] = at.d[2];
            at.d[2] = at.d[3];
            at.d[3] = at.d[0];
        }

        return at.d[0];
    }

    @Benchmark
    public int otherArrayClass() {
        for (int i = 0; i < INITSIZE; i++) {
            AssignTester.b[0] = AssignTester.b[1];
            AssignTester.b[1] = AssignTester.b[2];
            AssignTester.b[2] = AssignTester.b[3];
            AssignTester.b[3] = AssignTester.b[0];
            AssignTester.b[0] = AssignTester.b[1];
            AssignTester.b[1] = AssignTester.b[2];
            AssignTester.b[2] = AssignTester.b[3];
            AssignTester.b[3] = AssignTester.b[0];
            AssignTester.b[0] = AssignTester.b[1];
            AssignTester.b[1] = AssignTester.b[2];
            AssignTester.b[2] = AssignTester.b[3];
            AssignTester.b[3] = AssignTester.b[0];
            AssignTester.b[0] = AssignTester.b[1];
            AssignTester.b[1] = AssignTester.b[2];
            AssignTester.b[2] = AssignTester.b[3];
            AssignTester.b[3] = AssignTester.b[0];
        }

        return AssignTester.b[0];
    }
}

