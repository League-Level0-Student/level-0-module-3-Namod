//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		for(int i=0; i<10;i++) {
		int random = new Random().nextInt(100);
		String num = JOptionPane.showInputDialog("Guess what number!");
		// 2. Print out the random variable above
		JOptionPane.showConfirmDialog(null, random);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 

int numInt=Integer.parseInt(num);			
// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			if(numInt==random) {
				JOptionPane.showConfirmDialog(null, "Win");
			// 5. if the guess is correct
				// 6. Win
				System.exit(0);
			}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			else if(numInt>random) {
				JOptionPane.showConfirmDialog(null, "too high");
				// 8. Tell them it's too high
				JOptionPane.showConfirmDialog(null, "you lose");
			// 9. if the guess is low
			}			// 10. Tell them it's too low
		
			else if(numInt<random) {
				JOptionPane.showConfirmDialog(null, "too low");
		JOptionPane.showConfirmDialog(null, "you lose");
			}
			
		// 13. Tell them they lose
		
	}

	}}


