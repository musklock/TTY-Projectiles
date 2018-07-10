package ttyProjectiles;

import java.util.Random;
import java.util.Scanner;

public class PlayGame {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = false;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your gamer name");
		String name=scan.next();
		System.out.println("Hi " + name + "!");
		System.out.println("Are you ready to play? Enter 'yes' or 'no' ");
		String res=scan.next();
		if (res.equals("yes")) {
			a=true;;
			System.out.println();
		}else if(res.equals("no")) {
			a =false;
			System.out.println("Aww really? see you next time!");
		}else {
			System.out.println("invalid input");
			
		}
		
		
		while (a) {
			System.out.println("Choose a theme out of the following:"
					+ "\n 1. Default: shoot a projectile over a wall"
					+ "\n 2. Snowball Fight: bombard the enemy snow fort using snowballs"
					+ "\n 3. Demolish a Castle: destroy a castle in which your enemies are hiding"
					+ "\n 4. Shoot a Plane: shoot down an enemy plane in your territory"
					
					+ "\n enter 1 for Default, 2 for Snowball Fight, 3 for Demolish a Castle, and 4 for Shoot a Plane"
					+ "\n enter 'quit' to quit playing"
					);
			String theme=scan.next();
			switch(theme) {
			case "1":
				
				Projectile pr=new Projectile();
				pr.introToGame();
				pr.playGame();
				break;
			
			case "2":
				
				SnowballFight sf=new SnowballFight();
				sf.introToGame();
				sf.playGame();
				break;
				
				
			case "3":
				
				DemolishACastle dac=new DemolishACastle();
				dac.introToGame();
				dac.playGame();
				break;
			
			case "4":
				
				ShootAPlane sap=new ShootAPlane();
				sap.introToGame();
				sap.playGame();
				break;
			
			case "quit":
				a=false;
				System.out.println(name + " has quit the game");
				break;
				
			default:
				System.out.println("Invalid input. Please enter a valid input");
				continue;
			
			}
			
			
			
			
			
		}

	}
	}
