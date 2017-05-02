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
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class CastBench {
    private static final int INITSIZE = 10000;

    private int i1 = 6;
    private long l1 = 6;
    private float f1 = 0.0F;
    private double d1 = 0.0D;

    @Benchmark
    public float intFloat() {
        for (int i = 0; i < INITSIZE; i++) {
            f1 = (float) i1;
            i1 = (int) f1;
        }

        return f1;
    }

    @Benchmark
    public double intDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = (double) i1;
            i1 = (int) d1;
        }

        return d1;
    }

    @Benchmark
    public float longFloat() {
        for (int i = 0; i < INITSIZE; i++) {
            f1 = (float) l1;
            l1 = (long) f1;
        }

        return f1;
    }

    @Benchmark
    public double longDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = (double) l1;
            l1 = (long) d1;
        }

        return d1;
    }
}
