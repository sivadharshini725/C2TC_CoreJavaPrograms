package com.tnsif.basics;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteMax = 127;
        byte byteMin = -128;
        System.out.println("Min range of byte is" + byteMin + "Max range of byte is " + byteMax);
        short shortMax = 32767;
        short shortMin = Short.MIN_VALUE;
        System.out.println("Minshort range of byte is" + shortMin + "Maxshort range of byte is " + shortMax);
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        System.out.println("Minint range of byte is" + minInt + "Maxint range of byte is " + maxInt);
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        System.out.println("Minlong range of byte is" + minLong + "Maxlong range of byte is " + maxLong);
        float f = 3234.1414F;
        double d = (double)3456.1414F;
        System.out.println("float value is " + f + " double value is " + d);
        boolean flag = false;
        System.out.println("boolean value is " + flag);

	}

}
