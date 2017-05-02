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

@State(Scope.Benchmark)
public class ArithBench {
    private static final int INITSIZE = 10000;

    private int i1 = 1, i2 = -2, i3 = 3, i4 = -4;
    private long l1 = 1L, l2 = -2L, l3 = 3L, l4 = -4L;
    private float f1 = 1.0F, f2 = -2.0F, f3 = 3.0F, f4 = -4.0F;
    private double d1 = 1.0D, d2 = -2.0D, d3 = 3.0D, d4 = -4.0D;

    // vars for multiply benchmarks
    private float fm1 = 13.37F, fm2 = (float) Math.PI, fm3 = 1.0F / fm1;
    private double dm1 = 13.37D, dm2 = Math.PI, dm3 = 1.0D / dm1;

    // vars for divide benchmarks
    private int id1 = Integer.MAX_VALUE, id2 = 3;
    private long ld1 = Long.MAX_VALUE, ld2 = 3L;
    private float fd1 = 13.37F, fd2 = (float) Math.PI, fd3 = 1.0F / fd1;
    private double dd1 = 13.37, dd2 = Math.PI, dd3 = 1.0D / dd1;

    @Benchmark
    public int addInt() {
        for (int i = 0; i < INITSIZE; i++) {
            i2 += i1;
            i3 += i2;
            i4 += i3;
            i1 += i4;
        }

        return i1;
    }

    @Benchmark
    public long addLong() {
        for (int i = 0; i < INITSIZE; i++) {
            l2 += l1;
            l3 += l2;
            l4 += l3;
            l1 += l4;
        }

        return l1;
    }

    @Benchmark
    public float addFloat() {
        for (int i = 0; i < INITSIZE; i++) {
            f2 += f1;
            f3 += f2;
            f4 += f3;
            f1 += f4;
        }

        return f1;
    }

    @Benchmark
    public double addDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d2 += d1;
            d3 += d2;
            d4 += d3;
            d1 += d4;
        }

        return d1;
    }

    @Benchmark
    public int multiplyInt() {
        for (int i = 0; i < INITSIZE; i++) {
            i2 *= i1;
            i3 *= i2;
            i4 *= i3;
            i1 *= i4;
        }

        return i1;
    }

    @Benchmark
    public long multiplyLong() {
        for (int i = 0; i < INITSIZE; i++) {
            l2 *= l1;
            l3 *= l2;
            l4 *= l3;
            l1 *= l4;
        }

        return l1;
    }

    @Benchmark
    public float multiplyFloat() {
        for (int i = 0; i < INITSIZE; i++) {
            fm1 *= fm2;
            fm1 *= fm3;
        }

        return fm1;
    }


    @Benchmark
    public double multiplyDouble() {

        for (int i = 0; i < INITSIZE; i++) {
            dm1 *= dm2;
            dm1 *= dm3;
        }

        return dm1;
    }

    @Benchmark
    public int divideInt() {
        for (int i = 0; i < INITSIZE; i++) {
            id1 /= id2;
            if (id1 == 0) {
                id1 = Integer.MAX_VALUE;
            }
        }

        return id1;
    }

    @Benchmark
    public long divideLong() {
        for (int i = 0; i < INITSIZE; i++) {
            ld1 /= ld2;
            if (ld1 == 0) {
                ld1 = Long.MAX_VALUE;
            }
        }

        return ld1;
    }

    @Benchmark
    public float divideFloat() throws InterruptedException {
        for (int i = 0; i < INITSIZE; i++) {
            fd1 /= fd2;
            fd1 /= fd3;
        }

        return fd1;
    }

    @Benchmark
    public double divideDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            dd1 /= dd2;
            dd1 /= dd3;
        }

        return dd1;
    }
}
