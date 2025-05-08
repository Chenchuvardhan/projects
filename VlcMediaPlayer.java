package com.jagannadh;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 MediaPlayer - VLCMediaPlayer
 WAP for the below requirement:
 Create a type Interface 'MediaPlayer'.
 It provides basic functionalities like play, pause, and stop.
 Create another type Interface 'AdvancedMediaPlayer' which
 is a type of MediaPlayer but adds some extra functionalities
 like adjusting volume and skipping track.
 Create another type Interface 'PlaylistMediaPlayer' which
 is a type of AdvancedMediaPlayer and adds functionalities for
 managing playlists like creating playlists and adding media items
 to playlists.
  Create a VLCMediaPlayer class which implements PlaylistMediaPlayer
  and provides implementations for all the methods defined
  in the interfaces.
 */
interface MediaPlayer{
	public abstract void play(); 
	public abstract void pause();
	public abstract void stop();
	
}
interface AdvanceMediaPlayer extends MediaPlayer{
	public abstract void adjustingVolume(int volume);
	public abstract void skippingTrack();
	
}
interface PlayListAdvanceMediaPlayer extends AdvanceMediaPlayer{
public abstract void creatingplaylists(String playList,LinkedHashSet<Song> songs);
public abstract void addingMediaItems(String song);
}
public class VlcMediaPlayer implements PlayListAdvanceMediaPlayer {
     String playListName;
     LinkedHashSet<Song> songs;
	@Override
	public void creatingplaylists(String playlist,LinkedHashSet<Song> songs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addingMediaItems(String song) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adjustingVolume(int volume) {

		// TODO Auto-generated method stub
		
	}

	@Override
	public void skippingTrack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

}
class JioSaavan implements PlayListAdvanceMediaPlayer{

	@Override
	public void adjustingVolume(int volume) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void skippingTrack() {
		// TODO Auto-generated method stub
		System.out.println();

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println();

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println();
	}

	@Override
	//in the playlist how many songs can be added at a time
	//in the playlist can we add duplicates
	//in the playlist can we maintain order
	public void creatingplaylists(String playList,LinkedHashSet<Song> songs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addingMediaItems(String song) {
		// TODO Auto-generated method stub
		
	}
	
}
