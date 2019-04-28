
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String x = JOptionPane.showInputDialog("Who's birthday do you want to response to?");
		// 3. Print out what the user typed

		// 4. if user asked for "mom"
		if(x.equals("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);//print mom's birthday
		}
		else if(x.equals("dadsBirthday")) {
			JOptionPane.showInternalMessageDialog(null, dadsBirthday);
		}
		else if(x.equals("your name?")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
