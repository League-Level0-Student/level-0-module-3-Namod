package elseif;

import javax.swing.JOptionPane;

public class areyouhappy {
public static void main(String[] args) {
	
	String X =JOptionPane.showInputDialog( "Are you happy?");
	
	if( X.equals("yes")) {
		JOptionPane.showMessageDialog(null, "keep doing whatever your doing");
		
	}
	else if(X.equals("no")) {
		String A = JOptionPane.showInputDialog("Do you want to be happy?");
	if(A.equals("yes"))  {
		JOptionPane.showMessageDialog(null, "Change something");
		
}
	else if (A.equals("no")) {
		JOptionPane.showMessageDialog(null, "keep doing what ever you're doing");
}
}
}
}
