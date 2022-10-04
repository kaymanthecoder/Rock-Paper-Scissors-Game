package rockPaperScissors;
import java.util.Scanner;
import java.text.ParseException;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) throws ParseException {
		Scanner Scan = new Scanner(System.in);
		Random Rand = new Random();
		int count = 0;
		
		System.out.println("Hello, what is your name? ");
		String name = Scan.nextLine();
		System.out.println("How many points to end the game? ");
		int points = Scan.nextInt();
		
		//This will add up the points during the match. Who ever wins a round get 1 point
		int userPoints = 0;
		int comPoints = 0;
		
		while(userPoints < points && comPoints < points) {
			int compChoice = Rand.nextInt(3); //the reason this is in the while loop is because the variable needs to change so that we wont know the pattern
			
			System.out.println("Hello " + name + ", Enter 0 for scissors, 1 for rock, 2 for paper,  ");
			System.out.println(name + ": " + userPoints + "		Computer: " + comPoints);
			int playerChoice = Scan.nextInt();

			if(playerChoice == compChoice) {
				System.out.println("");
				System.out.println("It is a draw!");
				System.out.println("");
			}
			else if(playerChoice == 1) {
				if(compChoice == 2) {
					System.out.println("");
					System.out.println("Computer selected paper ");
					System.out.println("Sorry " + name + ", You lost!");
					System.out.println("");
					
					comPoints = comPoints + 1;
					
				}else if(compChoice == 0);
					System.out.println("");
					System.out.println("Computer selected scissors ");
					System.out.println("Congrats " + name + ", You won!");
					System.out.println("");
					
					userPoints = userPoints + 1;
			
		}
		else if(playerChoice == 2) {
			if(compChoice == 1) {
				System.out.println("");
				System.out.println("Computer selected rock ");
				System.out.println("Congrats " + name + ", You won!");
				System.out.println("");

				userPoints = userPoints + 1;
				
			}else if(compChoice == 0);
				System.out.println("");
				System.out.println("Computer selected scissors ");
				System.out.println("Sorry " + name + ", You lost!");
				System.out.println("");
				
				comPoints = comPoints + 1;
			
		}
		else if(playerChoice == 0) {
			if(compChoice == 1) {
				System.out.println("");
				System.out.println("Computer selected rock ");
				System.out.println("Sorry " + name + ", You lost!");
				System.out.println("");

				comPoints = comPoints + 1;
				
			}else if(compChoice == 2);
				System.out.println("");
				System.out.println("Computer selected paper ");
				System.out.println("Congrats " + name + ", You won!");
				System.out.println("");

				userPoints = userPoints + 1;
				}
		}
		
		//This will display a massage as soon as the match is over
		if(userPoints > comPoints){
			System.out.println(name + " is the winner!!!!!!");
		}
		else if(userPoints < comPoints){
			System.out.println("Sorry " + name + ", the computer win!");
		}
		else {
			System.out.println("It is a draw, Folks!!!");
		}
		
		
   }
}
