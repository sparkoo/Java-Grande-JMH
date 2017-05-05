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
 *  Last Modified: 26 January 1999
 *
 *
 ***************************************************************************
 *  			Java Benchmarks
 *
 *  These benchmarks complement the Java Grande Benchmarks and utilise
 *  the timing and result reporting framework provided with them.
 *
 *  Section1a includes extra low level benchmarks, Section2a includes extra
 *  kernel benchmarks and util includes commonly used code such as for
 *  printing header information
 *
 *  Jesudas Mathew (jm@cs.adelaide.edu.au)
 ***************************************************************************
 *
 *  The tests in this class measure the performance of looping constructs
 */

package cz.sparko.javagrandejmh.v2.section1;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@State(Scope.Benchmark)
public class LoopBench {

    private static final int INITSIZE = 10000;

    @Benchmark
    public void forLoop(Blackhole bh) {
        for (int i = 0; i < INITSIZE; i++) {
            bh.consume(i);
        }
    }

    @Benchmark
    public void reverseForLoop(Blackhole bh) {
        for (int i = INITSIZE; i > 0; i--) {
            bh.consume(i);
        }
    }

    @Benchmark
    public void whileLoop(Blackhole bh) {
        int i = 0;
        while (i++ < INITSIZE) {
            bh.consume(i);
        }
    }
}
