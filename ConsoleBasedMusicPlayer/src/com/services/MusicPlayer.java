package com.services;

import java.util.ArrayList;
import java.util.List;

import com.modal.Playlist;
import com.modal.Song;

public class MusicPlayer {

	private final List<Song> allSongs=new ArrayList<Song>();
	private final List<Playlist> playlists=new ArrayList<Playlist>();
	private int songIdCounter=1;
	private int PlaylistConter=1;
	
	
	public Song addSongs(String title, String artist, double duration) {
		Song song=new Song(songIdCounter++,title, artist, duration);
		allSongs.add(song);
		System.out.println("Added Song : "+song);
		return song;
	}

	public void displayAllSongs() {

		for(Song song:allSongs) {
			System.out.println(song);
		}
		
	}

	public void deletSong(String title) {
		Song songToDelete=null;
		for(Song song:allSongs) {
			if(song.getTitle().equalsIgnoreCase(title)) {
				songToDelete=song;
				break;
			}
		}
		if(songToDelete==null) {
			System.out.println(title+ " Song not found!!");
		} else {
			allSongs.remove(songToDelete);
			for (Playlist playlist : playlists) {
		        playlist.getSongs().remove(songToDelete);
		    }
			System.out.println("song deleted in library & playlist!!");
		}
	}

	public void updateSong(Song song, String existingSongTitle) {
		Song existed=null;
		for(Song song2:allSongs) {
			if(song2.getTitle().equalsIgnoreCase(existingSongTitle)) {
				existed=song2;
			}
		}
		if(existed==null) {
			System.out.println("Song not found!!");
		}else {
			existed.setTitle(song.getTitle());
			existed.setArtist(song.getArtist());
			existed.setDuration(song.getDuration());
			System.out.println("Update song : "+existed);
			
			
		}
		
	}

	public void createPlaylist(String playlistName) {
		boolean isExisted=false;
		if(playlistName!=null) {
			for(Playlist playlist:playlists) {
				if(playlist.getPlaylistName().equalsIgnoreCase(playlistName)) {
					isExisted=true;
					break;
				}
			}
			if(isExisted) {
				System.out.println("Already existed!!");
			}else {
				Playlist p=new Playlist(PlaylistConter++, playlistName);
				playlists.add(p);
				System.out.println("Created playlist :" +p);
				
			}
		}
	}
	public void addSongtoPlaylist(String playlistName, String title) {
		Playlist p=null;
		for(Playlist playlist:playlists) {
			if(playlist.getPlaylistName().equalsIgnoreCase(playlistName)) {
				p=playlist;
				break;
			}
		}
		Song s=null;
		for(Song song:allSongs) {
			if(song.getTitle().equalsIgnoreCase(title)) {
				s=song;
				break;
			}
		}
		p.getSongs().add(s);
		System.out.println("Added to playlist!!");
			
		
	}

	public void displayPlaylist() {

		for(Playlist playlist:playlists) {
			System.out.println(playlist);
		}
		
	}

	public void displaySongsInPlaylist(String playlistName) {

		Playlist p=null;
		for(Playlist playlist:playlists) {
			if(playlist.getPlaylistName().equalsIgnoreCase(playlistName)) {
				p=playlist;
				break;
			}
		}
		p.displaySongs();
		
		
	}

	public void playInPlaylist(String playlisName, String tilte) {
		
		Playlist p=null;
		for(Playlist playlist:playlists) {
			if(playlist.getPlaylistName().equalsIgnoreCase(playlisName)) {
				p=playlist;
				break;
			}
		}
		if(p!=null) {
		p.play(tilte);
		} else { System.out.println(" playlist is not found");}
		
	}

	public void pauseInPlaylist(String playlisName, String tilte) {
		Playlist p=null;
		for(Playlist playlist:playlists) {
			if(playlist.getPlaylistName().equalsIgnoreCase(playlisName)) {
				p=playlist;
				break;
			}
		}
		if(p!=null) {
			p.pause(tilte);
		} else { System.out.println(" playlist is not found");}
			
	}

	public void stopInPlaylist(String playlisName, String tilte) {
		
		Playlist p=null;
		for(Playlist playlist:playlists) {
			if(playlist.getPlaylistName().equalsIgnoreCase(playlisName)) {
				p=playlist;
				break;
			}
		}
		if(p!=null) {
			p.stop(tilte);
		} else { System.out.println(" playlist is not found");}
			
	}
}
