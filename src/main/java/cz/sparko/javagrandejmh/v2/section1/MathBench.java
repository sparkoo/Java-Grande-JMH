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

@SuppressWarnings("ALL")
@State(Scope.Benchmark)
public class MathBench implements Section1Bench {

    int i1 = 1, i2 = 2, i3 = 3, i4 = 4;
    long l1 = 1, l2 = 2, l3 = 3, l4 = 4;
    float f1 = 1.0F, f2 = 2.0F, f3 = 3.0F, f4 = 4.0F;
    double d1 = 1.0D, d2 = 2.0D, d3 = 3.0D, d4 = 4.0D;

    @Benchmark
    public void absInt(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.abs(i2));
            bh.consume(Math.abs(i3));
            bh.consume(Math.abs(i4));
            bh.consume(Math.abs(i1));
        }
    }

    @Benchmark
    public void absLong(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.abs(l2));
            bh.consume(Math.abs(l3));
            bh.consume(Math.abs(l4));
            bh.consume(Math.abs(l1));
        }
    }

    @Benchmark
    public void absFloat(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.abs(f2));
            bh.consume(Math.abs(f3));
            bh.consume(Math.abs(f4));
            bh.consume(Math.abs(f1));
        }
    }

    @Benchmark
    public void absDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.abs(d2));
            bh.consume(Math.abs(d3));
            bh.consume(Math.abs(d4));
            bh.consume(Math.abs(d1));
        }
    }

    @Benchmark
    public void maxInt(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.max(i2, i3));
            bh.consume(Math.max(i3, i4));
            bh.consume(Math.max(i4, i1));
            bh.consume(Math.max(i1, i2));
        }
    }

    @Benchmark
    public void maxLong(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.max(l2, l3));
            bh.consume(Math.max(l3, l4));
            bh.consume(Math.max(l4, l1));
            bh.consume(Math.max(l1, l2));
        }
    }

    @Benchmark
    public void maxFloat(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.max(f2, f3));
            bh.consume(Math.max(f3, f4));
            bh.consume(Math.max(f4, f1));
            bh.consume(Math.max(f1, f2));
        }
    }

    @Benchmark
    public void maxDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.max(d2, d3));
            bh.consume(Math.max(d3, d4));
            bh.consume(Math.max(d4, d1));
            bh.consume(Math.max(d1, d2));
        }
    }

    @Benchmark
    public void minInt(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.min(i2, i3));
            bh.consume(Math.min(i3, i4));
            bh.consume(Math.min(i4, i1));
            bh.consume(Math.min(i1, i2));
        }
    }

    @Benchmark
    public void minLong(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.min(l2, l3));
            bh.consume(Math.min(l3, l4));
            bh.consume(Math.min(l4, l1));
            bh.consume(Math.min(l1, l2));
        }
    }

    @Benchmark
    public void minFloat(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.min(f2, f3));
            bh.consume(Math.min(f3, f4));
            bh.consume(Math.min(f4, f1));
            bh.consume(Math.min(f1, f2));
        }
    }

    @Benchmark
    public void minDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.min(d2, d3));
            bh.consume(Math.min(d3, d4));
            bh.consume(Math.min(d4, d1));
            bh.consume(Math.min(d1, d2));
        }
    }

    @Benchmark
    public void sinDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.sin(d2));
            bh.consume(Math.sin(d3));
            bh.consume(Math.sin(d4));
            bh.consume(Math.sin(d1));
        }
    }

    @Benchmark
    public void cosDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.cos(d2));
            bh.consume(Math.cos(d3));
            bh.consume(Math.cos(d4));
            bh.consume(Math.cos(d1));
        }
    }

    @Benchmark
    public void tanDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.tan(d2));
            bh.consume(Math.tan(d3));
            bh.consume(Math.tan(d4));
            bh.consume(Math.tan(d1));
        }
    }

    @Benchmark
    public void asinDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.asin(d2 * 0.5D));
            bh.consume(Math.asin(d3 * 0.5D));
            bh.consume(Math.asin(d4 * 0.5D));
            bh.consume(Math.asin(d1 * 0.5D));
        }
    }

    @Benchmark
    public void acosDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.acos(d2 * 0.5D));
            bh.consume(Math.acos(d3 * 0.5D));
            bh.consume(Math.acos(d4 * 0.5D));
            bh.consume(Math.acos(d1 * 0.5D));
        }
    }

    @Benchmark
    public void atanDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.atan(d2 * 0.5D));
            bh.consume(Math.atan(d3 * 0.5D));
            bh.consume(Math.atan(d4 * 0.5D));
            bh.consume(Math.atan(d1 * 0.5D));
        }
    }

    @Benchmark
    public void atan2Double(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.atan2(d2, 2.0D));
            bh.consume(Math.atan2(d3, 2.0D));
            bh.consume(Math.atan2(d4, 2.0D));
            bh.consume(Math.atan2(d1, 2.0D));
        }
    }

    @Benchmark
    public void floorDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.floor(d2));
            bh.consume(Math.floor(d3));
            bh.consume(Math.floor(d4));
            bh.consume(Math.floor(d1));
        }
    }

    @Benchmark
    public void ceilDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.ceil(d2));
            bh.consume(Math.ceil(d3));
            bh.consume(Math.ceil(d4));
            bh.consume(Math.ceil(d1));
        }
    }

    @Benchmark
    public void sqrtDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.sqrt(d2));
            bh.consume(Math.sqrt(d3));
            bh.consume(Math.sqrt(d4));
            bh.consume(Math.sqrt(d1));
        }
    }

    @Benchmark
    public void expDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.exp(d2 - 2.0D));
            bh.consume(Math.exp(d3 - 2.0D));
            bh.consume(Math.exp(d4 - 2.0D));
            bh.consume(Math.exp(d1 - 2.0D));
        }
    }

    @Benchmark
    public void logDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.log(d2 + 2.0D));
            bh.consume(Math.log(d3 + 2.0D));
            bh.consume(Math.log(d4 + 2.0D));
            bh.consume(Math.log(d1 + 2.0D));
        }
    }

    @Benchmark
    public void powDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.pow(d2, d3));
            bh.consume(Math.pow(d3, d4));
            bh.consume(Math.pow(d4, d1));
            bh.consume(Math.pow(d1, d2));
        }
    }

    @Benchmark
    public void rintDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.rint(d2));
            bh.consume(Math.rint(d3));
            bh.consume(Math.rint(d4));
            bh.consume(Math.rint(d1));
        }
    }

    @Benchmark
    public void random(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.random());
        }
    }

    @Benchmark
    public void roundFloat(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.round((float) i2));
            bh.consume(Math.round((float) i3));
            bh.consume(Math.round((float) i4));
            bh.consume(Math.round((float) i1));
        }
    }

    @Benchmark
    public void roundDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.round((double) l2));
            bh.consume(Math.round((double) l3));
            bh.consume(Math.round((double) l4));
            bh.consume(Math.round((double) l1));
        }
    }

    @Benchmark
    public void ieeeRemainderDouble(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.IEEEremainder(d2, d3));
            bh.consume(Math.IEEEremainder(d3, d4));
            bh.consume(Math.IEEEremainder(d4, d1));
            bh.consume(Math.IEEEremainder(d1, d2));
        }
    }
}
