import java.awt.Color;

public class turtleWorld
{
    
    public static void main(String args[])
        throws InterruptedException
    {
     World turtleWorld = new World();   
     Turtle turtle1 = new Turtle(turtleWorld);
     Turtle turtle2 = new Turtle(turtleWorld);
     turtle1.setColor(Color.blue);
     turtle2.setColor(Color.blue);
     turtle1.penUp();
     turtle1.moveTo(100,100);
     turtle2.penUp();
     turtle2.moveTo(400,400);
     turtle1.penDown();
     turtle2.penDown();
     Thread.sleep(500);
     turtle1.turnRight();
     turtle1.forward(300);
     turtle2.turnLeft();
     turtle2.forward(300);
     Thread.sleep(500);
     turtle1.turnRight();
     turtle1.forward(300);
     turtle2.turnRight();
     turtle2.forward(300);
     int x_value = 150;
     int y_value = 150;
     Thread.sleep(500);
     turtle1.backward(y_value);
     turtle2.backward(y_value);
     turtle1.setColor(Color.green);
     turtle2.setColor(Color.green);
     turtle1.setPenWidth(2);
     turtle2.setPenWidth(2);
     turtle2.moveTo(100+x_value,100);
     turtle1.moveTo(100+x_value,400);
     Thread.sleep(500);
     turtle2.moveTo(100+(x_value * 2), 250);
     turtle1.moveTo(100,250);
     Thread.sleep(500);
     turtle1.moveTo(175,175);
     turtle2.moveTo(325,325);
     turtle1.setColor(Color.orange);
     turtle2.setColor(Color.orange);
     turtle1.setPenWidth(3);
     turtle2.setPenWidth(3);
     turtle1.forward(150);
     turtle2.forward(150);
     Thread.sleep(500);
     turtle1.turnLeft();
     turtle2.turnLeft();
     turtle1.forward(150);
     turtle2.forward(150);
     Thread.sleep(500);
     turtle1.backward(75);
     turtle2.backward(75);
     turtle1.setColor(Color.red);
     turtle2.setColor(Color.red);
     turtle1.setPenWidth(4);
     turtle2.setPenWidth(4);
     Thread.sleep(500);
     turtle1.moveTo(325,250);
     turtle2.moveTo(175,250);
     Thread.sleep(500);
     turtle1.moveTo(250,175);
     turtle2.moveTo(250,325);
     turtle1.hide();
     turtle2.hide();
     Turtle turtle3 = new Turtle(turtleWorld);
     turtle3.penUp();
     turtle3.moveTo(250,250);
     Thread.sleep(500);
     turtle3.setWidth(100);
     turtle3.setHeight(100);
     turtle3.moveTo(100,100);
     turtle3.penDown();
     turtle3.turnRight();
     turtle3.setPenWidth(10);
     turtle3.forward(100);
     turtle3.turn(135);
     turtle3.forward(150);
     turtle3.turn(-135);
     turtle3.forward(100);
     Thread.sleep(200);
     turtle3.penUp();
     turtle3.forward(50);
     turtle3.penDown();
     turtle3.turn(-75);
     turtle3.forward(100);
     turtle3.turn(150);
     turtle3.forward(100);
     turtle3.backward(50);
     turtle3.turn(105);
     turtle3.forward(20);
     turtle3.penUp();
     Thread.sleep(200);
     turtle3.turn(-75);
     turtle3.forward(50);
     turtle3.turn(-105);
     turtle3.forward(115);
     turtle3.penDown();
     turtle3.backward(40);
     turtle3.turnLeft();
     turtle3.forward(100);
     turtle3.turnRight();
     turtle3.forward(40);
     turtle3.penUp();
     Thread.sleep(200);
     turtle3.forward(75);
     turtle3.turnRight();
     turtle3.penDown();
     turtle3.forward(50);
     turtle3.turn(-140);
     turtle3.forward(65);
     turtle3.backward(65);
     turtle3.turn(100);
     turtle3.forward(65);
     turtle3.backward(65);
     turtle3.turn(40);
     turtle3.forward(50);
     
     
     
    }
}

