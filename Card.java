public class Card {
    //instance variables
    private int cardID;
    private int value;
    private String suit;

    //constructor
    public Card(int cardID, int value, String suit) {
        this.cardID = cardID;
        this.value = value;
        this.suit = suit;
    }

    //getters/setters
    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
