package com.javaex.oop.song.v3;

public class Song {
	
	//v2. 기본 생성자, 모든 필드 생성자
	
	//필드 선언 
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	 public Song(String title, String artist, String album, 
			 String composer, int year, int track) {
	        this.title = title;
	        this.artist = artist;
	        this.album = album;
	        this.composer = composer;
	        this.year = year;
	        this.track = track;
	 }
	 
	
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
