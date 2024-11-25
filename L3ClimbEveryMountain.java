// Climber.java
//Climber resource class to have Climber Robot climb up and down mountain
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class L3ClimbEveryMountain
{
   public static void main(String[] args)
   {
      Display.openWorld("maps/mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(10);
   
      Climber c1 = new Climber(8);
      Climber c2 = new Climber(8);
//movement code
      c1.turnRight();
      c1.move();
      c2.turnRight();
      c2.move();
      c1.climbUpRight();
      c2.climbUpRight();
      c1.climbUpRight();
      c2.climbUpRight();
      c1.climbUpRight();
      c2.climbUpRight();
      c1.climbDownRight();
      c2.climbDownRight();
      c1.climbDownRight();
      c2.climbDownRight();
      c1.pickBeeper();
      c1.turnAround();
      c2.turnAround();
      c1.climbUpLeft();
      c2.climbUpLeft();
      c1.climbUpLeft();
      c2.climbUpLeft();
      c1.climbDownLeft();
      c2.climbDownLeft();
      c1.climbDownLeft();
      c2.climbDownLeft();
      c1.climbDownLeft();
      c2.climbDownLeft();
      c1.move();
      c1.putBeeper();
      c1.putBeeper();
      c1.move();
     
     
         
         
   }
}

      
      
      

       



      






      
         
   
     
     
     
     
 