package com.bnsantos.chapter5;

public class Question6 {
	public static int swapOddEvenBits(int x){
		return (((x&0b10101010)>>1)|((x&0b01010101)<<1));
	}
}
