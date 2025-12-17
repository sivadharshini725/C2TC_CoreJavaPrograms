package com.tnsif.basics;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		char x = 'l';
        switch (x) {
        case 'D':
        case 'd':
            System.out.println(x + " is a Digit");
            break;
        case 'L':
        case 'l':
            System.out.println(x + " is a Letter");
            break;
        case 'S':
        case 's':
            System.out.println(x + " is Special Symbol");
        default:
            System.out.println(x + " is other than letter, digit, space or special symbol ");
            break;
        case 'W':
        case 'w':
            System.out.println(x + " is White Space");
    }

		

	}

}
