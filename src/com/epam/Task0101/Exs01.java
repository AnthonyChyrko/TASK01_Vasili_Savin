package com.epam.Task0101;

public class Exs01 {
    public static boolean isStatementCorrect(int i){
        char[] ch = String.valueOf(i).toCharArray();

        if (ch.length != 4){
            throw new IllegalArgumentException("Argument should be 4-digit number");
        }


        int[] intArr = new int[ch.length];

        for (int j = 0; j < ch.length; j++){
            intArr[j] = Character.getNumericValue(ch[j]);
        }

        return (intArr[0] + intArr[1]) == (intArr[2] + intArr[3]);
    }

    public static void main(String[] args) {
        int i = 1234;
        System.out.println(isStatementCorrect(i));;
    }
}
