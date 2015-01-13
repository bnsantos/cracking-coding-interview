package com.bnsantos.chapter3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Question7 {
	
	public static class AnimalQueue{
		public Queue<Animal> mDogs;
		public Queue<Animal> mCats;
		
		public AnimalQueue(){
			mCats = new Queue<Question7.Animal>();
			mDogs = new Queue<Question7.Animal>();
		}
		
		public void queueAnimal(Animal a){
			a.setTime(Calendar.getInstance().getTimeInMillis());
			if(a instanceof Dog){
				mDogs.queue(a);
			}else{
				mCats.queue(a);
			}
		}
		
		public Animal dequeueAny(){
			Animal dogOldest = mDogs.checkOldest(), catOldest=mCats.checkOldest();
			if(dogOldest==null){
				return mCats.dequeue();
			}else if(catOldest==null){
				return mDogs.dequeue();
			}else if(dogOldest.getTime()>catOldest.getTime()){
				return mCats.dequeue();
			}else{
				return mDogs.dequeue();
			}
		}
		
		public Animal dequeueDog(){
			return mDogs.dequeue();
		}
		
		public Animal dequeueCat(){
			return mCats.dequeue();
		}
	}
	
	public static class Queue<T>{
		private List<T> mQueue;
		
		public Queue(){
			mQueue = new ArrayList<T>();
		}
		
		public void queue(T t){
			mQueue.add(t);
		}
		
		public T dequeue(){
			if(mQueue.size()>0){
				return mQueue.remove(0);
			}else{
				return null;
			}
		}
		
		public T checkOldest(){
			if(mQueue.size()>0){
				return mQueue.get(0);
			}else{
				return null;
			}
		}
	}
	
	public static abstract class Animal{
		protected final String mName;
		protected double mTime;
		
		public Animal(String name){
			mName = name;
		}
		
		public String getName(){
			return mName;
		}
		
		public void setTime(double timeInMillis){
			mTime = timeInMillis;
		}
		
		public double getTime(){
			return mTime;
		}
	}
	
	public static class Dog extends Animal{
		public Dog(String name){
			super(name);
		}
	}
	
	public static class Cat extends Animal{
		public Cat(String name){
			super(name);
		}
	}

}
