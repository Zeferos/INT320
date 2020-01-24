/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Arrays;

/**
 *
 * @author int320
 */
public class Sorting {

    public static void main(String[] args) {

        int N = 100;

        int[] arr1 = new int[N];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 1000);
        }

        int[] arr2 = new int[N];
        int[] arr3 = new int[N];

        System.arraycopy(arr1, 0, arr2, 0, N);
        System.arraycopy(arr1, 0, arr3, 0, N);

//        for (int element : arr1) {
//            System.out.print(element + " ");
//        }
        long strTime = System.currentTimeMillis();

        Arrays.sort(arr1);
        System.out.println(System.currentTimeMillis() - strTime);
        
        Arrays.parallelSort(arr2);
        System.out.println(System.currentTimeMillis() - strTime);
        
        insertionSort(arr3);
        System.out.println(System.currentTimeMillis() - strTime);

//        long endTime = System.currentTimeMillis();
//        System.out.println("After Insertion Sort");
//        for (int i : arr1) {
//            System.out.print(i + " ");
//        }
//        long totalTime = endTime - strTime;
//        System.out.println("");
//        System.out.println(totalTime);
    }

    public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j - 1;
            while ((i > -1) && (array[i] > key)) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
        }
    }

    public void newArr(int nums) {
        int[] counts = new int[nums];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = (int) (Math.random() * 10);
        }

        for (int element : counts) {
            System.out.print(element);
        }
    }

}
