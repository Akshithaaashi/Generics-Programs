package com.generics;

public class maxOf3Integers {
public static void main(String[] args) {
	
		Float x=3.6f, y=5.6f, z=9.5f;
	
	    findMaximum(x,y,z);
	   
	}
	 
		private static void findMaximum(Float x, Float y, Float z) {
			Float max=x;
			if(y.compareTo(x) > 0) {
				max = y;
			}
			if(z.compareTo(max) > 0) {
				max = z;
				System.out.println(max);
		}
		
			
     }

}
