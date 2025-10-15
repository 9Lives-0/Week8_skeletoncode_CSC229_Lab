/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] sorted = {-5, -1, 0, 2, 3, 4, 7, 9, 11, 15};
        int key1 = 7, key2 = 6;
        System.out.println("BinarySearch key " + key1 + " -> index " +
                runBinarySearchIteratively(sorted, key1, 0, sorted.length - 1));
        System.out.println("BinarySearch key " + key2 + " -> index " +
                runBinarySearchIteratively(sorted, key2, 0, sorted.length - 1));
        System.out.println("Time: O(log n), Space: O(1)");
    }


}
