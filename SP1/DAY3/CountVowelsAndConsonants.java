package com.sp1.app;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {

		String str = "hello world";
		int vow = 0, cons = 0;

		for (char s : str.toLowerCase().toCharArray()) {

			if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
				vow++;
			} else if (s == ' ') {
				continue;
			} else {
				cons++;
			}

		}

		System.out.println(" Vowels :: " + vow + " Consonants :: " + cons);

		String st = "Hello World 123!";

		Set<Character> vowelsSet = Set.of('a', 'e', 'i', 'o', 'u');

		Map<String, Long> result = st.toLowerCase().chars().mapToObj(c -> (char) c).filter(Character::isLetter)
				.collect(Collectors.groupingBy(ch -> vowelsSet.contains(ch) ? "vowel" : "consonant",
						Collectors.counting()));
		System.out.println(result);
	}
}