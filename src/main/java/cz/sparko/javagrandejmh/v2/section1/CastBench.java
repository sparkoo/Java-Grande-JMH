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
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class CastBench {
    private static final int INITSIZE = 10000;

    private int i1 = 6;
    private long l1 = 6;
    private float f1 = 0.0F;
    private double d1 = 0.0D;

    @Benchmark
    public void intFloat(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume((float) i1);
            bh.consume((int) f1);
        }
    }

    @Benchmark
    public void intDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume((double) i1);
            bh.consume((int) d1);
        }
    }

    @Benchmark
    public void longFloat(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume((float) l1);
            bh.consume((long) f1);
        }
    }

    @Benchmark
    public void longDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume((double) l1);
            bh.consume((long) d1);
        }
    }
}
