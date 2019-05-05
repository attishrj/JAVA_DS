package com.ques.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarCipher {

	private static String encrypt(String text, int degree) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char charAt = text.charAt(i);
			if (Character.isAlphabetic(charAt)) {
				if (Character.isUpperCase(charAt)) {
					int j = (int) charAt + degree - 65;
					int k = j % 26 + 65;
					char ch = (char) k;
					builder.append(ch);
				} else {

					int j2 = (int) charAt + degree - 97;
					int k2 = j2 % 26 + 97;

					char chl = (char) k2;
					builder.append(chl);
				}
			}
			else{
				builder.append(charAt);
			}

		}
		return builder.toString();

	}

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the string");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		System.out.println("Enter the degrbee of encryption");
		int num = Integer.parseInt(reader.readLine());
		String str = encrypt(input, num);
		System.out.println(str);

	}

}
