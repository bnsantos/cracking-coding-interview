package com.bnsantos.chapter8.question3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {
	private final String mName;
	private final String mArtist;
	private final int mLenght;
	private final int mYear;
	private List<String> mGender;
	
	public Song(String name, String artist, int lenght, int year, String... gender) {
		mName = name;
		mArtist = artist;
		mLenght = lenght;
		mYear = year;
		if(gender!=null){
			mGender = Arrays.asList(gender);
		}else{
			mGender = new ArrayList<String>();
		}
	}

	public List<String> getGender() {
		return mGender;
	}

	public void addGender(String gender) {
		if(!mGender.contains(gender))
			mGender.add(gender);
	}

	public String getName() {
		return mName;
	}

	public String getArtist() {
		return mArtist;
	}

	public int getLenght() {
		return mLenght;
	}

	public int getmYear() {
		return mYear;
	}
	
	public String info(){
		return mName + " - " + mArtist + "["+mYear+"]";
	}
}
