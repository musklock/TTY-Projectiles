package ttyProjectiles;

import java.util.Random;
import java.util.Scanner;

public class SnowballFight {
	
	Scanner scan;
	
	public void introToGame() {
		System.out.println("You are now in Snowball Fight mode"
				+ "\nYou have to defeat the enemy by throwing snowballs on their snow fort."
				+ "\nScoring rules:"
				+ "\n1 point will be deducted for each launch"
				+ "\nFor every successful shot, you will be awarded with 5 points."
				+ "\nNo points will be awarded or deducted for unsucessful shots");
	}
	public void playGame() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Would you like to start the game? yes/no");		
		String response=scan.next();
		int score=0;
		double g=9.8;
		while (response.equals("yes")) {
			Random random=new Random(200);
			double distanceFromSnowFort=random.nextInt(20);			//distance of snow cannon from wall in meters 
			double heightOfSnowFort=random.nextInt(20);				//height of wall in meters		
			System.out.println("the distance of the cannon from the snow fort is " + distanceFromSnowFort + " m");
			System.out.println("the height of the snow fort is " + heightOfSnowFort + " m");
			System.out.println("enter velocity of cannonball in meters per second");
			double velocity=scan.nextDouble();
			System.out.println(velocity + " m/s is the velocity of your cannonball");
			System.out.println("enter the angle of your projectile in degrees");			
			double angle=scan.nextDouble();
			if (angle>=90) {
				System.out.println("your projectile will not reach the fort if your angle is equal to or greater than 90!");
				System.out.println("Do you want to try again? Enter 'yes' or 'no'. ");
				String ans=scan.next();
				if (ans.equals("yes")) {
					continue;
				}else if (ans.equals("no")){
					break;
				}else {
					System.out.println("you had to enter either yes or no. Whatever, we're starting again");
				}
			}
			Math.toRadians(angle);
			System.out.println(angle + " degrees is the angle of your projectile");
			double a=distanceFromSnowFort*Math.tan(Math.toRadians(angle));
			double b=g*(Math.pow(distanceFromSnowFort,2));
			double c=2*Math.pow((velocity*Math.cos(Math.toRadians(angle))),2);
			double y=a-(b/c);
			score=score-1;
			
			double spotOn=y-heightOfSnowFort;
			if (spotOn==0) {
				System.out.println(" You hit the enemy fort!");
				score=score+5;
			}else if (spotOn<0) {
				System.out.println("Frosty! Your shot went too low!");
			}else if (spotOn>0){
				System.out.println("Melted! You went too high!");
			}
			System.out.println("your score after this round is: " + score);
			System.out.println("Would you like to play again? yes/no");
			String decision2=scan.next();
			if (decision2.equals("yes")) {
				System.out.println("cool, let's go again!");
			}else if (decision2.equals("no")) {
				System.out.println("you will be taken to the main menu");
				break;
			}else {
				System.out.println("dude you had to enter yes or no. Whatever, we're starting again");
			}
			
		}
		
	}
	
	

}
