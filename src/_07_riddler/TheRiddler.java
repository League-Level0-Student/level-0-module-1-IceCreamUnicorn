package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0
import javax.swing.JOptionPane;


public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			String riddleone = JOptionPane.showInputDialog("A hamburger walked into a bar. Why wasn't he served?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(riddleone.equals("We don't serve food here.")) 
		{
			score+=1;
		}
		else
		{
		JOptionPane.showMessageDialog(null, "ur bad");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		String riddletwo = JOptionPane.showInputDialog("What goes up but never comes down?");
		
		if(riddleone.equals("A rocket ship ")) 
		{
			score+=1;
		}
		else
		{
		JOptionPane.showMessageDialog(null, "ur bad");
			}
		String riddlethree = JOptionPane.showInputDialog("What is 3 + 3?");
		
		if(riddleone.equals("69420")) 
		{
			score+=1;
		}
		else
		{
		JOptionPane.showMessageDialog(null, "ur bad");
			}
		}
	}

