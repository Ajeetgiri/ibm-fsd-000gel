package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deck {
//	private static int hand;
//	private static int Ncard;
//	private int i;
//	private int j;

	public static List<Cards> protodeck = new ArrayList<Cards>();

	static {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				protodeck.add(new Cards(s, r));
			}
		}
	}

	public static void main(String[] args) {
		System.out.print(protodeck);
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter number of hands");
//		hand= sc.nextInt();
//		System.out.println("enter number of cards per hand");
//		Ncard = sc.nextInt();
		

	}
}
