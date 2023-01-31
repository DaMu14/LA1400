package MüllerDamian;
import robocode.*;


public class WallMaster extends JuniorRobot
{ 
    public void move(){
             ahead(400);
			 turnGunRight(90);
			 turnLeft(45);
	}
    public void run(){
	
        setColors(yellow,red,blue,white,yellow);
		
    while (true) {
              move();
         }
    }

	public void onScannedRobot() {	  
		turnGunTo(scannedAngle);
		if (scannedDistance<50)
	   {
		fire(1.5);
	   }
		else
	   {
        back(200);
       }
	}

    public void onHitByBullet()
    {
        turnGunTo(hitByBulletAngle);
        fire(1);
        ahead(100);
    }

    public void onHitWall() {
        turnRight(150);
		turnGunTo(heading);
		ahead(40);
    }
}
