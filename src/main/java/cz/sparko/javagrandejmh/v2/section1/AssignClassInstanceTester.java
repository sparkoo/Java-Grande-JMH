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

class AssignClassInstanceTester {
    private int c1 = 1, c2 = 2, c3 = 3, c4 = 4, d[] = {1, 2, 3, 4};

    int sameScalarInstance() {
        for (int i = 0; i < Assign.INITSIZE; i++) {
            c1 = c2;
            c2 = c3;
            c3 = c4;
            c4 = c1;
            c1 = c2;
            c2 = c3;
            c3 = c4;
            c4 = c1;
            c1 = c2;
            c2 = c3;
            c3 = c4;
            c4 = c1;
            c1 = c2;
            c2 = c3;
            c3 = c4;
            c4 = c1;
        }

        return c1;
    }

    int[] sameArrayInstance() {
        for (int i = 0; i < Assign.INITSIZE; i++) {
            d[0] = d[1];
            d[1] = d[2];
            d[2] = d[3];
            d[3] = d[0];
            d[0] = d[1];
            d[1] = d[2];
            d[2] = d[3];
            d[3] = d[0];
            d[0] = d[1];
            d[1] = d[2];
            d[2] = d[3];
            d[3] = d[0];
            d[0] = d[1];
            d[1] = d[2];
            d[2] = d[3];
            d[3] = d[0];
            d[0] = d[1];
            d[1] = d[2];
            d[2] = d[3];
            d[3] = d[0];
            d[0] = d[1];
            d[1] = d[2];
            d[2] = d[3];
            d[3] = d[0];
            d[0] = d[1];
            d[1] = d[2];
            d[2] = d[3];
            d[3] = d[0];
            d[0] = d[1];
            d[1] = d[2];
            d[2] = d[3];
            d[3] = d[0];
        }

        return d;
    }
}
