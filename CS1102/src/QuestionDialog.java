import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener { // Begin of QuestionDialog class.

	String answer;
	
	public void actionPerformed(ActionEvent e) { // begin of the Actionhandler.
		
		answer = e.getActionCommand();
		
		dispose();
		
		} // End of Actionhandler.
	
	
	} // End of QuestionDialog class.
