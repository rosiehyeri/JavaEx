package com.javaex.oop.song.v1;

public class Song {
	
	//필드 선언 
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//title
	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    //artist
    public String getArtist() {
    	return artist;
    }
    public void setArtist(String artist) {
    	this.artist = artist;
    }
    	
    //album
    public String getAlbum() {
    	return album;
    }
    public void setAlbum(String album) {
    	this.album = album;
    }
    
    //composer
    public String getComposer() {
    	return composer;
    }
    public void setComposer(String composer) {
    	this.composer = composer;
    }
    
    //year
    public int getYear() {
    	return year;
    }
    public void setYear(int year) {
    	this.year = year;
    }
    
    //track
    public int getTrack() {
    	return track;
    }
    public void setTrack(int track) {
    	this.track = track;
    }
    
    
    
    public void showInfo() {
    	System.out.println(artist + ", " + title + "( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
    }
    
    
    
    
    
}
