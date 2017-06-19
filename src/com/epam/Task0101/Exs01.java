package com.epam.Task0101;

public class Exs01 {
    public static boolean isStatementCorrect(int i){
        char[] ch = String.valueOf(i).toCharArray();

        int[] intArr = new int[ch.length];

        for (int j = 0; j < ch.length; j++){
            intArr[j] = Character.getNumericValue(ch[j]);
        }

        return (intArr[0] + intArr[1]) == (intArr[2] + intArr[3]);
    }

    public static void main(String[] args) {
    	if (args.length == 0) {
            System.err.println("ERROR! Enter parameter consisting of 4 figures.");
        }else{
        	String str = args[0];
        	if(str.length() < 4){
        		System.err.println("ERROR! The first parameter must consist of 4 figures");
        	}else{
        		if(args.length > 1 || str.length() > 4){
        			System.err.println("WARNING! There are must be one parameter made of 4 figures. Only first 4 figures from the first parameter will be used.");
        		}
        		
        		try{
        			int i = Integer.parseInt(str);
        			System.out.println(isStatementCorrect(i));       
        		}catch(NumberFormatException e){
        			System.err.println("ERROR! Parameter can not be converted to integer.");
        		}
        	}        		
        }    	
        
    }
}
