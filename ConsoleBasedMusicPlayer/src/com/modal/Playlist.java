package com.modal;

import java.util.ArrayList;
import java.util.List;

import com.contract.Playable;

public class Playlist  implements Playable{
	
	private int playlistId;
	private String playlistName;
	private List<Song> songs=new ArrayList<Song>();
	private Song currentlyPlaying=null;
	private boolean pause=true;
	
	public Playlist() {
		// TODO Auto-generated constructor stub
	}

	public Playlist(int playlistId, String playlistName, List<Song> songs) {
		super();
		this.playlistId = playlistId;
		this.playlistName = playlistName;
		this.songs = songs;
	}
	
	public Playlist(int playlistId, String playlistName) {
		super();
		this.playlistId = playlistId;
		this.playlistName = playlistName;
	}
	
	

	public int getPlaylistId() {
		return playlistId;
	}

	public void setPlaylistId(int playlistId) {
		this.playlistId = playlistId;
	}

	public String getPlaylistName() {
		return playlistName;
	}

	public void setPlaylistName(String playlistName) {
		this.playlistName = playlistName;
	}

	public List<Song> getSongs() {
		return songs;
	}

	public void setSongs(List<Song> songs) {
		this.songs = songs;
	}

	@Override
	public String toString() {
		return "Playlist [playlistId=" + playlistId + ", playlistName=" + playlistName + ", songs=" + songs + "]";
	}
	
	
	public void displaySongs() {
		System.out.println("songs in playlist: ");
		for(Song song: songs) {
			System.out.println(song);
		}
	}

	@Override
	public void play(String title) {
		Song song=null;
		for(Song s:songs) {
			if(s.getTitle().equalsIgnoreCase(title)){
				song=s;
				break;
			}
		}
		if(song!= null) {
		currentlyPlaying= song;
		System.out.println(song + " is Playing");
		} else {
			System.out.println("Song not in playlist");
		}
		
	}

	@Override
	public void pause(String title) {
		if(currentlyPlaying!=null && currentlyPlaying.getTitle().equals(title)) {
			if(!pause) {
				pause= true;
				System.out.println(title + "Song is paused");				
			} else {
				System.out.println("alreday paused ");
			}
			
		}else {
			System.out.println("Nothing to pause!! please pay a song to pause");
		}
	}

	@Override
	public void stop(String title) {
	if(currentlyPlaying!=null && currentlyPlaying.getTitle().equalsIgnoreCase(title)) {
		System.out.println("Song is stooped");
		currentlyPlaying=null;
		pause=false;
	}
	else {
		System.out.println("Nothing is playing to stop");
	}
		
		
	}
	
	

}
