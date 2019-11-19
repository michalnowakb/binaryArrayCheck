package com.mjn;

public class NumberToBinary {

    public String intToBinary(int n)
    {
        String s = "";
        while (n > 0)
        {
            s =  ( (n % 2 ) == 0 ? "0" : "1") + s;
            n = n / 2;
        }
        return s;
    }

    public int[] stringToArray(String binary){
        int length = binary.length();
        int[] array = new int[length];


        for(int i = 0; i < array.length - 1; i++) {
            array[i] = Integer.parseInt(String.valueOf(binary.charAt(i)));
        }
        return array;
    }

    public int binaryGap(int[] array){
        int gapCounter = 0;
        int highestGap = 0;
        int length = array.length -1;
        for(int i = 0; i < length; i++){

            if(array[i] == 0){
                gapCounter++;
                if(gapCounter > highestGap){
                    highestGap = gapCounter;
                    gapCounter = 0;
                }
            } else if(array[i] == 1){
                if(gapCounter > highestGap){
                    highestGap = gapCounter;
                    gapCounter = 0;
                }
            }
        }


        return highestGap;
    }

}
