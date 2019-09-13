package Assesment;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	Scanner scanner = new Scanner(System.in);
	TreeMap<Character, Integer> frequency = new TreeMap<Character,Integer>();
     System.out.println("");
	String sentence = scanner.nextLine();
	LetterSequence letter = new LetterSequence(sentence);
	frequency = letter.computeFrequency();
	letter.displayLetterFrequency(frequency);
}

}
