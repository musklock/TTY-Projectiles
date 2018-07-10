package ttyProjectiles;

import java.util.Random;
import java.util.Scanner;

public class ShootAPlane {
	Scanner scan;
	
	public void introToGame() {
		System.out.println("You are now in Shoot a Plane mode."
				+ "\nYou belong to a secret intelligence agency, and you just received intel that an enemy plane has entered"
				+ " your nation's territory.\nYou have to shoot the plane down using a ground laser shooter."
				+ "\nScoring rules:"
				+ "\n1 point will be decuted for each launch"
				+ "\nYou will be awarded 5 points for each succcessful shooting."
				+ "\nYou will not lose points for missing.");
	}
	public void playGame() {
		Scanner scan=new Scanner(System.in);
		System.out.println("To play, enter 'play'. To go back to the main menu, enter 'exit'");		
		String response=scan.next();
		int score=0;
		double g=9.8;
		while (response.equals("play")) {
			Random random=new Random(200);
			double distanceFromPlane=random.nextInt(20);			//distance of laser shooter from plane in meters 
			double altitudeOfPlane=random.nextInt(20);				//altitude of the plane in meters	
			double velocityOfPlane=245.0;
			System.out.println("the distance of the laser shooter from the plane is " + distanceFromPlane+" m");
			System.out.println("the altitude of the plane is " + altitudeOfPlane + " m");
			System.out.println("the speed of the plane is " + velocityOfPlane + " m/s");
			System.out.println("enter velocity in meters per second");
			double velocity=scan.nextDouble();
			System.out.println(velocity + " m/s is the velocity of your catapult");
			System.out.println("enter the angle of your projectile in degrees");			
			double angle=scan.nextDouble();
			if (angle>=90) {
				System.out.println("your projectile will not reach the plane if your angle is equal to or greater than 90!");
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
			double a=distanceFromPlane*Math.tan(Math.toRadians(angle));
			double b=g*(Math.pow(distanceFromPlane,2));
			double c=2*Math.pow(((velocity-velocityOfPlane)*Math.cos(Math.toRadians(angle))),2);
			double y=a-(b/c);
			score=score-1;
			
			double spotOn=y-altitudeOfPlane;
			if (spotOn==0) {
				System.out.println("you totally got it!");
				score=score+5;
			}else if (spotOn<0) {
				System.out.println("oh no, your shot went too high!");
			}else if (spotOn>0){
				System.out.println("oh no, your shot went too low!");
			}
			System.out.println("your score after this round is: " + score);
			System.out.println("Would you like to play again? yes/no");
			String decision2=scan.next();
			if (decision2.equals("yes")) {
				System.out.println("cool, let's go again!");
			}else if (decision2.equals("no")) {
				System.out.println("You will be taken to the main menu.");
				break;
			}else {
				System.out.println("dude you had to enter yes or no. Whatever, we're starting again");
			}
			
		}
		
		
	}
	
	}		


