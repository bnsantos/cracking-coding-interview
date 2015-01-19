package com.bnsantos.chapter5;

public class Question1 {
	public static int updateBits(int n, int m, int i, int j){
		int ones = ~0;
		int left = ones << (j+1), right = ((1<<i)-1);
		int mask = left|right;
		int nClear = n&mask;
		int mShifted = m<<i;
		return nClear|mShifted;
	}
}
