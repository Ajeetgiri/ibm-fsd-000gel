package list;

public class Cards {
	private Suit suit;
	private Rank rank;

	public Cards(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "[suit=" + suit + ", rank=" + rank + "]";
	}

	public Suit suit() {
		return suit;
	}

	public Rank rank() {
		return rank;
	}

}
