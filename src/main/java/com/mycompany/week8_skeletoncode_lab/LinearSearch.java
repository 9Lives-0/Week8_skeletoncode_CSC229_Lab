/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) return i;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] data = {9, 3, 7, 1, 4};
        int key1 = 7, key2 = 8;
        System.out.println("LinearSearch key " + key1 + " -> index " + search(data, key1));
        System.out.println("LinearSearch key " + key2 + " -> index " + search(data, key2));
        System.out.println("Time: O(n) worst/avg, Space: O(1)");
    }

}
