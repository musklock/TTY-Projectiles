package ttyProjectiles;
import java.util.Random;
import java.util.Scanner;

public class Projectile {
	Scanner scan;
	
	public void introToGame() {
		System.out.println("You are now in default mode."
				+ "\nYou are given a catapult that can launch projectiles, "
				+ "and a wall of some height is placed at some distance from the catapult."
				+ "To play, you will have to launch your projectile such that it goes over the wall."
				+ "Scoring rules:"
				+ "\nEvery launch costs you one point. If you make it over the wall with a huge margin, you will be awarded with "
				+ "3 points, and if you make it over the wall with a height of under 3 meters, you will be awarded with 5 points."
				+ "If you almost make it over the wall, but not quite, 1 point will be deducted. "
				+ "If you're not even close to the top, 3 points will be deducted"
				);
	}
	public void playGame() {
		Random random=new Random();
		
		int score=0;	
		double g=9.8;										//acceleration due to gravity in meters per second squared
		
		Scanner scan=new Scanner(System.in);
		System.out.println("To play, enter 'play'. To go back to the main menu, enter 'exit'");
		String decision=scan.next();
		while (decision.equals("play")) {
			double distanceFromWall=random.nextInt(20);			//distance of catapult from wall in meters 
			double heightOfWall=random.nextInt(20);				//height of wall in meters		
			System.out.println("the distance of the catapult from the wall is " + distanceFromWall + " m");
			System.out.println("the height of the wall is " + heightOfWall + " m");
			System.out.println("enter velocity in meters per second");
			double velocity=scan.nextDouble();
			System.out.println(velocity + " m/s is the velocity of your catapult");
			System.out.println("enter the angle of your projectile in degrees");			
			double angle=scan.nextDouble();
			if (angle>=90) {
				System.out.println("your projectile will not cross the wall if your angle is equal to or greater than 90!");
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
			
			System.out.println("the angle of your projectile is " + angle + " degrees");
			double a=distanceFromWall*Math.tan(Math.toRadians(angle));
			double b=g*(Math.pow(distanceFromWall,2));
			double c=2*Math.pow((velocity*Math.cos(Math.toRadians(angle))),2);
			double y=a-(b/c);
			score=score-1;
			
			double clearedByHowMuch=y-heightOfWall;
			if (clearedByHowMuch<0) {
				if (clearedByHowMuch>=-1) {
					System.out.println("not quite over");
					score=score-1;
				}else if (clearedByHowMuch<-1) {
					System.out.println("not even close");
					score=score-3;
				}
			}else if (clearedByHowMuch>=0) {
				if (clearedByHowMuch==0) {
					System.out.println("scraped the wall");
				}else if (clearedByHowMuch<=3) {
					System.out.println("you made it!");
					score=score+5;
				}else if (clearedByHowMuch>3) {
					System.out.println("plenty of room");
					score=score+3;
				}
			}
			System.out.println("your score after this round is: " + score);
			System.out.println("Would you like to play again? yes/no");
			String decision2=scan.next();
			if (decision2.equals("yes")) {
				System.out.println("cool, let's go again!");
			}else if (decision2.equals("no")) {
				System.out.println("You will be taken to the main menu");
				break;
			}else {
				System.out.println("dude you had to enter yes or no. Whatever, we're starting again");
			}
			
			
		}
				
		
	}

	

}
