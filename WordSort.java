/**
use WordCounter objects to store the words and their word counts

bugs:
	-apostrophes will be recognized as a new word.
	-single words not recognized. problem with identifyWords method
	-3 empty strings being saved as words

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

			printSortedWords();
		}	
	}
	/**sorts the words in the input file using mergeSort 
	*/
	/**
	public static ArrayList sortWords(ArrayList inputWords){
		
		if (inputWords.size() == 1){
			return inputWords;
		}
		else{
			ArrayList leftArray = 
			ArrayList rightArray = 
		}
	}
	*/

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
					inputWords.add(word);
					System.out.println(word);
					word = "";
				}
				lastCharacterLetter = false;
				
				
			}
		}
	}

	public String toString(){
		//for compilation purposes (remove)
		return "hi";
	} 

	public static void printSortedWords(){
		for(int i = 0; i < inputWords.size(); i++){
		}
	}

	public static void wordAlreadySeen(){

	}

}