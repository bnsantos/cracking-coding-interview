package com.bnsantos.chapter8.question3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Jukebox {
	private Map<String, Song> mSongList;
	private List<String> mPlaylist;
	private List<String> mDisplay;
	
	public Jukebox() {
		mSongList = new HashMap<String, Song>();
		mPlaylist = new ArrayList<String>();
		mDisplay = new ArrayList<String>();
	}
	
	public Song findByName(String songName){
		return mSongList.get(songName);
	}
	
	public Song nextSong(){
		if(mPlaylist.size()>0){
			return mSongList.get(mPlaylist.get(0));
		}else{
			return null;
		}
	}
	
	public void addSong(Song s){
		if(!mSongList.containsKey(s.getName())){
			mSongList.put(s.getName(), s);
		}
	}
	
	public Song removeSong(String songName){
		return mSongList.remove(songName);
	}
	
	public void addPlaylist(Song s){
		mPlaylist.add(s.getName());
	}
	
	public void play(){
		if(mPlaylist.size()>0){
			String songName = mPlaylist.remove(0);
			Song song = mSongList.get(songName);
			mDisplay.add(song.info());
			wait(song.getLenght());
		}else{
			Song song = getRandomSong();
			mDisplay.add(song.info());
			wait(song.getLenght());
		}
	}

	private void wait(int wait) {
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Song getRandomSong(){
		List<String> allSongs = new ArrayList<String>(mSongList.keySet());
		int randomIndex = new Random().nextInt(allSongs.size());
		return mSongList.get(allSongs.get(randomIndex));
	}
	
	public String displayHistory(){
		StringBuffer buffer = new StringBuffer();
		for(String s:mDisplay){
			buffer.append(s);
			buffer.append("\n");
		}
		return buffer.toString();
	}
}
