package com.tnsif.basics;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 50;
        int b = 30;
        int c = 70;
        System.out.println("The largest number is");
        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (c > b) {
            System.out.println(c);
        } else {
            System.out.println(b);
        }
	}

}
