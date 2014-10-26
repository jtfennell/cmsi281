import java.io.*;
import java.util.*;
/**
Sorts the words inputted via stdinput, outputs all of the words in the input sorted, displaying the number of occurences of each word 
**/
public class WordSort{
	public static ArrayList inputWords = new ArrayList();
	public static boolean inputCaseSensitive = false;

	public static void main(String[] args) throws IOException{
		if (args.length > 0) {
			inputCaseSensitive = (args[0].equals("-sensitive"));
		}

		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		String lineOfInput = stdIn.readLine();

		while (lineOfInput != null){
			identifyWords(lineOfInput);
			lineOfInput = stdIn.readLine();
		}	

		ArrayList sortedWords = sortWords(inputWords);
		printSortedWords(sortedWords);
	}

	/**sorts the words in the input file*/
	public static ArrayList sortWords(ArrayList inputWords){
			
		Collections.sort(inputWords);
		return inputWords;
	}


	/**loops through the characters in the standard input to parse words*/
	public static void identifyWords(String lineOfInput){
			String word = "";
			boolean lastCharacterLetter = false;

		//loops through the characters in the string to parse individual words
		for (int i = 0; i < lineOfInput.length(); i++ ) {
			if (Character.isLetter(lineOfInput.charAt(i))) {
				word += lineOfInput.charAt(i);
				lastCharacterLetter = true;
			}
			else{
				//checks if last character was a letter to make sure empty strings are not added to the word collection
				if (lastCharacterLetter) {
					add(word);
					word = "";
				}
				lastCharacterLetter = false;
			}
			//if last character before end of line is a letter, then it is added 
			if (i == lineOfInput.length() - 1 && Character.isLetter(lineOfInput.charAt(i))) {
				add(word);
			}
		}
	}

	public static void printSortedWords(ArrayList sortedWords){
		for(int i = 0; i < inputWords.size(); i++){
			System.out.println(((WordCounter)inputWords.get(i)).toString() + " " + ((WordCounter)inputWords.get(i)).getNumberOfAppearances());
		}
	}

	public static void add(String wordToAdd){
		if (!inputCaseSensitive) {
			wordToAdd = wordToAdd.toUpperCase();
		}
		//if there are no words in the collection, adds the word 
		if (inputWords.size() == 0) {
			inputWords.add(new WordCounter(wordToAdd));
			
		}
		else{
			//checks to see if the word has already been seen in the input
			// and increments the number of appearances if it has
			boolean seenWord = false;
			
			for (int i = 0; i < inputWords.size() ; i++ ) {
				
				if (((WordCounter)inputWords.get(i)).toString().equals(wordToAdd)) {
					((WordCounter)inputWords.get(i)).incrementAppearances();
					seenWord = true;
				}
			}
			//after iterating through the array, if the word has not been seen already, it is added to the collection
			if (!seenWord) {
				inputWords.add(new WordCounter(wordToAdd));
			}
		}
	}
}