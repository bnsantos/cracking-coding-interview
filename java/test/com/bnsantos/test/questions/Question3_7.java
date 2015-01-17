package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter3.Question7;

public class Question3_7 {

	@Test
	public void test() {
		Question7.AnimalQueue animalQueue = new Question7.AnimalQueue();
		animalQueue.queueAnimal(new Question7.Dog("penelope"));
		sleep();
		animalQueue.queueAnimal(new Question7.Dog("brutus"));
		sleep();
		animalQueue.queueAnimal(new Question7.Cat("miuzinho"));
		sleep();
		animalQueue.queueAnimal(new Question7.Cat("miuzao"));
		sleep();
		animalQueue.queueAnimal(new Question7.Cat("tom"));
		sleep();
		animalQueue.queueAnimal(new Question7.Cat("123"));
		sleep();
		animalQueue.queueAnimal(new Question7.Dog("obama"));
		sleep();
		animalQueue.queueAnimal(new Question7.Dog("dilma"));
		sleep();
		animalQueue.queueAnimal(new Question7.Dog("patrick"));
		sleep();
		animalQueue.queueAnimal(new Question7.Dog("guga"));
		
		Assert.assertEquals("penelope", animalQueue.dequeueAny().getName());
		Assert.assertEquals("miuzinho", animalQueue.dequeueCat().getName());
		Assert.assertEquals("miuzao", animalQueue.dequeueCat().getName());
		Assert.assertEquals("brutus", animalQueue.dequeueAny().getName());
		Assert.assertEquals("obama", animalQueue.dequeueDog().getName());
		Assert.assertEquals("tom", animalQueue.dequeueAny().getName());
		Assert.assertEquals("123", animalQueue.dequeueAny().getName());
		Assert.assertEquals("dilma", animalQueue.dequeueAny().getName());
		Assert.assertNull(animalQueue.dequeueCat());
	}
	
	public void sleep(){
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
