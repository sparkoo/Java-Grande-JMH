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

@SuppressWarnings("ALL")
@State(Scope.Benchmark)
public class MethodBench {

    private static final int INITSIZE = 100000;

    static int k = 0;

    MethodTester mt = new MethodTester();
    MethodTester2 mt2 = new MethodTester2();

    //TODO: beaten by optimizations in ojdk9
    @Benchmark
    public void sameInstance() {
        for (int i = 0; i < INITSIZE; i++) {
            instance_method();
        }
    }

    @Benchmark
    public void sameSynchronizedInstance() {
        for (int i = 0; i < INITSIZE; i++) {
            synch_instance_method();
        }
    }

    //TODO: beaten by optimizations in ojdk9
    @Benchmark
    public void sameFinalInstance() {
        for (int i = 0; i < INITSIZE; i++) {
            final_instance_method();
        }
    }

    //TODO: beaten by optimizations in ojdk9
    @Benchmark
    public void sameClass() {
        for (int i = 0; i < INITSIZE; i++) {
            class_method();
        }
    }

    @Benchmark
    public void sameSynchronizedClass() {
        for (int i = 0; i < INITSIZE; i++) {
            synch_class_method();
        }
    }

    //TODO: beaten by optimizations in ojdk9
    @Benchmark
    public void otherInstance() {
        for (int i = 0; i < INITSIZE; i++) {
            mt.instance_method();
        }
    }

    //TODO: beaten by optimizations in ojdk9
    @Benchmark
    public void otherInstanceOfAbstract() {
        for (int i = 0; i < INITSIZE; i++) {
            mt2.instance_method();
        }
    }

    //TODO: beaten by optimizations in ojdk9
    @Benchmark
    public void otherClass() {
        for (int i = 0; i < INITSIZE; i++) {
            MethodTester.class_method();
        }
    }


    public void instance_method() {
        k++;
    }

    synchronized public void synch_instance_method() {
        k++;
    }

    private final void final_instance_method() {
        k++;
    }

    private static void class_method() {
        k++;
    }

    private synchronized static void synch_class_method() {
        k++;
    }

    static class MethodTester {
        static int k = 0;

        void instance_method() {
            k++;
        }

        static void class_method() {
            k++;
        }

    }

    static abstract class AbstractMethodTester {
        static int k = 0;

        public abstract void instance_method();
    }

    static class MethodTester2 extends AbstractMethodTester {
        public void instance_method() {
            k++;
        }

    }
}
