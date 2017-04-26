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

public class ArithBench {
    private static final int INITSIZE = 10000;

    @Benchmark
    public int addInt() {
        int i1 = 1, i2 = -2, i3 = 3, i4 = -4;

        for (int i = 0; i < INITSIZE; i++) {
            i2 += i1;
            i3 += i2;
            i4 += i3;
            i1 += i4;
            i2 += i1;
            i3 += i2;
            i4 += i3;
            i1 += i4;
            i2 += i1;
            i3 += i2;
            i4 += i3;
            i1 += i4;
            i2 += i1;
            i3 += i2;
            i4 += i3;
            i1 += i4;
        }

        return i1;
    }

    @Benchmark
    public long addLong() {
        long l1 = 1L, l2 = -2L, l3 = 3L, l4 = -4L;

        for (int i = 0; i < INITSIZE; i++) {
            l2 += l1;
            l3 += l2;
            l4 += l3;
            l1 += l4;
            l2 += l1;
            l3 += l2;
            l4 += l3;
            l1 += l4;
            l2 += l1;
            l3 += l2;
            l4 += l3;
            l1 += l4;
            l2 += l1;
            l3 += l2;
            l4 += l3;
            l1 += l4;
        }

        return l1;
    }

    @Benchmark
    public float addFloat() {
        float f1 = 1.0F, f2 = -2.0F, f3 = 3.0F, f4 = -4.0F;

        for (int i = 0; i < INITSIZE; i++) {
            f2 += f1;
            f3 += f2;
            f4 += f3;
            f1 += f4;
            f2 += f1;
            f3 += f2;
            f4 += f3;
            f1 += f4;
            f2 += f1;
            f3 += f2;
            f4 += f3;
            f1 += f4;
            f2 += f1;
            f3 += f2;
            f4 += f3;
            f1 += f4;
        }

        return f1;
    }

    @Benchmark
    public double addDouble() {
        double d1 = 1.0D, d2 = -2.0D, d3 = 3.0D, d4 = -4.0D;

        for (int i = 0; i < INITSIZE; i++) {
            d2 += d1;
            d3 += d2;
            d4 += d3;
            d1 += d4;
            d2 += d1;
            d3 += d2;
            d4 += d3;
            d1 += d4;
            d2 += d1;
            d3 += d2;
            d4 += d3;
            d1 += d4;
            d2 += d1;
            d3 += d2;
            d4 += d3;
            d1 += d4;
        }

        return d1;
    }

    @Benchmark
    public int multiplyInt() {
        int i1 = 1, i2 = -2, i3 = 3, i4 = -4;

        for (int i = 0; i < INITSIZE; i++) {
            i2 *= i1;
            i3 *= i2;
            i4 *= i3;
            i1 *= i4;
            i2 *= i1;
            i3 *= i2;
            i4 *= i3;
            i1 *= i4;
            i2 *= i1;
            i3 *= i2;
            i4 *= i3;
            i1 *= i4;
            i2 *= i1;
            i3 *= i2;
            i4 *= i3;
            i1 *= i4;
        }

        return i1;
    }

    @Benchmark
    public long multiplyLong() {
        long l1 = 1L, l2 = -2L, l3 = 3L, l4 = -4L;

        for (int i = 0; i < INITSIZE; i++) {
            l2 *= l1;
            l3 *= l2;
            l4 *= l3;
            l1 *= l4;
            l2 *= l1;
            l3 *= l2;
            l4 *= l3;
            l1 *= l4;
            l2 *= l1;
            l3 *= l2;
            l4 *= l3;
            l1 *= l4;
            l2 *= l1;
            l3 *= l2;
            l4 *= l3;
            l1 *= l4;
        }

        return l1;
    }

    @Benchmark
    public float multiplyFloat() {
        float f1 = 13.37F, f2 = (float) Math.PI, f3 = 1.0F / f1;

        for (int i = 0; i < INITSIZE; i++) {
            f1 *= f2;
            f1 *= f3;
            f1 *= f2;
            f1 *= f3;
            f1 *= f2;
            f1 *= f3;
            f1 *= f2;
            f1 *= f3;
            f1 *= f2;
            f1 *= f3;
            f1 *= f2;
            f1 *= f3;
            f1 *= f2;
            f1 *= f3;
            f1 *= f2;
            f1 *= f3;
        }

        return f1;
    }


    @Benchmark
    public double multiplyDouble() {
        double d1 = 13.37D, d2 = Math.PI, d3 = 1.0D / d1;

        for (int i = 0; i < INITSIZE; i++) {
            d1 *= d2;
            d1 *= d3;
            d1 *= d2;
            d1 *= d3;
            d1 *= d2;
            d1 *= d3;
            d1 *= d2;
            d1 *= d3;
            d1 *= d2;
            d1 *= d3;
            d1 *= d2;
            d1 *= d3;
            d1 *= d2;
            d1 *= d3;
            d1 *= d2;
            d1 *= d3;
        }

        return d1;
    }

    @Benchmark
    public int divideInt() {
        int i1 = Integer.MAX_VALUE, i2 = 3;

        for (int i = 0; i < INITSIZE; i++) {
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            i1 /= i2;
            if (i1 == 0) {
                i1 = Integer.MAX_VALUE;
            }
        }

        return i1;
    }

    @Benchmark
    public long divideLong() {
        long l1 = Long.MAX_VALUE, l2 = 3L;

        for (int i = 0; i < INITSIZE; i++) {
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            l1 /= l2;
            if (l1 == 0) {
                l1 = Long.MAX_VALUE;
            }
        }

        return l1;
    }

    @Benchmark
    public float divideFloat() throws InterruptedException {
        float f1 = 13.37F, f2 = (float) Math.PI, f3 = 1.0F / f1;

        for (int i = 0; i < INITSIZE; i++) {
            f1 /= f2;
            f1 /= f3;
            f1 /= f2;
            f1 /= f3;
            f1 /= f2;
            f1 /= f3;
            f1 /= f2;
            f1 /= f3;
            f1 /= f2;
            f1 /= f3;
            f1 /= f2;
            f1 /= f3;
            f1 /= f2;
            f1 /= f3;
            f1 /= f2;
            f1 /= f3;
        }

        return f1;
    }

    @Benchmark
    public double divideDouble() {
        double d1 = 13.37, d2 = Math.PI, d3 = 1.0D / d1;

        for (int i = 0; i < INITSIZE; i++) {
            d1 /= d2;
            d1 /= d3;
            d1 /= d2;
            d1 /= d3;
            d1 /= d2;
            d1 /= d3;
            d1 /= d2;
            d1 /= d3;
            d1 /= d2;
            d1 /= d3;
            d1 /= d2;
            d1 /= d3;
            d1 /= d2;
            d1 /= d3;
            d1 /= d2;
            d1 /= d3;
        }

        return d1;
    }
}
