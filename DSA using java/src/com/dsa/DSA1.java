package com.dsa;

public class DSA1 {
   
	public static void main(String[] args) {
		int[] arr = {10,20,10,20,10,20,20,20,10};
		for(int i=0;i<arr.length;i++) {
			int temp = arr[i];
			int frequency = 1;
			for(int j=1;j<arr.length;j++) {
				if(temp==arr[j]) {
					arr[j] = -1;
					frequency++;
				}
			}
			if(temp != -1)
				System.out.println(temp+" occured "+frequency+" times in given array");
		}

	}
			
 } 
