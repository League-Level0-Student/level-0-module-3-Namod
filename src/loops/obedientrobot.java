package loops;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientrobot {
public static void main(String[] args) {
	String x =JOptionPane.showInputDialog("What shape would you like to see?(circle,square,triangle");

	
	
	Robot r2d2 = new Robot();	
	r2d2.penDown();
	r2d2.setPenColor(Color.RED);
	r2d2.setSpeed(5000);


	
	
	if(x.equals("square")) {
	
		drawSquare(r2d2);
		
	}
		else if(x.equals("triangle")) {
drawTriangle(r2d2);
		}
if(x.equals("circle")) {

drawCircle(r2d2);
}



}

static void drawSquare(Robot r2d2) {
	r2d2.move(100);
	r2d2.turn(90);
	r2d2.move(100);
	r2d2.turn(90);
	r2d2.move(100);
	r2d2.turn(90);
	r2d2.move(100);

}
static void drawTriangle(Robot r2d2) {
	r2d2.turn(120);
	r2d2.move(100);
	r2d2.turn(120);
	r2d2.move(100);
	r2d2.turn(120);
	r2d2.move(100);
}
static void drawCircle(Robot r2d2) {
	for(int i=0; i<360;i++) { 
		r2d2.move(1);
		r2d2.turn(1);
}
}
}

