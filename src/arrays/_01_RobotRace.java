package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	//2. create an array of 5 robots.
Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
for(int i=0; i<robots.length; i++) {
	robots[i] = new Robot();
	robots[i].setX(150+i*150);
	robots[i].setY(500);
	robots[i].setSpeed(25);
}
	//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
boolean crossed = false;
while(crossed == false) {
for(Robot robot : robots) {
	Random rand = new Random();
	robot.move(rand.nextInt(50));
	robot.getY();
	if(robot.getY()<=0) {
		crossed = true;
	}
}
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!
JOptionPane.showMessageDialog(null, "Yay! Robot won!");
	//8. OPTIONAL: try different races with different amounts of robots.

	//9. OPTIONAL: make the robots race around a circular track.

}
}
