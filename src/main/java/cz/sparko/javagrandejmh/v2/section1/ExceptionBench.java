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
public class ExceptionBench {

    private static final int INITSIZE = 10000;

    private Exception except = new Exception();

    @Benchmark
    public void exceptionThrow(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            try {
                throw except;
            } catch (Exception ecatch) {
                bh.consume(ecatch);
            }
        }
    }

    @Benchmark
    public void exceptionNew(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            try {
                throw new Exception();
            } catch (Exception ecatch) {
                bh.consume(ecatch);
            }
        }
    }

    @Benchmark
    public void exceptionMethod(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            try {
                exceptthrow();
            } catch (Exception ecatch) {
                bh.consume(ecatch);
            }
        }
    }

    private void exceptthrow() throws Exception {
        Exception except = new Exception();
        throw except;
    }
}
