package com.bnsantos.chapter3;

public class Question1 {
	
	public static class FixedArrayStack{
		private static final int STACK_SIZE = 100;
		private int mQtdStacks;
		
		private int[] mStack;
		private int[] mPointers;
		
		public FixedArrayStack(int numStacks){
			mQtdStacks = numStacks;
			mStack = new int[STACK_SIZE*mQtdStacks];
			mPointers = new int[mQtdStacks];
			for(int i=0;i<mPointers.length;i++){
				mPointers[i]=-1;
			}
		}
		
		public void push(int stack, int value) throws Exception{
			if(validStack(stack)){
				if(isFull(stack)){
					throw new Exception("Stack["+stack+"] is full");
				}else{
					mPointers[stack]++;
					mStack[absTopStack(stack)] = value;
				}
			}
			
		}
		
		public int pop(int stack) throws Exception{
			if(validStack(stack)){
				if(isEmpty(stack)){
					throw new Exception("Stack["+stack+"] is already empty");
				}else{
					int pop = mStack[absTopStack(stack)];
					mPointers[stack]--;
					return pop;
				}
			}
			return -1;
		}
		
		private boolean validStack(int stack){
			if(stack>=0&&stack<mQtdStacks){
				return true;
			}else{
				throw new IllegalArgumentException("Invalid stack["+stack+"]");
			}
		}
		
		private boolean isEmpty(int stack){
			if(validStack(stack)){
				return mPointers[stack]==-1;
			}
			return false;
		}
		
		private boolean isFull(int stack){
			if(validStack(stack)){
				return mPointers[stack]+1==STACK_SIZE;
			}
			return false;
		}
		
		private int absTopStack(int stack){
			return stack*STACK_SIZE+mPointers[stack];
		}
	}

}
