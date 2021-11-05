
public class Quiz {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Question question1 = new MultipleChoiceQuestion("Who is the fastest man?",
				"Bolt", "Batman", "Superman", "The Flash", "Quicksilver", 
				"d");//First question
		question1.check();
		
		Question question2 = new MultipleChoiceQuestion("Who is the strongest "
				+ "character?",
				"Hulk", "Saitama", "Son Goku", "Sasuke", "Hisoka", 
				"c");//Second question
		question2.check();
		
		Question question3 = new MultipleChoiceQuestion("Who is the smartest"
				+ " one alive?",
				"Light", "Conan", "Kaito Kid", "Sherlock Holmes", "L", 
				"e");//Third question
		question3.check();
		
		Question question4 = new MultipleChoiceQuestion ("Itachi killed his village"
				+ " because he ?",
				"wanted to save Sasukes life", "wanted to punish Sasuke", 
				"was ordered from another village", "hated the village", "was ordered from"
						+ " the Akatsuki", 
				"a");//Fourth question
		question4.check();
		
		Question question5 = new MultipleChoiceQuestion("What is the favourit food"
				+ " for Ryuk the shinigami?",
				"Ramen", "Apple", "pizza", "Burger", "Fries", 
				"b");//Fifth question
		question5.check();
	
		Question question6 = new TrueFalseQuestion ("Itachi can win against Kakashi?", "T");
		question6.check();
		
		Question question8 = new TrueFalseQuestion ("In the Originals, Klaus is stronger"
				+ " than his Father?", "YES");
		question8.check();
		
		Question question9 = new TrueFalseQuestion ("In the Vampire Diaries, Boni loved Stefan"
				+ "more than Damon?", "FALSE");
		question9.check();
		
		Question question10 = new TrueFalseQuestion ("In one Piece, it is not possible to "
				+ "have more than one devil fruit?", "F");
		question10.check();
		
		Question question11 = new TrueFalseQuestion ("In Bleach, Ichigo has loved Orihimi?", 
				"N");
		question11.check();
		
		
		Question.showResults();
		
		
		} // End of main.
	} // End of class.
