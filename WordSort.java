/**
bugs:
	-apostrophes will be recognized as a new word.
	-single words not recognized. problem with identifyWords method
		-problem is that when a single word is inputted, if there are no delimters at the end of the word, the program does not recognize the end of the word
	-if last character of file is a letter, that word is not recognized (unless it ends with a non-letter)
	sol'n : 
To work on:
	-implement case sensitivity through command line arg
*/
import java.io.*;
import java.util.ArrayList;
/**
Sorts the words inputted via stdinput, outputs all of the words in the input sorted, displaying the number of occurences of each word 
**/
public class WordSort{
	public static void main(String[] args) throws IOException{
		ArrayList wordsSeen = new ArrayList();
		boolean inputCaseSensitive = false;
		String[] parsedWords;

		if (args.length > 0) {
			if (args[0].equals("-sensitive")) {
				inputCaseSensitive = true;
			}
			else {
				throw new IllegalArgumentException();
			}
		}

		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		String lineOfInput = stdIn.readLine();

		while (lineOfInput != null){
			parsedWords = lineOfInput.split("a-zA-Z_0-9");

			for (int i = 0;i < parsedWords.length; i++) {
				System.out.println(parsedWords[i]);
				wordsSeen.add(parsedWords[i]);
			}
			//sortWords();
			lineOfInput = stdIn.readLine();
		}

		
	}
}
