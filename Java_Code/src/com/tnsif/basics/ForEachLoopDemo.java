package com.tnsif.basics;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = new int[]{10, 20, 30, 40, 50};

	        for(int i : a) {
	            System.out.println(i);
	        }

	        char[] ch = new char[]{'j', 'a', 'v', 'a'};

	        for(char c : ch) {
	            System.out.print(c);
	        }

	        System.out.println(" ");
	        String[] s1 = new String[]{"Java", "programming", "learning"};

	        for(String s : s1) {
	            System.out.print(s + " ");
	        }

	}

}
