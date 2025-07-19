package com.sddevops.sonarqube_maven.eclipse;

import static org.junit.jupiter.api.Assertions.*;	

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SongTest {
	
	private Song song;
	private Song song2;
	

	@BeforeEach
	void setUp() {
		song = new Song("111", "Love Story", "Taylor Swift", 5.55);
		
	}

	@AfterEach
	void tearDown(){
		song = null;
		song2 = null;
		
	}

	@Test
	void testHashCode() {
		Song newSong = new Song("111", "Love Story", "Taylor Swift", 5.55);
		Song newSongTwo = new Song("111", "Love Story", "Taylor Swift", 5.55);
		Song newSongThree = new Song("222", "I'm Just a Kid", "Simple Plan", 4.44);
		
		int firstSongHash = newSong.hashCode();
		int secondSongHash = newSongTwo.hashCode();
		int thirdSongHash = newSongThree.hashCode();
		
		assertEquals(firstSongHash, secondSongHash);
		assertNotEquals(secondSongHash, thirdSongHash);
		
	}

	@Test
	void testSong() {
		song2 = new Song("222", "Addicted", "Simple Plan", 5.55);
		assertEquals("Simple Plan", song2.getArtiste());
	}

	@Test
	void testGetId() {
		assertEquals("111", song.getId());
	}

	@Test
	void testSetId() {
		song.setId("555");
		assertEquals("555", song.getId());
	}

	@Test
	void testGetTitle() {
		assertEquals("Love Story", song.getTitle());
	}

	@Test
	void testSetTitle() {
		song.setTitle("Not Love Story");
		assertEquals("Not Love Story", song.getTitle());
	}

	@Test
	void testGetArtiste() {
		assertEquals("Taylor Swift", song.getArtiste());
	}

	@Test
	void testSetArtiste() {
		song.setArtiste("James Bond");
		assertEquals("James Bond", song.getArtiste());
	}

	@Test
	void testGetSongLength() {
		assertEquals(5.55, song.getSongLength());
	}

	@Test
	void testSetSongLength() {
		song.setSongLength(3.33);
		assertEquals(3.33, song.getSongLength());
	}

	@Test
	void testEqualsObject() {
		Song song3 = new Song("111", "Love Story", "Taylor Swift", 5.55);
		Song song4 = new Song("222", "I'm Just a Kid", "Simple Plan", 4.44);
		
		assertEquals(song, song);
		assertNotEquals("123", song);
		assertEquals(song3, song);
		assertNotEquals(song4, song);
		
	}

}
