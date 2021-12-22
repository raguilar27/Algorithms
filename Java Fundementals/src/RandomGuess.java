import java.util.Random;

public class RandomGuess {

	private static int verify(int guess, int solution) {
		if(guess == solution)
			return 0;
		else if(guess < solution)
			return -1;
		else 
			return 1;
	}
	
	public static void main(String[] args) {
		
		int upperLimit = 1000000, lowerLimit = 1;
		
		Random rand = new Random();
				
		int solution = rand.nextInt(upperLimit+1 - lowerLimit) + lowerLimit;
		int count = 0, result = 0, guess = -1;
		
        System.out.println("The number to look for: " + solution);
		
		while(count < 50) {
			guess = rand.nextInt(upperLimit+1 - lowerLimit) + lowerLimit; 
			//System.out.println("upperLimit: " + upperLimit);
			//System.out.println("LowerLimit: " + lowerLimit);
			//System.out.println("Guess: " + guess);
			//System.out.println(" ");
			
			result = verify(guess, solution);
			if(result == 0) {
				System.out.println("You have guessed the number "+guess+" correctly in " +count+" attempts!");
				break;
			}else if(result == 1) {
				upperLimit = guess;
			}else if(result == -1) {
				lowerLimit = guess;
			}
			count++;
		}
		
		if(count == 50) {
			System.out.println("You did not guess correctly! and have no more guesses");
		}
		
	}

}
