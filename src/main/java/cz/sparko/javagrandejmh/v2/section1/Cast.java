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

// all benchmarks in this class are completely eliminated by compiler optimizations
public class Cast {
    private static final int INITSIZE = 10000;

    // This test is completely eliminated by compiler optimizations
//    @Benchmark
    public float intFloat() {
        int i1 = 6;
        float f1 = 0.0F;

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            f1 = (float) i1; i1 = (int) f1;
            /* @formatter:on */
        }

        return f1;
    }

    // This test is completely eliminated by compiler optimizations
//    @Benchmark
    public double intDouble() {
        int i1 = 6;
        double d1 = 0.0F;

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            d1 = (double) i1; i1 =(int) d1;
            /* @formatter:on */
        }

        return d1;
    }

    // This test is completely eliminated by compiler optimizations
//    @Benchmark
    public float longFloat() {
        long l1 = 6;
        float f1 = 0.0F;

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            f1 = (float) l1; l1 =(long) f1;
            /* @formatter:on */
        }

        return f1;
    }

    // This test is completely eliminated by compiler optimizations
//    @Benchmark
    public double longDouble() {
        long l1 = 6;
        double d1 = 0.0F;

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            d1 = (double) l1; l1 =(long) d1;
            /* @formatter:on */
        }

        return d1;
    }
}