import java.util.ArrayList;
import javax.swing.*;
import java.util.List;

public class SingleResponsibilityExample {

	public static void main(String[] args) {
		var theGuess = 0;
		//Scanner input = new Scanner(System.in);
		while (theGuess!=-1) {
			
			var theMagicNumber = 7;
			
			var count = 0;
			while (theGuess != theMagicNumber) {
				count++;
				String input = JOptionPane.showInputDialog("What is your guess?");
				
				theGuess = Integer.parseInt(input);
				if (theGuess == -1)
					System.exit(0);

				if (theGuess < theMagicNumber)
					JOptionPane.showMessageDialog(null, theGuess + " is too low!");
				else if (theGuess > theMagicNumber)
					JOptionPane.showMessageDialog(null, theGuess + " is too high!");
				else if (theGuess == theMagicNumber)
					JOptionPane.showMessageDialog(null, theMagicNumber + " is correct!");
			}
			new GameResult(count, theMagicNumber);
			GameHistory.printResults();
			theGuess = 0;
			count=0;
			
		}
	}

}

class GameHistory {
	static List<GameResult> results = new ArrayList<GameResult> ();

	static void printResults() {
		System.out.println("\n\nGuesses\t Number");
		System.out.println("----------------");
		for (GameResult gameResult : results) {
			
			System.out.println(gameResult.guesses + "\t" + gameResult.magicNumber);
		}
		System.out.println("----------------");
	}
	
}

class GameResult {

	int guesses;
	int magicNumber;

	GameResult(int numberOfGuesses, int theNumber) {
		guesses = numberOfGuesses;
		magicNumber = theNumber;
		GameHistory.results.add(this);
	}
}
