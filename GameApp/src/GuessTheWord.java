import java.util.Scanner;

public class GuessTheWord {

	private Scanner sc = new Scanner(System.in);
	private boolean play = true;
	private Words randomWord = new Words();
	private int rounds = 10;
	private char lastRound;

	public void start() {
		// TODO Auto-generated method stub
		do {

			showWord(randomWord);
			getInput(randomWord);
			checkInput(randomWord);

		} while (play);
	}

	void showWord(Words randomWord) {
		System.out.println("You have" + rounds + " tries left.");
		System.out.println(randomWord);

	}

	void getInput(Words randomWord) {
		System.out.println("Enter a letter to guess the word");
		String userGuess = sc.nextLine();
		lastRound = userGuess.charAt(0);
//		char letter;

	}

	void checkInput(Words randomWord) {

		boolean isGuessRight = randomWord.guess(lastRound);

		if (isGuessRight) {
			if (randomWord.isGuessedRight()) {
				System.out.println("Congrats, you won!");
				System.out.println("The word is:" + randomWord);
				play = false;
			}
		}else {
			rounds--;
			if(rounds==0) {
				System.out.println("Game Over!!");
				play=false;
			}
		}
	}

	public void end() {
		sc.close();

	}

}
