package ttyProjectiles;

import java.util.Random;
import java.util.Scanner;

public class DemolishACastle {
	Scanner scan;
	public static void takeInput(String ques) {
		Scanner scan=new Scanner(System.in);
		System.out.println(ques);
	}
	public void introToGame() {
		System.out.println("You are now in Demolish a Castle mode."
				+ "\nThy clan's enemies art hiding in ye olde castle. Demolish the castle to protect thy family. "
				+ "\nTo play, you will have to launch a cannonball from a cannon such that it hits the right spot."
				+ "\nScoring rules:"
				+ "\n1 point will be deducted for each launch"
				+ "\nYou will be awarded with 5 points after each successful demolition"
				+ "\nYou will be awarded with 1 point if your shot touches the edge of the wall or goes too low"
				+ "\nYou will be penalized with 1 point if the shot goes over the wall");
	}
	public void playGame() {
		Scanner scan=new Scanner(System.in);
		System.out.println("To play, enter 'play'. To go back to the main menu, enter 'exit'.");		
		String response=scan.next();
		int score=0;
		double g=9.8;
		while (response.equals("play")) {
			Random random=new Random(200);
			double distanceFromCastle=random.nextInt(20);			//distance of cannon from the castle in meters 
			double heightOfCastle=random.nextInt(20);				//height of the castle in meters		
			System.out.println("the distance of the cannon from the castle is " + distanceFromCastle + " m");
			System.out.println("the height of the castle is " + heightOfCastle + " m");
			System.out.println("enter velocity of cannonball in meters per second");
			double velocity=scan.nextDouble();
			System.out.println(velocity + " m/s is the velocity of your cannonball");
			System.out.println("enter the angle of your projectile in degrees");			
			double angle=scan.nextDouble();
			if (angle>=90) {
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
			System.out.println(angle + " degrees is the angle of your projectile");
			double a=distanceFromCastle*Math.tan(Math.toRadians(angle));
			double b=g*(Math.pow(distanceFromCastle,2));
			double c=2*Math.pow((velocity*Math.cos(Math.toRadians(angle))),2);
			double y=a-(b/c);
			score=score-1;
			
			double spotOn=y-heightOfCastle;
			if (spotOn==0) {
				System.out.println("oh no, it just touched the edge of the wall!");
				score=score+1;
			}else if (spotOn<0) {
				if(spotOn<-3) {
					System.out.println("oh no, your shot went too low!");
					score=score+1;
				}else {
					System.out.println("you have successfully demolished the castle");
					score=score+5;
				}
				
			}else if (spotOn>0){
				System.out.println("oh no, your shot went over the castle!");
				score=score-1;
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
