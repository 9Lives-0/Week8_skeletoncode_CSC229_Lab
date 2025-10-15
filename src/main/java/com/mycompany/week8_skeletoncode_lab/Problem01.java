/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
        if (n < 2) return 0L;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) isPrime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int multiple = p * p; multiple <= n; multiple += p) {
                    isPrime[multiple] = false;
                }
            }
        }

        long sum = 0L;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) sum += i;
        }
        return sum;


    }
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 30;
        System.out.println("Sum of primes up to " + n1 + " = " + getSumOfPrimes(n1));
        System.out.println("Sum of primes up to " + n2 + " = " + getSumOfPrimes(n2));
        System.out.println("Time: O(n log log n), Space: O(n)");
    }

}
