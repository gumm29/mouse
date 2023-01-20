import java.awt.Robot;
import java.util.Random;
import java.awt.AWTException;

class Mouse{
  public static void main(String[] args) {
    try{
      Robot robot = new Robot();
      Random random = new Random();
      int y = 500;
      int x = random.nextInt(1000);
      robot.mouseMove(x, y);
    }catch(AWTException e){}
  }
}