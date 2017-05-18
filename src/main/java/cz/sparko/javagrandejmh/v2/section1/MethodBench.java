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
 * Original version of parts of this code by DHPC Group, Univ. of Adelaide *
 *                    See copyright notice below.                          *
 *                                                                         *
 *                                                                         *
 *      This version copyright (c) The University of Edinburgh, 1999.      *
 *                         All rights reserved.                            *
 *                                                                         *
 **************************************************************************/
/*
 *  Copyright (C) 1998, University of Adelaide, under its participation
 *  in the Advanced Computational Systems Cooperative Research Centre
 *  Agreement.
 *
 *  THIS SOFTWARE IS MADE AVAILABLE, AS IS, AND THE UNIVERSITY
 *  OF ADELAIDE DOES NOT MAKE ANY WARRANTY ABOUT THE SOFTWARE, ITS
 *  PERFORMANCE, ITS MERCHANTABILITY OR FITNESS FOR ANY PARTICULAR
 *  USE, FREEDOM FROM ANY COMPUTER DISEASES OR ITS CONFORMITY TO ANY
 *  SPECIFICATION. THE ENTIRE RISK AS TO QUALITY AND PERFORMANCE OF
 *  THE SOFTWARE IS WITH THE USER.
 *
 *  Copyright of the software and supporting documentation is owned by the
 *  University of Adelaide, and free access is hereby granted as a license
 *  to use this software, copy this software and prepare derivative works
 *  based upon this software.  However, any distribution of this software
 *  source code or supporting documentation or derivative works (source
 *  code and supporting documentation) must include this copyright notice
 *  and acknowledge the University of Adelaide.
 *
 *
 *  Developed by: Distributed High Performance Computing (DHPC) Group
 *                Department of Computer Science
 *                The University of Adelaide
 *                South Australia 5005
 *                Tel +61 8 8303 4519, Fax +61 8 8303 4366
 *                http://dhpc.adelaide.edu.au
 *  Last Modified: 26 January 1999
 *
 *
 */

package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

@SuppressWarnings("ALL")
@State(Scope.Benchmark)
public class MethodBench implements Section1Bench {

    private static final int INITSIZE = 100000;

    static int k = 0;

    MethodTester mt = new MethodTester();
    MethodTester2 mt2 = new MethodTester2();

    @Benchmark
    public void sameInstance(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(instance_method());
        }
    }

    @Benchmark
    public void sameSynchronizedInstance(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(synch_instance_method());
        }
    }

    @Benchmark
    public void sameFinalInstance(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(final_instance_method());
        }
    }

    @Benchmark
    public void sameClass(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(class_method());
        }
    }

    @Benchmark
    public void sameSynchronizedClass(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(synch_class_method());
        }
    }

    @Benchmark
    public void otherInstance(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(mt.instance_method());
        }
    }

    @Benchmark
    public void otherInstanceOfAbstract(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(mt2.instance_method());
        }
    }

    @Benchmark
    public void otherClass(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(MethodTester.class_method());
        }
    }


    public int instance_method() {
        return k++;
    }

    synchronized public int synch_instance_method() {
        return k++;
    }

    private final int final_instance_method() {
        return k++;
    }

    private static int class_method() {
        return k++;
    }

    private synchronized static int synch_class_method() {
        return k++;
    }

    static class MethodTester {
        static int k = 0;

        int instance_method() {
            return k++;
        }

        static int class_method() {
            return k++;
        }

    }

    static abstract class AbstractMethodTester {
        static int k = 0;

        public abstract int instance_method();
    }

    static class MethodTester2 extends AbstractMethodTester {
        public int instance_method() {
            return k++;
        }

    }
}
