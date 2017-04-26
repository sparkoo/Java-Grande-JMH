package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Benchmark)
public class ExceptionBench {

    private static final int INITSIZE = 10000;

    Exception except = new Exception();

    @Benchmark
    public void exceptionThrow() {
        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            try { throw except; } catch (Exception ecatch) {}
            try { throw except; } catch (Exception ecatch) {}
            try { throw except; } catch (Exception ecatch) {}
            try { throw except; } catch (Exception ecatch) {}
            try { throw except; } catch (Exception ecatch) {}
            try { throw except; } catch (Exception ecatch) {}
            try { throw except; } catch (Exception ecatch) {}
            try { throw except; } catch (Exception ecatch) {}
            /* @formatter:on */
        }
    }
}
