package com.company;

import java.util.Arrays;

public class Decrease {

    public static void main(String[] args) {
        int n = 10;

        int[] arr = {0, 1, 7, 9, 4, 6, 5, 2, 8, 3};
        int[] arr5 = {6, 5, 2, 8, 3};
        int[] arr6 = {105, 6, 5, 2, 8, 3};
        sort(arr);
        sort(arr5);
        sort(arr6);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] array){
        int n = array.length;
        for (int j = 0; j < n; j++) {
            int indexOfMax = j;
            for (int i = j; i < n; i++) {
                if (array[i] > array[indexOfMax]) {
                    indexOfMax = i;
                }
            }
            int buf = array[j];
            array[j] = array[indexOfMax];
            array[indexOfMax] = buf;
        }
    }
}


