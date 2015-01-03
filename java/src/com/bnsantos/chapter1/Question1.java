package com.bnsantos.chapter1;

public class Question1 {
	public static boolean isUniqueCharsASCII(String str) {
		if (str.length() > 256) {
			return false;
		}
		boolean[] used = new boolean[256];
		for (char c : str.toCharArray()) {
			if (used[c]) {
				return false;
			}
			used[c] = true;
		}
		return true;
	}

	public static boolean isUniqueCharsUNICODE(String str) {
		boolean[] used = new boolean[65536];
		for (char c : str.toCharArray()) {
			if (used[c]) {
				return false;
			}
			used[c] = true;
		}
		return true;
	}
}
