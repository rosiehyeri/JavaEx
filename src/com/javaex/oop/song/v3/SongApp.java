package com.javaex.oop.song.v3;

public class SongApp {

	public static void main(String[] args) {
		Song s1 = new Song("좋은날",
				"아이유",
				"Real",
				"이민수",
				2010,
				3);
		
		Song s2 = new Song("거짓말",
				"BIGBANG",
				"Always",
				"G-DRAGON",
				2007,
				2);
		
		Song s3 = new Song("벚꽃엔딩",
				"버스커버스커",
				"버스커버스커 1집",
				"장범준",
				2012,
				4);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
	}

}
