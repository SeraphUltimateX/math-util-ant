/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.methori.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {

    public static final double PI = 3.141592653589793;

    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid input. Input must be between 0..20");
        }
        if (n < 2) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }

//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid input. Input must be between 0..20");
//        }
//
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//
//        long product = 1;
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//        return product;
//    }
}
