package com.demo;

public class Solution {
	public static void main(String[] args) {
		int arr[]= {5,9,30,10,2,1};

		
		int highest=arr[0];
		int secondHighest=0;
		
	     for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > highest) {
	                secondHighest = highest;  
	                highest = arr[i]; 
	            } else if (arr[i] > secondHighest && arr[i] != highest) {
	                secondHighest = arr[i];  
	            }
	        }
			//System.out.println(highest);
			System.out.println(secondHighest);
		}
	}

