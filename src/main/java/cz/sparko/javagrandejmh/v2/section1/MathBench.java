package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@SuppressWarnings("ALL")
@State(Scope.Benchmark)
public class MathBench {
    private static final int INITSIZE = 10000;

    double time;
    int i1 = 1, i2 = 2, i3 = 3, i4 = 4;
    long l1 = 1, l2 = 2, l3 = 3, l4 = 4;
    float f1 = 1.0F, f2 = 2.0F, f3 = 3.0F, f4 = 4.0F;
    double d1 = 1.0D, d2 = 2.0D, d3 = 3.0D, d4 = 4.0D;

    @Benchmark
    public int absInt() {
        for (int i = 0; i < INITSIZE; i++) {
            i1 = Math.abs(i2);
            i2 = Math.abs(i3);
            i3 = Math.abs(i4);
            i4 = Math.abs(i1);
        }

        return i1;
    }

    @Benchmark
    public long absLong() {
        for (int i = 0; i < INITSIZE; i++) {
            l1 = Math.abs(l2);
            l2 = Math.abs(l3);
            l3 = Math.abs(l4);
            l4 = Math.abs(l1);
        }

        return l1;
    }

    @Benchmark
    public float absFloat() {
        for (int i = 0; i < INITSIZE; i++) {
            f1 = Math.abs(f2);
            f2 = Math.abs(f3);
            f3 = Math.abs(f4);
            f4 = Math.abs(f1);
        }

        return f1;
    }

    @Benchmark
    public double absDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.abs(d2);
            d2 = Math.abs(d3);
            d3 = Math.abs(d4);
            d4 = Math.abs(d1);
        }

        return d1;
    }

    @Benchmark
    public int maxInt() {
        for (int i = 0; i < INITSIZE; i++) {
            i1 = Math.max(i2, i3);
            i2 = Math.max(i3, i4);
            i3 = Math.max(i4, i1);
            i4 = Math.max(i1, i2);
        }
        return i1;
    }

    @Benchmark
    public long maxLong() {
        for (int i = 0; i < INITSIZE; i++) {
            l1 = Math.max(l2, l3);
            l2 = Math.max(l3, l4);
            l3 = Math.max(l4, l1);
            l4 = Math.max(l1, l2);
        }
        return l1;
    }

    @Benchmark
    public float maxFloat() {
        for (int i = 0; i < INITSIZE; i++) {
            f1 = Math.max(f2, f3);
            f2 = Math.max(f3, f4);
            f3 = Math.max(f4, f1);
            f4 = Math.max(f1, f2);
        }

        return f1;
    }

    @Benchmark
    public double maxDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.max(d2, d3);
            d2 = Math.max(d3, d4);
            d3 = Math.max(d4, d1);
            d4 = Math.max(d1, d2);
        }

        return d1;
    }

    @Benchmark
    public int minInt() {
        for (int i = 0; i < INITSIZE; i++) {
            i1 = Math.min(i2, i3);
            i2 = Math.min(i3, i4);
            i3 = Math.min(i4, i1);
            i4 = Math.min(i1, i2);
        }

        return i1;
    }

    @Benchmark
    public long minLong() {
        for (int i = 0; i < INITSIZE; i++) {
            l1 = Math.min(l2, l3);
            l2 = Math.min(l3, l4);
            l3 = Math.min(l4, l1);
            l4 = Math.min(l1, l2);
        }

        return l1;
    }

    @Benchmark
    public float minFloat() {
        for (int i = 0; i < INITSIZE; i++) {
            f1 = Math.min(f2, f3);
            f2 = Math.min(f3, f4);
            f3 = Math.min(f4, f1);
            f4 = Math.min(f1, f2);
        }

        return f1;
    }

    @Benchmark
    public double minDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.min(d2, d3);
            d2 = Math.min(d3, d4);
            d3 = Math.min(d4, d1);
            d4 = Math.min(d1, d2);
        }

        return d1;
    }

    @Benchmark
    public double sinDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.sin(d2);
            d2 = Math.sin(d3);
            d3 = Math.sin(d4);
            d4 = Math.sin(d1);
        }

        return d1;
    }

    @Benchmark
    public double cosDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.cos(d2);
            d2 = Math.cos(d3);
            d3 = Math.cos(d4);
            d4 = Math.cos(d1);
        }

        return d1;
    }

    @Benchmark
    public double tanDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.tan(d2);
            d2 = Math.tan(d3);
            d3 = Math.tan(d4);
            d4 = Math.tan(d1);
        }

        return d1;
    }

    @Benchmark
    public double asinDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.asin(d2 * 0.5D);
            d2 = Math.asin(d3 * 0.5D);
            d3 = Math.asin(d4 * 0.5D);
            d4 = Math.asin(d1 * 0.5D);
        }

        return d1;
    }

    @Benchmark
    public double acosDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.acos(d2 * 0.5D);
            d2 = Math.acos(d3 * 0.5D);
            d3 = Math.acos(d4 * 0.5D);
            d4 = Math.acos(d1 * 0.5D);
        }

        return d1;
    }

    @Benchmark
    public double atanDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.atan(d2 * 0.5D);
            d2 = Math.atan(d3 * 0.5D);
            d3 = Math.atan(d4 * 0.5D);
            d4 = Math.atan(d1 * 0.5D);
        }

        return d1;
    }

    @Benchmark
    public double atan2Double() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.atan2(d2, 2.0D);
            d2 = Math.atan2(d3, 2.0D);
            d3 = Math.atan2(d4, 2.0D);
            d4 = Math.atan2(d1, 2.0D);
        }

        return d1;
    }

    @Benchmark
    public double floorDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.floor(d2);
            d2 = Math.floor(d3);
            d3 = Math.floor(d4);
            d4 = Math.floor(d1);
        }

        return d1;
    }

    @Benchmark
    public double ceilDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.ceil(d2);
            d2 = Math.ceil(d3);
            d3 = Math.ceil(d4);
            d4 = Math.ceil(d1);
        }

        return d1;
    }

    @Benchmark
    public double sqrtDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.sqrt(d2);
            d2 = Math.sqrt(d3);
            d3 = Math.sqrt(d4);
            d4 = Math.sqrt(d1);
        }

        return d1;
    }

    @Benchmark
    public double expDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.exp(d2 - 2.0D);
            d2 = Math.exp(d3 - 2.0D);
            d3 = Math.exp(d4 - 2.0D);
            d4 = Math.exp(d1 - 2.0D);
        }

        return d1;
    }

    @Benchmark
    public double logDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.log(d2 + 2.0D);
            d2 = Math.log(d3 + 2.0D);
            d3 = Math.log(d4 + 2.0D);
            d4 = Math.log(d1 + 2.0D);
        }

        return d1;
    }

    @Benchmark
    public double powDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.pow(d2, d3);
            d2 = Math.pow(d3, d4);
            d3 = Math.pow(d4, d1);
            d4 = Math.pow(d1, d2);
        }

        return d1;
    }

    @Benchmark
    public double rintDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.rint(d2);
            d2 = Math.rint(d3);
            d3 = Math.rint(d4);
            d4 = Math.rint(d1);
        }

        return d1;
    }

    @Benchmark
    public void random(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(Math.random());
        }
    }

    @Benchmark
    public float roundFloat() {
        for (int i = 0; i < INITSIZE; i++) {
            i1 = Math.round((float) i2);
            i2 = Math.round((float) i3);
            i1 = Math.round((float) i4);
            i4 = Math.round((float) i1);
        }

        return i1;
    }

    @Benchmark
    public double roundDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            l1 = Math.round((double) l2);
            l2 = Math.round((double) l3);
            l1 = Math.round((double) l4);
            l4 = Math.round((double) l1);
        }

        return l1;
    }

    @Benchmark
    public double ieeeRemainderDouble() {
        for (int i = 0; i < INITSIZE; i++) {
            d1 = Math.IEEEremainder(d2, d3);
            d2 = Math.IEEEremainder(d3, d4);
            d3 = Math.IEEEremainder(d4, d1);
            d4 = Math.IEEEremainder(d1, d2);
        }

        return d1;
    }
}
