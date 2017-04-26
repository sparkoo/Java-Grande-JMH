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
 *    Original version of this code by DHPC Group, Univ. of Adelaide       *
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
 */

package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@SuppressWarnings("ALL")
@State(Scope.Benchmark)
public class CreateBenchMulti {
    private static final int INITSIZE = 10000;

    @Param({"1", "2", "4", "8", "16", "32", "64", "128"})
    public int certainty;

    @Benchmark
    public int[] arrayInt() {
        int n = certainty;
        int j[] = new int[n];

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            j = new int[n]; j = new int[n]; j = new int[n]; j = new int[n];
            j = new int[n]; j = new int[n]; j = new int[n]; j = new int[n];
            j = new int[n]; j = new int[n]; j = new int[n]; j = new int[n];
            j = new int[n]; j = new int[n]; j = new int[n]; j = new int[n];
            /* @formatter:on */
        }

        return j;
    }

    @Benchmark
    public long[] arrayLong() {
        int n = certainty;
        long k[] = new long[n];

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            k = new long[n]; k = new long[n]; k = new long[n]; k = new long[n];
            k = new long[n]; k = new long[n]; k = new long[n]; k = new long[n];
            k = new long[n]; k = new long[n]; k = new long[n]; k = new long[n];
            k = new long[n]; k = new long[n]; k = new long[n]; k = new long[n];
            /* @formatter:on */
        }

        return k;
    }

    @Benchmark
    public float[] arrayFloat() {
        int n = certainty;
        float c[] = new float[n];

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            c = new float[n]; c = new float[n]; c = new float[n]; c = new float[n];
            c = new float[n]; c = new float[n]; c = new float[n]; c = new float[n];
            c = new float[n]; c = new float[n]; c = new float[n]; c = new float[n];
            c = new float[n]; c = new float[n]; c = new float[n]; c = new float[n];
            /* @formatter:on */
        }

        return c;
    }

    @Benchmark
    public Object[] arrayObject() {
        int n = certainty;
        Object d[] = new Object[n];

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            d=new Object[n]; d=new Object[n]; d=new Object[n]; d=new Object[n];
            d=new Object[n]; d=new Object[n]; d=new Object[n]; d=new Object[n];
            d=new Object[n]; d=new Object[n]; d=new Object[n]; d=new Object[n];
            d=new Object[n]; d=new Object[n]; d=new Object[n]; d=new Object[n];
            /* @formatter:on */
        }

        return d;
    }
}
