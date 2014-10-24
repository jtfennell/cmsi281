/**
use WordCounter objects to store the words and their word counts

bugs:
	-apostrophes will be recognized as a new word.
	-single words not recognized. problem with identifyWords method
		-problem is that when a single word is inputted, if there are no non-letter characters at the end of the word, the program does not recognize the end of the word
	-if last character of file is a letter, that word is not recognized (unless it ends with a non-letter)
To work on:
	-implement case sensitivity through command line arg
*/
import java.io.*;
import java.util.ArrayList;
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

		sortWords();
		printSortedWords();
	}

	/**sorts the words in the input file using mergeSort algorithm */
	public static ArrayList sortWords(ArrayList inputWords){
		
		if (inputWords.size() == 1){
			return inputWords;
		}
		else{
			int centerOfArray = (int) Math.floor(inputWords.size() / 2);
			boolean numberWordsOdd = (inputWords.size() % 2) != 0;
			WordCounter lastWord = inputWords.get(inputWords.size() - 1);

			//breaks the original array into two smaller arrays
			ArrayList rightSubArray = new ArrayList();
			ArrayList leftSubArray = new ArrayList();

			for (int i = 0; i < centerOfArray ; i++ ) {
				leftSubArray.set(i, inputWords(i));
				rightSubArray.set(i, inputWords(i + centerOfArray));
			}

			if (numberItemsOdd) {
				rightSubArray.add(lastItem);
			}
		}
		sortWords(leftSubArray);
		sortWords(rightSubArray);
		ArrayList sortedWords = merge(leftSubArray, rightSubArray);

		return sortedWords;
	}

	public static merge(ArrayList leftSubArray, ArrayList rightSubArray){

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
		}
	}

	public static void printSortedWords(){
		for(int i = 0; i < inputWords.size(); i++){
			System.out.println(((WordCounter)inputWords.get(i)).toString() + " " + ((WordCounter)inputWords.get(i)).getNumberOfAppearances());
		}
	}

	public static void add(String wordToAdd){
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
	