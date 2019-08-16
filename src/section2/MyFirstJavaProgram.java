package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {{
	
	public static void main(String[] args) {
		
		// START HERE
Robot clark=new Robot();	
clark.penDown();
clark.setSpeed(100);
for(int i=0;i<4;i++) {
	clark.move(150);
	clark.turn(90);

