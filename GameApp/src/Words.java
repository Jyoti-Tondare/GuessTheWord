import java.util.Random;

public class Words {

	private String[] randomWords={"Animals","happiness","indefinite","Steady","birthday","Extreame","rights",
			"properties","ceremony","independence","beneath","information","Students","Exployed"};
	
	private String selectedWord;
    Random random=new Random();
    char[] letters;
	
	public Words() {
		selectedWord=randomWords[random.nextInt(randomWords.length)];
		letters=new char[selectedWord.length()];
	}
	public String toString() {
//		String word="";
//		letters[2]='a';
		
		StringBuilder text=new StringBuilder();
//		letters[1]='a';
		
		for(char letter:letters) {
			text.append(letter=='\u0000'?'-':letter);
//			if(letter=='\u0000') {
////				word+='-';
//				text.append('-');
//			}else {
////				word+=letter;
//				text.append(letter);
//			}
//			word+=' ';
			text.append(' ');
		}
		
//		return word;
		return text.toString();
	}
	
	
	public boolean isGuessedRight() {
		for(char letter:letters) {
			if(letter=='\u0000') {
				return false;
			}
		}
		return true;
	}
	public boolean guess(char letter) {
		boolean guessRight=false;
		
		for(int i=0;i<selectedWord.length();i++) {
			if(letter==selectedWord.charAt(i)) {
				letters[i]=letter;
				guessRight=true;
			}
		}
		return guessRight;
		
	}
}
