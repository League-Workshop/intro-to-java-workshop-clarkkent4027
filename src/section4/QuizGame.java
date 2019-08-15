package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score=0;
		// 2.  Ask the user a question 
				String answer=JOptionPane.showInputDialog("What day of the week is today?");
		// 3.  Use an if statement to check if their answer is correct
				if(answer.equalsIgnoreCase("Thursday")) {
					JOptionPane.showMessageDialog(null,"Correct!");
					}
		// 4.  if the user's answer was correct, add one to their score 
				if(answer.equalsIgnoreCase("Thursday")) {
					score+=1;
				}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
				String answer1=JOptionPane.showInputDialog("What month is it?");
				if(answer1.equalsIgnoreCase("August")) {
					JOptionPane.showMessageDialog(null,"Correct!");
					}
                if(answer1.equalsIgnoreCase("August")) {
					score+=1;
				}
            	String answer2=JOptionPane.showInputDialog("Are you good at coding?");
				if(answer2.equalsIgnoreCase("Yes")) {
						}
				JOptionPane.showMessageDialog(null,"Correct!");
                if(answer2.equalsIgnoreCase("Yes")) {
					score+=1;
				String answer3=JOptionPane.showInputDialog("Is your name Charlie?");
				if(answer3.equalsIgnoreCase("no")) {
					JOptionPane.showMessageDialog(null,"Correct!");
					}
				  if(answer3.equalsIgnoreCase("no")) {
						score+=1;
					}
				  String answer4=JOptionPane.showInputDialog("Are you AMAZING?");
					if(answer4.equalsIgnoreCase("Yes")) {
						JOptionPane.showMessageDialog(null,"Correct!");
						}
					  if(answer4.equalsIgnoreCase("Yes")) {
							score+=1;
						}
		// 6.  After all the questions have been asked, print the user's score 
					  JOptionPane.showMessageDialog(null,score);			
	}
	}
}
