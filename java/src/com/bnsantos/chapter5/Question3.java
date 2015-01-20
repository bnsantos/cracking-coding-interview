package com.bnsantos.chapter5;

public class Question3 {

	public static int getNext(int n){
		int c=n;
		int c0=0;
		int c1=0;
		while(((c&1)==0)&&(c!=0)){
			c0++;
			c>>=1;
		}
		while((c&1)==1){
			c1++;
			c>>=1;
		}
		if(c0+c1==31||c0+c1==0){
			return -1;
		}
		
		int p=c0+c1;
		n|=(1<<p); //flip rightmost non-trailing zero
		n&=~((1<<p)-1); //clear all bits to the right of p
		n|=(1<<(c1-1))-1;//Insert (c1-1) ones on the right
		return n;
	}
	
	public static int getPrev(int n){
		int temp=n;
		int c0=0;
		int c1=0;
		while((temp&1) ==1){
			c1++;
			temp>>=1;
		}
		if(temp==0) return -1;
		while(((temp&1)==0)&&(temp!=0)){
			c0++;
			temp>>=1;
		}
		int p=c0+c1-1;//position of rightmost non-trailing one
		n&=((~0)<<(p+1));//clears from bit p onwards
		int mask = (1<<(c1+1))-1; 
		n|=mask<<(c0-c1);
		return n;
	}
}
