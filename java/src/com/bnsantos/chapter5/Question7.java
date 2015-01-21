package com.bnsantos.chapter5;

import java.util.ArrayList;

import com.bnsantos.utils.BitInteger;

public class Question7 {
	/* Create a random array of numbers from 0 to n, but skip 'missing' */
    public static ArrayList<BitInteger> initialize(int n, int missing) {
        BitInteger.INTEGER_SIZE = Integer.toBinaryString(n).length();
        ArrayList<BitInteger> array = new ArrayList<BitInteger>();
        
        for (int i = 1; i <= n; i++) {
        	array.add(new BitInteger(i == missing ? 0 : i));
        }

        // Shuffle the array once.
        for (int i = 0; i < n; i++){
            int rand = i + (int) (Math.random() * (n-i));
            array.get(i).swapValues(array.get(rand));
        }
        
        return array;
    }


    public static int findMissing(ArrayList<BitInteger> array) {
       return findMissing(array, BitInteger.INTEGER_SIZE - 1);
    }        

    private static int findMissing(ArrayList<BitInteger> input, int column) {
    	if (column < 0) { // Base case and error condition
    		return 0;
    	}
    	ArrayList<BitInteger> oneBits = new ArrayList<BitInteger>(input.size()/2);
    	ArrayList<BitInteger> zeroBits = new ArrayList<BitInteger>(input.size()/2);
        for (BitInteger t : input) {
            if (t.fetch(column) == 0) {
                zeroBits.add(t);
            } else {
                oneBits.add(t);
            }
        }
        if (zeroBits.size() <= oneBits.size()) {
        	int v = findMissing(zeroBits, column - 1);
        	System.out.print("0");
            return (v << 1) | 0;
        } else {
        	int v = findMissing(oneBits, column - 1);
        	System.out.print("1");
            return (v << 1) | 1;
        }
    }
}
