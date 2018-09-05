import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BinaryConverter {
public static void main(String[] args) {
new BinaryConverter().createUI();
}

void createUI() {

JFrame frame = new JFrame();
	frame.setVisible(true);
	
	JPanel panel = new JPanel();
	
	JButton button = new JButton();
	
	JTextField textfield = new JTextField(20);
	
	JLabel label = new JLabel();
	
	
	
	
	
	
	
	frame.add(panel);
	
	panel.add(button);
	panel.add(textfield);
	panel.add(label);
	
	
	button.addMouseListener(this);
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

}
