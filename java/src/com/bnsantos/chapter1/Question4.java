package com.bnsantos.chapter1;

public class Question4 {
	public static String replaceSpaces(char[] sentence, int lenght){
		StringBuffer replaced = new StringBuffer();
		for(int i=0;i<sentence.length;i++){
			if(sentence[i]==' '){
				replaced.append('%');
				replaced.append('2');
				replaced.append('0');
			}else{
				replaced.append(sentence[i]);	
			}
		}
		return replaced.toString();
	}
}
