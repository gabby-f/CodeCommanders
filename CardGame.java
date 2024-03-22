import java.util.ArrayList;
// hello
public class CardGame {
    public static ArrayList<String> buildDeck() {
        // Initializes all arrays we will need
        ArrayList<String> cardDeck = new ArrayList<String>();
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        String[] suits = {"H", "S", "C", "D"};

        // Fills the deck of cards array
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cardDeck.add(ranks[i] + suits[j]);
            }
        }
        cardDeck.add("j-0");
        cardDeck.add("j-1");

        return cardDeck;
    } // Ends buildDeck

    //Smitha's comment

    public static ArrayList<String> shuffleDeck(ArrayList<String> cards) {
        // Chooses a random number and swaps the last card with the card at that number
        for (int i = 53; i >= 0; i--) {
            int randomNum = (int)(Math.random() * 53);
            String tempVal = cards.get(i);
            cards.set(i, cards.get(randomNum));
            cards.set(randomNum, tempVal);
        }
        return cards;
    } // Ends shuffleDeck

    

    public static void main(String[] args) {
        // Calls buildDeck and shuffleDeck
        ArrayList<String> cardDeck = buildDeck();
        ArrayList<String> shuffled = shuffleDeck(cardDeck);

        ArrayList<String> Player1 = new ArrayList<String>();
        ArrayList<String> Player2 = new ArrayList<String>();
        ArrayList<String> Player3 = new ArrayList<String>();
        ArrayList<String> Player4 = new ArrayList<String>();


        for (int i = 0; i < 28; i++) {
            if (i % 4 == 0) {
                Player1.add(shuffled.get(i));
            }
            if (i % 4 == 1) {
                Player2.add(shuffled.get(i));
            }
            if (i % 4 == 2) {
                Player3.add(shuffled.get(i));
            }
            if (i % 4 == 3) {
                Player4.add(shuffled.get(i));
            }     
        }

        System.out.print("Player 1 cards: ");
        System.out.println(Player1);
        System.out.println();
        System.out.print("Player 2 cards: ");
        System.out.println(Player2);
        System.out.println();
        System.out.print("Player 3 cards: ");
        System.out.println(Player3);
        System.out.println();
        System.out.print("Player 4 cards: ");
        System.out.println(Player4);

    }

