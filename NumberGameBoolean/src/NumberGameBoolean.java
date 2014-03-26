
import java.util.Scanner;
import java.util.Random;
public class NumberGameBoolean {
	public static void main(String [] args){
		int game = 0 + (int) (Math.random() * 10);		
		System.out.printf("Welcome to the guess a number game, please type in a number between 0 and 10\n");		
		Scanner input = new Scanner(System.in);		
		int user = input.nextInt();
		
		//Initialize boolean values to false.
		boolean equal = false;
		boolean low =  false;
		boolean high = false;
		
		//Comparison between numbers will change one of the boolean values to true.
		if (user == game){			
			equal = true;
		}		
		else if (user < game){			
			low = true;
		}		
		else if (user > game){			
			high = true;	
		}
		
		if (equal == true) {			
			System.out.printf("Congratulations, the number %d is the correct choice. You have won the game.\n", user);
		}		
		if (low == true){			
			System.out.printf("Sorry but the number %d is too low, the correct number is %d, please try again by restarting program.\n", user , game);		
		}		
		if (high == true){			
			System.out.printf("Sorry but the number %d is too high, the correct number is %d, please try again by restarting program.\n", user , game);			
		}
	}
}
