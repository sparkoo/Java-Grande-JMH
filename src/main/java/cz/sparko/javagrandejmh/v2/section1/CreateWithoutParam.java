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

@SuppressWarnings("ALL")
public class CreateWithoutParam {
    private static final int INITSIZE = 10000;

    @Benchmark
    public Object objectBase() {
        Object o = new Object();

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            o = new Object(); o = new Object(); o = new Object(); o = new Object();
            o = new Object(); o = new Object(); o = new Object(); o = new Object();
            o = new Object(); o = new Object(); o = new Object(); o = new Object();
            o = new Object(); o = new Object(); o = new Object(); o = new Object();
            /* @formatter:on */
        }

        return o;
    }

    @Benchmark
    public A objectSimple() {
        A a = new A();

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            a = new A(); a = new A(); a = new A(); a = new A();
            a = new A(); a = new A(); a = new A(); a = new A();
            a = new A(); a = new A(); a = new A(); a = new A();
            a = new A(); a = new A(); a = new A(); a = new A();
            /* @formatter:on */
        }

        return a;
    }

    @Benchmark
    public AA objectSimpleConstructor() {
        AA aa = new AA();

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            aa = new AA(); aa = new AA(); aa = new AA(); aa = new AA();
            aa = new AA(); aa = new AA(); aa = new AA(); aa = new AA();
            aa = new AA(); aa = new AA(); aa = new AA(); aa = new AA();
            aa = new AA(); aa = new AA(); aa = new AA(); aa = new AA();
            /* @formatter:on */
        }

        return aa;
    }

    @Benchmark
    public A1 objectSimple1Field() {
        A1 a1 = new A1();

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            a1 = new A1(); a1 = new A1(); a1 = new A1(); a1 = new A1();
            a1 = new A1(); a1 = new A1(); a1 = new A1(); a1 = new A1();
            a1 = new A1(); a1 = new A1(); a1 = new A1(); a1 = new A1();
            a1 = new A1(); a1 = new A1(); a1 = new A1(); a1 = new A1();
            /* @formatter:on */
        }

        return a1;
    }

    @Benchmark
    public A2 objectSimple2Field() {
        A2 a2 = new A2();

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            a2 = new A2(); a2 = new A2(); a2 = new A2(); a2 = new A2();
            a2 = new A2(); a2 = new A2(); a2 = new A2(); a2 = new A2();
            a2 = new A2(); a2 = new A2(); a2 = new A2(); a2 = new A2();
            a2 = new A2(); a2 = new A2(); a2 = new A2(); a2 = new A2();
            /* @formatter:on */
        }

        return a2;
    }

    @Benchmark
    public A4 objectSimple4Field() {
        A4 a4 = new A4();

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            a4 = new A4(); a4 = new A4(); a4 = new A4(); a4 = new A4();
            a4 = new A4(); a4 = new A4(); a4 = new A4(); a4 = new A4();
            a4 = new A4(); a4 = new A4(); a4 = new A4(); a4 = new A4();
            a4 = new A4(); a4 = new A4(); a4 = new A4(); a4 = new A4();
            /* @formatter:on */
        }

        return a4;
    }

    @Benchmark
    public A4F objectSimple4fField() {
        A4F a4f = new A4F();

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            a4f = new A4F(); a4f = new A4F(); a4f = new A4F(); a4f = new A4F();
            a4f = new A4F(); a4f = new A4F(); a4f = new A4F(); a4f = new A4F();
            a4f = new A4F(); a4f = new A4F(); a4f = new A4F(); a4f = new A4F();
            a4f = new A4F(); a4f = new A4F(); a4f = new A4F(); a4f = new A4F();
            /* @formatter:on */
        }

        return a4f;
    }

    @Benchmark
    public A4L objectSimple4LField() {
        A4L a4l = new A4L();

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            a4l = new A4L(); a4l = new A4L(); a4l = new A4L(); a4l = new A4L();
            a4l = new A4L(); a4l = new A4L(); a4l = new A4L(); a4l = new A4L();
            a4l = new A4L(); a4l = new A4L(); a4l = new A4L(); a4l = new A4L();
            a4l = new A4L(); a4l = new A4L(); a4l = new A4L(); a4l = new A4L();
            /* @formatter:on */
        }

        return a4l;
    }

    @Benchmark
    public B objectSublclass() {
        B b = new B();

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            b = new B(); b = new B(); b = new B(); b = new B();
            b = new B(); b = new B(); b = new B(); b = new B();
            b = new B(); b = new B(); b = new B(); b = new B();
            b = new B(); b = new B(); b = new B(); b = new B();
            /* @formatter:on */
        }

        return b;
    }

    @Benchmark
    public AB objectComplex() {
        AB ab = new AB();

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            ab = new AB(); ab = new AB(); ab = new AB(); ab = new AB();
            ab = new AB(); ab = new AB(); ab = new AB(); ab = new AB();
            ab = new AB(); ab = new AB(); ab = new AB(); ab = new AB();
            ab = new AB(); ab = new AB(); ab = new AB(); ab = new AB();
            /* @formatter:on */
        }

        return ab;
    }

    @Benchmark
    public ABC objectComplexConstructor() {
        ABC abc = new ABC();

        for (int i = 0; i < INITSIZE; i++) {
            /* @formatter:off */
            abc = new ABC(); abc = new ABC(); abc = new ABC(); abc = new ABC();
            abc = new ABC(); abc = new ABC(); abc = new ABC(); abc = new ABC();
            abc = new ABC(); abc = new ABC(); abc = new ABC(); abc = new ABC();
            abc = new ABC(); abc = new ABC(); abc = new ABC(); abc = new ABC();
            /* @formatter:on */
        }

        return abc;
    }
}

class A {
}

class AA {
    public AA() {
    }
}

class A1 {
    int a;
}

class A2 {
    int a, b;
}

class A4 {
    int a, b, c, d;
}

class A4L {
    long a, b, c, d;
}

class A4F {
    float a, b, c, d;
}

class AB {
    A a = new A();
}

class ABC {
    A a;

    public ABC() {
        a = new A();
    }
}

class B extends A {
}