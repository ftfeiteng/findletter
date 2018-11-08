package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import com.example.main.LetterFinder;
import com.example.main.Main;

class TestLetterFinder {

	@Test
	void test() {
		LetterFinder finder = new LetterFinder();
		assertEquals(7, finder.findLetter("bcdefgabcdefg", 'a'));
		assertEquals(-1, finder.findLetter("bcdefgbcdefg", 'a'));
		assertEquals(1, finder.findLetter("abcdefagbcdefg", 'a'));
		assertEquals(15, finder.findLetter("bcde99902-=efga", 'a'));
		assertEquals(1, finder.findLetter("aaaaaaaa", 'a'));
		assertEquals(-1, finder.findLetter("=====", 'a'));
		assertEquals(2, finder.findLetter("babaaabaaba", 'a'));
	}
	
	@Test
	void testExceptions() {
		LetterFinder finder = new LetterFinder();
		assertEquals(-1, finder.findLetter(null, 'a'));
		assertEquals(-1, finder.findLetter("", 'a'));
	}

}
