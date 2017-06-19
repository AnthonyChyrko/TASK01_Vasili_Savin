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
    
    public static int[] generateArray(int size){		
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*100);
		}
		return arr;
	}
    
    public static boolean areParamsCorrect(int size1, int size2, int k){
    	boolean flag = true;
    	if( size1 <= 0){
    		System.err.println("Size1 must be a positive number");
    		flag = false;
    	}
    	
    	if( size1 <= 0){
    		System.err.println("Size2 must be a positive number");
    		flag = false;
    	}
    	
    	if(k < 0){
    		System.err.println("'k' must be not a negative number");
    		flag = false;
    	}
    	
    	if (k > size1){
    		System.err.println("'k' must be less than size1");
    		flag = false;
    	}
    	
    	return flag;
    }
    
    public static void main(String[] args) {
    	if(args.length < 3){
    		System.err.println("ERROR! Enter 3 parameters with type \"int\"");
    	}else{
    		if(args.length > 3){
    			System.err.println("WARNING! There are more than 3 parameters. Only the first 3 will be used.");
    		}
    		
    		try{
    			int size1 = Integer.parseInt(args[0]);
    			int size2 = Integer.parseInt(args[1]);
    			int k = Integer.parseInt(args[2]);
    			
    			if(areParamsCorrect(size1, size2, k)){
    				int[] arr1 = generateArray(size1);
    				int[] arr2 = generateArray(size2);
    				System.out.println(Arrays.toString(arr1));
    				System.out.println(Arrays.toString(arr2));
    				System.out.println("k = " + k);
    				System.out.println(Arrays.toString(join(arr1, arr2, k)));
    			}	        
    	          	        
    			
    		}catch(NumberFormatException e){
    			System.err.println("ERROR! One of parameters can not be converted to double.");
    		}
    	}        
        
    }
}
