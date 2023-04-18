
import java.util.*;

    public class Blackjack {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Set up deck
            List<String> deck = new ArrayList<>();
            String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
            String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
            for (String suit : suits) {
                for (String rank : ranks) {
                    deck.add(rank + " of " + suit);
                }
            }

            // Shuffle deck
            Collections.shuffle(deck);

            // Set up initial hands
            List<String> dealerHand = new ArrayList<>();
            List<String> playerHand = new ArrayList<>();
            dealerHand.add(deck.remove(0));
            playerHand.add(deck.remove(0));
            dealerHand.add(deck.remove(0));
            playerHand.add(deck.remove(0));

            // Print initial hands
            System.out.println("Dealer's Hand: ");
            System.out.println(dealerHand.get(0));
            System.out.println("Card Hidden");
            System.out.println("\nYour Hand: ");
            for (String card : playerHand) {
                System.out.println(card);
            }
            System.out.println("Your Score: " + getHandValue(playerHand));

            // Player's turn
            while (true) {
                System.out.print("\nWould you like to hit or stand? ");
                String response = input.nextLine();
                if (response.equalsIgnoreCase("hit")) {
                    playerHand.add(deck.remove(0));
                    System.out.println("\nYour Hand: ");
                    for (String card : playerHand) {
                        System.out.println(card);
                    }
                    int handValue = getHandValue(playerHand);
                    System.out.println("Your Score: " + handValue);
                    if (handValue > 21) {
                        System.out.println("Bust! You lose.");
                        return;
                    }
                } else if (response.equalsIgnoreCase("stand")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }

            // Dealer's turn
            System.out.println("\nDealer's Hand: ");
            for (String card : dealerHand) {
                System.out.println(card);
            }
            int dealerHandValue = getHandValue(dealerHand);
            System.out.println("Dealer's Score: " + dealerHandValue);
            while (dealerHandValue < 17) {
                dealerHand.add(deck.remove(0));
                System.out.println("\nDealer hits.");
                System.out.println("Dealer's Hand: ");
                for (String card : dealerHand) {
                    System.out.println(card);
                }
                dealerHandValue = getHandValue(dealerHand);
                System.out.println("Dealer's Score: " + dealerHandValue);
            }
            if (dealerHandValue > 21) {
                System.out.println("\nDealer busts! You win!");
                return;
            }

            // Compare hands
            int playerHandValue = getHandValue(playerHand);
            if (playerHandValue > dealerHandValue) {
                System.out.println("\nYou win!");
            } else if (playerHandValue < dealerHandValue) {
                System.out.println("\nDealer wins. You lose.");
            } else {
                System.out.println("\nPush!");
            }
        }

        public static int getHandValue(List<String> hand) {
            int value = 0;
            int aces = 0;
            for (String card : hand) {
                String rank = card.substring(0, card.indexOf(" "));
                if (rank.equals("Ace")) {
                    value += 11;
                    aces++;
                } else if (rank.equals("King") || rank.equals("Queen") || rank.equals("Jack")) {
                    value += 10;
                } else {
                    value += Integer.parseInt(rank);
                }
            }
            while (aces > 0 && value > 21) {
                value -= 10;
                aces--;
            }
            return value;
        }
    }


