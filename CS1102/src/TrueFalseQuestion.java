
import javax.swing.*;

import javax.swing.JLabel;

public class TrueFalseQuestion extends Question {

	
	TrueFalseQuestion (String question, String answer) { // Begin of Constructor
		super(question);
		JPanel buttons = new JPanel();
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		this.question.add(buttons);
		initQuestionDialog();
		answer = answer.toUpperCase();
		switch (answer) {
		case "F", "N", "FALSE", "NO": {
			correctAnswer = "FALSE";
			break;
			}
		case "T", "Y", "TRUE", "YES": {
			correctAnswer = "TRUE";
			break;
			}
		default: {
			System.out.println("Enter either TRUE or FALSE in the answer slot!");
			}
		}
		
	} // End of constructor
	
	void addButton(JPanel buttons, String label) { //Begin of addButton method.
		
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	} // End of addButton method.
	
} // End of TrueFalseQuestion class
