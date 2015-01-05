package com.bnsantos.chapter1;

public class Question5 {
	public static String compress(String input){
		if(input==null){
			return null;
		}else if(input.length()<3){
			return input;
		}
		
		StringBuffer compressed = new StringBuffer();
		
		char aux = input.charAt(0);
		int count = 1;
		for(int i=1;i<input.length();i++){
			if(aux == input.charAt(i)){
				count++;
			}else{
				compressed.append(aux);
				compressed.append(count);
				aux = input.charAt(i);
				count = 1;
			}
			
			if(i==input.length()-1){
				compressed.append(aux);
				compressed.append(count);
			}
		}
		
		
		if(compressed.length()<input.length()){
			return compressed.toString();
		}else{
			return input;
		}
	}
}
