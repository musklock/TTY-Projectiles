Name: Muskaan Mendiratta
Net ID: mmendira
Lab: MW 14.00-15.15

Classes:

1. Projectile
2. DemolishACastle
3. ShootAPlane
4. SnowballFight
5. PlayGame (main method)

Game description:
This game has 4 themes, all based on launching a projectile.
The user has to sucessfully launch a projectile such that it meets certain requirements. The user is given the height and horizontal distance from the target object, and is required to input a certain velocity and a certain angle of projectile. based on the outcome, points are awarded/deducted. 

Themes:
Default: launch a catapult such that it goes over the wall in front of it.
Demolish a Castle: launch a cannonball such that it demolishes the castle.
Shoot a Plane: aim and fire a ground laser shooter such that it hits a moving plane.
Snowball Fight: aim and throw snowballs at an enemy snow fort. 

Variables:
1. g: acceleration due to gravity
2. score		: to keep track of the user's score
3. distanceFromWall	: distance between projectile's intial position and target
   distanceFromCastle
   distanceFromPlane
   distanceFromFort	
4. heightOfWall		: height of target from ground level
   heightOfCastle
   altitudeOfPlane
   heightOfSnowFort
5. velocityOfPlane	: speed at which the plane is moving towards the projectile
6. velocity		: velocity of projectile
7. angle		: angle of projectile in degrees
8. name			: player's name	

Functions:
1. introToGame()	: prints game description
2. playGame ()		: executes the game procedure

Concepts and Formulas used:
1. Maximum height of a projectile
2. Relative motion 
3. Uniformly acelerated motion

Units used:
1. meters for distance and height
2. meters per second for velocity
3. degrees for angle

Scoring rules:
1. 1 point is deducted for every launch.
2. DEFAULT:
   +3 for going over the wall with a huge margin
   +5 for going over the wall with a less margin
   -1 for almost making it over the wall
   -3 for not even being close to the top
3. DEMOLISH A CASTLE:  
   +5 for every successful demolition
   +3 for hitting the top edge of the castle wall or going too low
   -1 for going over the top
4. SHOOT A PLANE
    +5 for every successful shooting
    no points awarded/deducted for every miss
5. SNOWBALL FIGHT
   +5 for every successful shot
   no points awarded/deducted for every miss  
	 
To get to src files, follow the path: PROJ_1-->Muskaan-->src-->ttyProjectiles	

The main method is in the class PlayGame.

This game is created and designed by Muskaan Mendiratta. 