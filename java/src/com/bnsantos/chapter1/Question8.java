package com.bnsantos.chapter1;

public class Question8 {
	public static boolean isRotation(String s1, String s2){
		if(s1.length()==s2.length()&&s1.length()!=0){
			return isSubstring(s1+s1, s2);
		}else{
			return false;
		}
	}
	
	public static boolean isSubstring(String big, String small) {
		if (big.indexOf(small) >= 0) {
			return true;
		} else {
			return false;
		}
	}
}
