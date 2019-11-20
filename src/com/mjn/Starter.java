package com.mjn;

import java.util.Arrays;

public class Starter {

    public static void main(String[] args) {
	NumberToBinary toBinary = new NumberToBinary();

	int passedNumber = 1041;

	long binaryNumber = Long.parseLong(toBinary.intToBinary(passedNumber));
        System.out.println(binaryNumber);

        int[] tempArr = toBinary.stringToArray(toBinary.intToBinary(passedNumber));
        System.out.println(Arrays.toString(tempArr));

        System.out.println(toBinary.binaryGap(tempArr));


    }
}
