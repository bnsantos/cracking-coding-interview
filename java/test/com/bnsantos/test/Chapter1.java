package com.bnsantos.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.bnsantos.chapter1.Question1;

public class Chapter1 {
	char[] ascii;
	char[] repeated;
	
	@Before
	public void init(){
		ascii = new char[256];
		repeated = new char[280];
		for(int i=0;i<ascii.length;i++){
			ascii[i]=(char) i;
		}
		for(int i=0;i<repeated.length-256;i++){
			repeated[256+i]=(char) i;
		}
	}

	@Test
	public void testASCII_ok() {
		Assert.assertTrue(Question1.isUniqueCharsASCII("abcdefghij"));
		Assert.assertTrue(Question1.isUniqueCharsASCII("1983750qiewo"));
		Assert.assertTrue(Question1.isUniqueCharsASCII("adskljqweoirpuzxc,mbn "));
		Assert.assertTrue(Question1.isUniqueCharsASCII(new String(ascii)));
	}
	
	@Test
	public void testASCII_moreChars() {
		Assert.assertFalse(Question1.isUniqueCharsASCII(new String(repeated)));
		Assert.assertFalse(Question1.isUniqueCharsASCII(new String(ascii) + new String(ascii)));
	}
	
	@Test
	public void testASCII_fail() {
		Assert.assertFalse(Question1.isUniqueCharsASCII("abcdefghija"));
		Assert.assertFalse(Question1.isUniqueCharsASCII("10298375198710235"));
		Assert.assertFalse(Question1.isUniqueCharsASCII("132465987hasdfkjhvbnmz,mzxcbgrshq45"));
	}

	@Test
	public void testUNICODE_ok() {
		Assert.assertTrue(Question1.isUniqueCharsUNICODE("䳗䳘䳙䳚Ḛᷥᮓᮃ"));
		Assert.assertTrue(Question1.isUniqueCharsUNICODE("1983750qiewo"));
		Assert.assertTrue(Question1.isUniqueCharsUNICODE("adskljqweoirpuzxc,mbn "));
	}
	
	@Test
	public void testUNICODE_fail() {
		Assert.assertFalse(Question1.isUniqueCharsUNICODE("䳗䳗䳗䳗"));
		Assert.assertFalse(Question1.isUniqueCharsUNICODE("䳗䳘䳙䳚Ḛᷥᮓᮃ㈛幬菧菧"));
		Assert.assertFalse(Question1.isUniqueCharsUNICODE("䳗䳘䳙䳚Ḛᷥᮓᮃᢸ㈛㈛"));
	}
}
