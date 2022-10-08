/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.methori.mathutil.core.test;

import com.methori.mathutil.core.MathUtil;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author Admin
 */
public class MathUtilTest {

//    @Test
//    public void tryJUnitComparison() {
//        Assert.assertEquals(70, 70);
//    }
//    
//    @Test
//    public void tryJUnitComparison2() {
//        Assert.assertEquals(70, 798);
//    }
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
//            System.out.println("Expect to see: Illegal Argument Exception");
        System.out.println(">>>Class is: " + Integer.class);
        Integer a = Integer.valueOf("10001", 2);
        System.out.println(a.getClass().getName());

        MathUtil.getFactorial(-5);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {

        //Test case #1: n = 0;  EXPECTED = 1
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);

        //Test case #2: n = 1; EXPECTED = 1
        Assert.assertEquals(1, MathUtil.getFactorial(1));

        //Test case #3: n = 2; EXPECTED = 2
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {

        //Test case #4: n = 3; EXPECTED = 6
        Assert.assertEquals(6, MathUtil.getFactorial(3));

        //Test case #5: n = 4; EXPECTED = 24
        Assert.assertEquals(24, MathUtil.getFactorial(4));

        //Test case #6: n = 5; EXPECTED = 24
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }
}
