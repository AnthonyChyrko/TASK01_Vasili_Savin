package com.epam.Task0108;

public class Esx08 {
    public static int sum(int[] arr, int k){
        if(k <= 0 ){
            throw new IllegalArgumentException("k should be a positive number");
        }

        int sum = 0;

        for (int i : arr){
            if (i < 0){
                throw new IllegalArgumentException("elements of array should be a positive number");
            }

            if (i%k == 0){
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        System.out.println(sum(arr, k));
    }
}
