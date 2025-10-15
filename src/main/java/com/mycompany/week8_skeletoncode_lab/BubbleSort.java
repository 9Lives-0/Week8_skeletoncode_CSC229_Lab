/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if (a[inner] > a[inner + 1]) {               // swap
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] data = {5, 1, 4, 2, 8, 0, -3, 7};
        bubbleSort(data, data.length);
        System.out.print("BubbleSort result: ");
        for (int v : data) System.out.print(v + " ");
        System.out.println();
        System.out.println("Time: O(n^2) average/worst, Space: O(1)");
    }


}
