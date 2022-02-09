package com.capgemini.sfdc.col;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Song {

	String name;
	String runTime;
	String singer;

	public Song(String nm, String rt, String sng) {
		this.name = nm;
		this.runTime = rt;
		this.singer = sng;
	}

}

class PlayList {

	List<Song> songs = new ArrayList<>();

	public String playSong(String currentTime, Song song) {

		if (Integer.parseInt(currentTime.split(":")[0]) < Integer.parseInt(song.runTime.split(":")[0])
				&& Integer.parseInt(currentTime.split(":")[1]) < Integer.parseInt(song.runTime.split(":")[1]))
			return "Song is being continued";
		return "Song replayed";

	}

	public String addSong(Song song) {

//		if (songs.contains(song))
//			return "Cannot be added";
//		songs.add(song);
//		return "Added";

		if (!songs.isEmpty()) {
			for (Song s : songs) {
				if (s.name.equals(song.name)) {
					return "Cannot be added";
				}
			}
			songs.add(song);
			return "Added";

		} else {
			songs.add(song);
			return "Added";
		}
	}

}

public class App {
	public static void main(String args[]) throws Exception {

		PlayList pl = new PlayList();

		Song song = new Song("Srivalli", "4:30", "Sunil");
		Song song2 = new Song("Neeli neeli akasam", "5:10", "Akash");
		Song song3 = new Song("Srivalli", "4:30", "Sunil");

		System.out.println("Adding songs...");
		System.out.println(pl.addSong(song));
		System.out.println(pl.addSong(song2));
		System.out.println(pl.addSong(song3));

		System.out.println("Playing songs...");
		System.out.println(pl.playSong("2:05", song));
		System.out.println(pl.playSong("4:15", song2));
		System.out.println(pl.playSong("6:00", song3));

	}
}
