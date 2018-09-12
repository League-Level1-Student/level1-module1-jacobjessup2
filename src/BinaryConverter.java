import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BinaryConverter implements ActionListener {
public static void main(String[] args) {
new BinaryConverter().createUI();
}
JFrame frame = new JFrame();

JPanel panel = new JPanel();

JButton button = new JButton();

JTextField textfield = new JTextField(20);

JLabel label = new JLabel();

void createUI() {


	frame.setVisible(true);
	
	frame.add(panel);
	
	button.setText("Convert");
	button.addActionListener(this);
	
	panel.add(button);
	panel.add(textfield);
	panel.add(label);
	
	frame.pack();
	frame.setTitle("Convert 8 bits of binary to ASCII");
}
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
				
		if (buttonPressed == button) {
		convert(textfield.getText());
		label.setText("jazz");
		}
				
	}

}
