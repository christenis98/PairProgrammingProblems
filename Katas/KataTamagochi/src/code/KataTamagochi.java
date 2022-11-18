package code;

import java.util.Scanner;

public class KataTamagochi {

	public static void main(String[] args) {
		
		Tamagochi tamagochi = new Tamagochi();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Stats: \nHungriness: " + tamagochi.getHungriness() + "\nFullness: " + tamagochi.getFullness() +
					"\nHappiness: " + tamagochi.getHappiness() + "\nTiredness: " + tamagochi.getTiredness() + 
			"\n--------------------------------------------------------------\n"
			+ "Decide next action: 1 feed, 2 play, 3 sleep, 4 poop, 5 to pass time, 6 to exit \n");
			
			int input = sc.nextInt();
			 if(input == 6) break;
			
			tamagochi.parseAction(input);

			
			final String ESC = "\033[";
			System.out.print(ESC + "2J"); 
			
		}
		
		System.out.println("\nHe died");

	}

}
