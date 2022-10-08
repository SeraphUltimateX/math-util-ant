/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.methori.mathutil.main;

import com.methori.mathutil.core.MathUtil;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(">>> main() executing...");
        tryTDDFist();
//        testFactorialGivenWrongArgumentThrowsException();
    }

    public static void tryTDDFist() {
        long expected, actual;
        //Test case #1
        //Input: n = 1;
        //Call: getFactorial(1)
        //Expect: 1
        expected = 1;
        actual = MathUtil.getFactorial(1);
        System.out.println("Test 1! | Status "
                + "Expected: " + expected
                + " | Actual " + actual
                + " => RESULT: " + ((expected == actual) ? "PASSED" : "FAILED"));

        //Test case #2
        //Input: n = 2;
        //Call: getFactorial(2)
        //Expect: 2
        expected = 2;
        actual = MathUtil.getFactorial(2);
        System.out.println("Test 2! | Status "
                + "Expected: " + expected
                + " | Actual " + actual
                + " => RESULT: " + ((expected == actual) ? "PASSED" : "FAILED"));
    }

    public static void testFactorialGivenWrongArgumentThrowsException() {
        System.out.println("Expect to see: Illegal Argument Exception");
        MathUtil.getFactorial(-5);
    }

}
