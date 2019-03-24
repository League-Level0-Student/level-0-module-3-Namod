//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot r2d2 = new Robot();
		//3. Ask the user what color they would like the robot to draw
	
		String X = JOptionPane.showInputDialog("what color you would like the robot to draw?(RED?BLUE?GREEN?");
		//5. Use an if/else statement to set the pen color that the user requested
if(X.equals("red")) {
	r2d2.setPenColor(Color.RED);
}
else if (X.equals("blue")) {
	r2d2.setPenColor(Color.BLUE);
}
else if(X.equals("green")) {
	r2d2.setPenColor(Color.GREEN);
}
        //6. If the user doesn’t enter anything, choose a random color
else {
r2d2.setRandomPenColor();
	}
r2d2.penDown();
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
r2d2.setSpeed(9000);		
r2d2.move(50);
		r2d2.turn(90);
		r2d2.move(50);
		r2d2.turn(90);
		r2d2.move(50);
		r2d2.turn(90);
		r2d2.move(90);
		//4. Set the pen width to 10
		r2d2.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
