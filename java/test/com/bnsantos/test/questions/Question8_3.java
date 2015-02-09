package com.bnsantos.test.questions;

import org.junit.Assert;
import org.junit.Test;

import com.bnsantos.chapter8.question3.Jukebox;
import com.bnsantos.chapter8.question3.Song;

public class Question8_3 {

	@Test
	public void test() {
		Jukebox jukebox = new Jukebox();
		Song s1 = new Song("song1", "artist1", 10, 2015, "samba", "mpb");
		Song s2 = new Song("song2", "artist2", 15, 2015, "rock", "mpb");
		Song s3 = new Song("song3", "artist3", 20, 2015, "samba", "indie");
		Song s4 = new Song("song4", "artist4", 5, 2015, "samba", "pop");
		Song s5 = new Song("song5", "artist5", 30, 2015, "samba", "pagode");
		Song s6 = new Song("song6", "artist5", 45, 2015, "samba", "forro");
		Song s7 = new Song("song7", "artist5", 80, 2015, "samba");
		Song s8 = new Song("song8", "artist6", 5, 2015, "internacional");
		Song s9 = new Song("song9", "artist7", 2, 2015, "samba");
		Song s10 = new Song("song10", "artist8", 3, 2015, "samba");
		
		jukebox.addSong(s1);
		jukebox.addSong(s2);
		jukebox.addSong(s3);
		jukebox.addSong(s4);
		jukebox.addSong(s5);
		jukebox.addSong(s6);
		jukebox.addSong(s7);
		jukebox.addSong(s8);
		jukebox.addSong(s9);
		jukebox.addSong(s10);
		
		jukebox.addPlaylist(s3);
		jukebox.addPlaylist(s4);
		jukebox.addPlaylist(s1);
		jukebox.addPlaylist(s9);
		jukebox.addPlaylist(s8);
		jukebox.addPlaylist(s10);
		jukebox.addPlaylist(s2);
		
		jukebox.play();
		jukebox.play();
		jukebox.play();
		Assert.assertEquals("song9", jukebox.nextSong().getName());
		jukebox.play();
		jukebox.play();
		Assert.assertEquals("song10", jukebox.nextSong().getName());
		
		Assert.assertEquals("song3 - artist3[2015]\nsong4 - artist4[2015]\nsong1 - artist1[2015]\nsong9 - artist7[2015]\nsong8 - artist6[2015]\n", jukebox.displayHistory());
		
	}

}
