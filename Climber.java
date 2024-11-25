import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

public class Climber extends Robot
{
   public Climber() {
      super(1,1, Display.NORTH, Display.INFINITY);
   }
   
   
   
   public Climber(int x, int y, int direction, int beepers) {
   
      super(x,y, direction, beepers);
   }
   
   
   public void turnRight()
   {
      turnLeft();
      turnLeft();      
      turnLeft();
   }
   
   
   public void turnAround()
   {
      turnLeft();      
      turnLeft();   
   }

}
