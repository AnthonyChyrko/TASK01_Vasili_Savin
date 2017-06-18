package com.epam.Task0109;

import java.util.Arrays;

public class Exs09 {
    public static int[] join(int[] arr1, int[] arr2, int k){
        if (k > arr1.length){
            throw new IllegalArgumentException("k should be less than arr1 size");
        }
        int[] arr = new int[arr1.length + arr2.length];

        for (int i = 0; i < k; i++){
            arr[i] = arr1[i];
        }

        for (int i = k; i < (k + arr2.length); i++){
            arr[i] = arr2[i-k];
        }

        for (int i = k + arr2.length; i < arr.length; i++){
            arr[i] = arr1[i-arr2.length];
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {10, 11, 12, 13};
        int k = 0;
        System.out.println(Arrays.toString(join(arr1, arr2, k)));
    }
}
