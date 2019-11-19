package com.mjn;

import java.util.Arrays;

public class Starter {

    public static void main(String[] args) {
	NumberToBinary toBinary = new NumberToBinary();

	long binaryNumber = Long.parseLong(toBinary.intToBinary(1041));
        System.out.println(binaryNumber);

        int[] tempArr = toBinary.stringToArray(toBinary.intToBinary(1041));
        System.out.println(Arrays.toString(tempArr));

        System.out.println(toBinary.binaryGap(tempArr));
    }
}
