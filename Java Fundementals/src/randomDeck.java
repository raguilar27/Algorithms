import java.util.*;
public class randomDeck {
	
	public static int randint(int a, int b){
		Random rand = new Random();
		
		int randNum = rand.nextInt(b+1 - a) + a;
		
		return randNum;
	}
	
	private static void shuffleDeck(String[] deck) {
		
		int n = deck.length;
		
		for(int i = n-1; i > 0; i--) {
			int j = randint(0,i+1);
			
			String temp = deck[i];
			deck[i] = deck[j];
			deck[j] = temp;
		}
	}

	public static void main(String[] args) {
		String[] deck = {"A","1","2","3","4","5","6","7","8","9","10","J","K","Q"};
		shuffleDeck(deck);
		
		for(int i = 0; i < deck.length; i++) {
			System.out.print(deck[i]+ " ");
		}
	}

}
