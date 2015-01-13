package com.bnsantos.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Question6 {
	public static Stack sortStack(Stack stack){
		Stack ordered = new Stack();
		while(!stack.isEmpty()){
			int pop = stack.pop();
			while(!ordered.isEmpty()&&pop<ordered.peek()){
				stack.push(ordered.pop());
			}
			ordered.push(pop);
		}
		return ordered;
	}
	
	public static class Stack{
		private List<Integer> mStack;
		private int mTop;
		
		public Stack(){
			mStack = new ArrayList<Integer>();
			mTop = -1;
		}
		
		public void push(int i){
			mStack.add(i);
			mTop++;
		}
		
		public int pop(){
			if(mTop==-1){
				return -1;
			}
			
			return mStack.remove(mTop--);
		}
		
		public int peek(){
			if(mTop==-1){
				return -1;
			}
			return mStack.get(mTop);
		}
		
		public boolean isEmpty(){
			return mTop==-1;
		}

		@Override
		public String toString() {
			StringBuffer stack = new StringBuffer();
			for(Integer i:mStack){
				stack.append(i + " ");
			}
			return stack.toString();
		}
		
		
	}

}
