import java.awt.*;
import javax.swing.*;


public abstract class Question {
	static int nQuestions = 0; // for counting num of questions.
	static int nCorrect = 0; // for counting num of correct answers.
	
		String ask() {
		
		question.setVisible(true);
		
		return question.answer;
		
			} // End of ask method // declaring ask method as abstract
	
	QuestionDialog question; 
	String correctAnswer; 
	
	Question (String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel (" 		" + question + " 		", JLabel.CENTER));
		
	}
	void check () { 
		nQuestions++;
		String answer = ask();
		if (answer.equals(correctAnswer)) {
			nCorrect ++;
			JOptionPane.showMessageDialog(null, "Correct!");
			}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer);
		}
	   } //End of check
	
	static void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
	} // End of showResults method
	
	void initQuestionDialog( ) {
		question.setModal(true);
		question.pack();
		question.setLocationRelativeTo(null);
	} // End of the initQuestionDialog method
	
} // End of Question class
