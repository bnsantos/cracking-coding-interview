package com.bnsantos.chapter3;

import java.util.ArrayList;
import java.util.List;

public class Question3 {
	public static class SetOfStacks{
		private List<Stack> mStacks;
		private int mCurrentStack;
		
		public SetOfStacks(){
			mStacks = new ArrayList<Question3.Stack>();
			mCurrentStack = -1;
		}
		
		public void push(int value) throws Exception{
			if(mCurrentStack==-1){
				addNewStack(value);
			}else{
				if(mStacks.get(mCurrentStack).isFull()){
					addNewStack(value);
				}else{
					mStacks.get(mCurrentStack).push(value);
				}
			}
		}
		
		public int pop() throws Exception{
			if(mCurrentStack==-1){
				throw new Exception("Stack empty");
			}else{
				if(mStacks.get(mCurrentStack).isEmpty()){
					mStacks.remove(mCurrentStack--);
				}
			
				if(mCurrentStack==-1){
					throw new Exception("Stack empty");
				}
				
				return mStacks.get(mCurrentStack).pop();
			}
		}
		
		private void addNewStack(int value) throws Exception{
			Stack stack = new Stack();
			stack.push(value);
			mStacks.add(stack);
			mCurrentStack++;
		}
		
		public int popAt(int stack) throws Exception{
			if(stack>=0&&stack<mStacks.size()){
				return mStacks.get(stack).pop();
			}else{
				throw new Exception("Invalid stack");
			}
		}
	}
	
	public static class Stack{
		private static final int MAX_STACK = 5;
		private int[] mStack;
		private int mTop;
		
		public Stack(){
			mStack = new int[MAX_STACK];
			mTop = -1;
		}
		
		public void push(int value) throws Exception{
			if(mTop+1==MAX_STACK){
				throw new Exception("Stack full");
			}else{
				mStack[mTop++]=value;
			}
		}
		
		public int pop() throws Exception{
			if(mTop==-1){
				throw new Exception("Stack empty");
			}else{
				return mStack[mTop--];
			}
		}
		
		public boolean isEmpty(){
			return mTop == -1;
		}
		
		public boolean isFull(){
			return mTop==MAX_STACK;
		}
	}
}
