package com.example.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		System.out.println("Input your text");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String text = null;
		try {
			text = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		LetterFinder finder = new LetterFinder();
		int position = finder.findLetter(text, 'a');
		if (position > 0) {
			System.out.println("Position:" + position);
		} else {
			System.out.println("Position:" + "N/A");
		}
	}

}
