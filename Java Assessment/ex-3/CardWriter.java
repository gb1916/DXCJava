import java.io.*;
import java.io.Serializable;

  class Card2 {
    private int suit = UNASSIGNED;
    private int number = UNASSIGNED;

    public final static int UNASSIGNED = -1;

    public final static int DIAMONDS = 1;
    public final static int CLUBS = 2;
    public final static int HEARTS = 3;
    public final static int SPADES = 4;

    public final static int ACE = 1;
    public final static int KING = 13;

    public Card2(int number, int suit) {
        if (isValidNumber(number)) {
            this.number = number;
        } else {
            
        }

        if (isValidSuit(suit)) {
            this.suit = suit;
        } else {
            
        }
    }

    public int getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    public static boolean isValidNumber(int number) {
        if (number >= ACE && number <= KING) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isValidSuit(int suit) {
        if (suit >= DIAMONDS && suit <= SPADES) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Card2) {
            if (obj.getNumber == this.number && obj.getSuit == this.suit) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public int hashCode() {
        return number * suit;
    }
    public String toString() {
        return numberToString(this.number) + " of "
               + suitToString(this.suit);
    }

    public static String numberToString(int number) {
        String result = "";
        switch (number) {
            case ACE: result =  "Ace"; break;
            case 2: result = "Two"; break;
            case 3: result = "Three"; break;
            case 4: result = "Four"; break;
            case 5: result = "Five"; break;
            case 6: result = "Six"; break;
            case 7: result = "Seven"; break;
            case 8: result = "Eight"; break;
            case 9: result = "Nine"; break;
            case 10: result = "Ten"; break;
            case 11: result = "Jack"; break;
            case 12: result = "Queen"; break;
            case KING: result = "King"; break;
            case UNASSIGNED: result = "Invalid Number"; break;
        }
        return result;
    }

    public static String suitToString(int suit) {
        String result = "";
        switch (suit) {
            case DIAMONDS: result = "Diamonds"; break;
            case CLUBS: result = "Clubs"; break;
            case HEARTS: result = "Hearts"; break;
            case SPADES: result = "Spades"; break;
            case UNASSIGNED: result = "Invalid Suit"; break;
        }
        return result;
    }
}






 class Card implements Serializable {
    private int suit = UNASSIGNED;
    private int number = UNASSIGNED;

    public final static int UNASSIGNED = -1;

    public final static int DIAMONDS = 1;
    public final static int CLUBS = 2;
    public final static int HEARTS = 3;
    public final static int SPADES = 4;

    public final static int ACE = 1;
    public final static int KING = 13;

    public Card(int number, int suit) {
        if (isValidNumber(number)) {
            this.number = number;
        } else {
            
        }

        if (isValidSuit(suit)) {
            this.suit = suit;
        } else {
            
        }
    }

    public int getSuit() {
        return suit;
    }

    public int getNumber() {
        return number;
    }

    public static boolean isValidNumber(int number) {
        if (number >= ACE && number <= KING) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isValidSuit(int suit) {
        if (suit >= DIAMONDS && suit <= SPADES) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Card) {
	    Card card = (Card)obj;
            if (card.getNumber() == this.number && card.getSuit() == this.suit) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public int hashCode() {
        return number * suit;
    }
    public String toString() {
        return numberToString(this.number) + " of "
               + suitToString(this.suit);
    }

    public static String numberToString(int number) {
        String result = "";
        switch (number) {
            case ACE: result =  "Ace"; break;
            case 2: result = "Two"; break;
            case 3: result = "Three"; break;
            case 4: result = "Four"; break;
            case 5: result = "Five"; break;
            case 6: result = "Six"; break;
            case 7: result = "Seven"; break;
            case 8: result = "Eight"; break;
            case 9: result = "Nine"; break;
            case 10: result = "Ten"; break;
            case 11: result = "Jack"; break;
            case 12: result = "Queen"; break;
            case KING: result = "King"; break;
            case UNASSIGNED: result = "Invalid Number"; break;
        }
        return result;
    }

    public static String suitToString(int suit) {
        String result = "";
        switch (suit) {
            case DIAMONDS: result = "Diamonds"; break;
            case CLUBS: result = "Clubs"; break;
            case HEARTS: result = "Hearts"; break;
            case SPADES: result = "Spades"; break;
            case UNASSIGNED: result = "Invalid Suit"; break;
        }
        return result;
    }
}



public class CardWriter {
    public static void main(String[] args) {
        Card card = new Card(12, Card3.SPADES);
	System.out.println("Card to write is: " + card);

	try {
	    FileOutputStream out = new FileOutputStream("card.out");
	    ObjectOutputStream oos = new ObjectOutputStream(out);
	    oos.writeObject(card);
	    oos.flush();
	} catch (Exception e) {
	    System.out.println("Problem serializing: " + e);
	}
    }
}