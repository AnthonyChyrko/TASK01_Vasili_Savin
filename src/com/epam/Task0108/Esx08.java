package com.epam.Task0108;

import java.util.Arrays;

public class Esx08 {
	public static int[] generateArray(int size){		
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100);
		}
		return arr;
	}
	
    public static int sum(int[] arr, int k){
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
    
    public static boolean areParamsCorrect(int size, int k){
    	boolean flag = true;
    	if(size < 0){
    		System.err.println("'size' must be not a negative number");
    		flag = false;
    	}
    	
    	if(k <= 0){
    		System.err.println("'k' must be a positive number");
    		flag = false;
    	}
    	return flag;
    }
    
    public static void main(String[] args) {
    	if(args.length < 2){
    		System.err.println("ERROR! Enter 2 parameters with type \"int\"");
    	}else{
    		if(args.length > 2){
    			System.err.println("WARNING! There are more than 2 parameters. Only the first 2 will be used.");
    		}
    		
    		try{
    			int size = Integer.parseInt(args[0]);
    	        int k = Integer.parseInt(args[1]);
    	        if(areParamsCorrect(size, k)){
    	        	int[] arr = generateArray(size);
    	        	System.out.println(Arrays.toString(arr));
        	        System.out.println("k = " + k);
        	        System.out.println("Sum = " + sum(arr, k));
    	        }   	        
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to integer.");
    		}
    	}      
        
        
    }
}
