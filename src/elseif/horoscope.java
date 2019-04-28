package elseif;

import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {

	String x = JOptionPane.showInputDialog("What is your start sign?");
	
	if(x.equals("Leo")) {
		JOptionPane.showMessageDialog(null, "The lion is the symbol for this sign because the lion embodies the best characteristics of the leo; proud, regal, relaxed, and in charge.");
}
	else if(x.equals("Virgo")) {
JOptionPane.showMessageDialog(null, "The cool, calm, clarity that this sign exudes is why the symbol of the Maiden was chosen.");
	}

else if(x.equals("Cancer")) {
JOptionPane.showInternalMessageDialog(null, "The crab symbolizes this sign for good reason.");
}
else if(x.equals("Libra")){
	JOptionPane.showMessageDialog(null, "Libra people tend to need balance in their lives like no other sign of the zodiac, which makes the symbol of the scales particularly appropriate for this sign.");
}
else if(x.equals("")) {	
JOptionPane.showMessageDialog(null,"Thats not a star sign");
}}}
