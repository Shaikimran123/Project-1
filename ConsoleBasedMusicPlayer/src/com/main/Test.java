package com.main;

import java.util.Scanner;

import com.modal.Song;
import com.services.MusicPlayer;

public class Test {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		boolean running=true;
		MusicPlayer musicPlayer=new MusicPlayer();
		while(running) {
			DisplayMenu();
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice) {
				case 1: { //add a song
					System.out.println("Enter song title: ");
					String title = sc.nextLine();
					System.out.println();
					
					System.out.println("Enter song artist: ");
					String artist = sc.nextLine();
					System.out.println();
					
					System.out.println("Enter song duration: ");
					String duration = sc.nextLine();
					System.out.println();
					
					musicPlayer.addSongs(title, artist, choice);		
					break;
				}
				case 2: { //update song
					System.out.println("Enter Existing song title: ");
					String existingSongTitle=sc.nextLine();
					System.out.println("Enter new title: ");
					String newTitle=sc.nextLine();
					System.out.println("Enter new song artist: ");
					String newArtist=sc.nextLine();
					System.out.println("Enter new song duration: ");
					double newDuration=sc.nextDouble();
					
					Song song=new Song(0, newTitle, newArtist, newDuration);
					musicPlayer.updateSong(song,existingSongTitle);
					break;
				}
				case 3: { //delete song
					System.out.println("Enter thr title to delete: ");
					String title=sc.nextLine();
					musicPlayer.deletSong(title);			
					break;
				}
				case 4: { //display all songs
					musicPlayer.displayAllSongs();
					break;
				}		
				case 5: { //create playlist
					System.out.println("Enter Playlist name: ");
					String playlistName=sc.nextLine();
					musicPlayer.createPlaylist(playlistName);		
					break;
				}
				case 6: { //add song to playlist
					System.out.println("Enter the playlist : ");
					String playlistName=sc.nextLine();
					System.out.println("Enter song title: ");
					String title=sc.nextLine();
					musicPlayer.addSongtoPlaylist(playlistName,title);
					break;
				}
				case 7: { //display playlist
					musicPlayer.displayPlaylist();
					break;
				}
				case 8: { //display songs in playlist
					System.out.println("Enter playlist: ");
					String playlisName=sc.nextLine();
					musicPlayer.displaySongsInPlaylist(playlisName);
					
					break;
				}
				case 9: {
					System.out.println("Enter playlist name: ");
					String playlisName=sc.nextLine();
					System.out.println("Enter the song to play: ");
					String tilte=sc.nextLine();
					musicPlayer.playInPlaylist(playlisName,tilte);
					
					break;
				}
				case 10: {
					System.out.println("Enter playlist name: ");
					String playlisName=sc.nextLine();
					System.out.println("Enter the song to pause: ");
					String tilte=sc.nextLine();
					musicPlayer.pauseInPlaylist(playlisName,tilte);
					
					break;
				}		
				case 11: {
					System.out.println("Enter playlist name: ");
					String playlisName=sc.nextLine();
					System.out.println("Enter the song to stop: ");
					String tilte=sc.nextLine();
					musicPlayer.stopInPlaylist(playlisName,tilte);
					
					break;
				}
				case 12: {
					running=false;
					System.out.println("Exiting Music player\nGood bye");
					break;
				}
				default : System.out.println("Invalid choice\nPlease try agail...");
			}
			System.out.println("-----x-----");
		}
		
		
	}
	
	
	

	private static void DisplayMenu() {
		System.out.println("------- MUSIC PLAYER MENU ------- \n"
				+ "1. Add New Song \n"
				+ "2. Update Existing Song \n"
				+ "3. Delete Song \n"
				+ "4. Display All Songs \n"
				+ "5. Create New Playlist \n"
				+ "6. Add Song to Playlist \n"
				+ "7. Display All Playlists \n"
				+ "8. Display Songs in Playlist \n"
				+ "9. Play Song in Playlist \n"
				+ "10. Pause Song in Playlist \n"
				+ "11. Stop Song in Playlist \n"
				+ "12. Exit \n"
				+ "Enter your choice: "); 
		
		System.out.println();
	}

}
