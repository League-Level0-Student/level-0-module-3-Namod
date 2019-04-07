package elseif;

import javax.swing.JOptionPane;

public class areyouhappy {
public static void main(String[] args) {
	
	String X =JOptionPane.showInputDialog( "Are you happy?");
	
	if( X == Yes) {
		JOptionPane.showConfirmDialog(null, "keep doing whatever your doing");
		
	}
	else if(X=="no") {
}
}
}
