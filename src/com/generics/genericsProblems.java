package com.generics;

public class genericsProblems {
public static void main(String[] args) {
			
		String l= "apple", m = "banana", n = "carrot"; 
	    
	    findMaximum(l,m,n);
	}
	 
			private static void findMaximum(String l, String m, String n) {
				String max=l;
				if(m.compareTo(l) > 0) {
					max = m;
				}
				if(n.compareTo(max) > 0) {
					max = n;
					System.out.println(max);
	          }
			}
}


