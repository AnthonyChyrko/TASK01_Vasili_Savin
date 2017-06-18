package com.epam.Task0110;

import java.util.Arrays;

public class Exs10 {
    private int size;
    private int[][] arr;

    public Exs10(int size){
        if (size < 0){
            throw new IllegalArgumentException("Size can not be a negative number");
        }
        this.size = size;
    }

    private void generate(){
        for (int i = 0; i < arr.length; i++){
            if (i%2 == 0){
                for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = j + 1;
                }
            }else{
                for (int j = 0; j < arr[i].length; j++){
                    arr[i][j] = arr[i].length - j;
                }
            }
        }
    }

    public void print(){
        if (arr == null){
            arr = new int[size][size];
            generate();
        }
        for(int[] i : arr){
            System.out.println(Arrays.toString(i));
        }

    }

    public static void main(String[] args) {
        Exs10 array = new Exs10(11);
        array.print();
    }
}
