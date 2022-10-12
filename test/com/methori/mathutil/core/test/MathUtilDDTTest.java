/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.methori.mathutil.core.test;

import com.methori.mathutil.core.MathUtil;
//import java.util.ArrayList;
//import java.util.List;
//import jdk.javadoc.internal.doclets.toolkit.util.Utils.Pair;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //JUnit allows only 1 method to be the data definition    
    //Determination unclear, seems to be based on method identifier or signature
//    @Parameterized.Parameters
    public static int[][][] z() {
//        List l = new ArrayList();
//        l.add(new Pair(0, 1));
//        l.add(new Pair(1, 1));
//        l.add(new Pair(2, 2));
//        l.add(new Pair(3, 6));
//        l.add(new Pair(4, 24));
//        l.add(new Pair(5, 120));

//        int[][][] a = {{{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}}};
//
//        Integer[][] a = {
//            {1, 0},
//            {1, 1},
//            {2, 2},
//            {6, 3},
//            {24, 4},
//            {120, 5}
//        };
//
        int[][][] a = {
            {{1}, {0}},
            {{1}, {1}},
            {{2}, {2}},
            {{6}, {3}},
            {{24}, {4}},
            {{120}, {5}}
        };
        //Parameterized takes the 1st-order array as an array of rows,
        //the 2nd-order array as an array of columns (i.e., parameters),
        //then looks for reference objects to take as paramaters
        //=> An array of primitives is considered an array of 1 reference
        //  -> Recognizes 1 parameter
        return a;
    }

    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {1, 0},
            {1, 1},
            {2, 2},
            {6, 3},
            {24, 4},
            {120, 5},
            {720, 6}
        };
    }

    @Parameterized.Parameter(value = 0)
    public long expected;
    @Parameterized.Parameter(value = 1)
    public int n;

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
