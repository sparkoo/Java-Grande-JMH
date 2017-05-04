package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class LoopBench {

    @Param({"10000", "20000", "40000", "80000", "160000", "320000", "640000", "1280000", "2560000", "5120000",
            "10240000", "20480000", "40960000", "81920000", "163840000", "327680000", "655360000"})
    int loopSize;

    @Benchmark
    public void forLoop(Blackhole bh) {
        for (int i = 0; i < loopSize; i++) {
            bh.consume(loopSize);
        }
    }

    @Benchmark
    public void reverseForLoop(Blackhole bh) {
        for (int i = loopSize; i > 0; i--) {
            bh.consume(loopSize);
        }
    }

    @Benchmark
    public void whileLoop(Blackhole bh) {
        int i = 0;
        while (i++ < loopSize) {
            bh.consume(loopSize);
        }
    }
}
