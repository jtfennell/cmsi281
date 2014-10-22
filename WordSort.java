import java.io.*;
import java.util.ArrayList;

/**
This class allows the user to pass in a text file to sort the words, return the numner of occurences of each word, and outputs the sorted list to a text file
**/

public class WordSort{
	public static ArrayList inputWords;
	public static boolean inputCaseSensitive = false;

	public static void main(String[] args) throws Exception{
		
		if (args.length > 0) {
			inputCaseSensitive = (args[0].equals("-sensitive"));
		}

		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

		String lineOfInput = stdIn.readLine();

		while (lineOfInput != null){
			parseString(lineOfInput);
			lineOfInput = stdIn.readLine();
		}		
	}
	
	public static ArrayList sortWords(ArrayList inputWords){
		
		//for compilation purposes (modify)
		return new ArrayList();
	}

	public static String parseString(String lineOfInput){
		if (!inputCaseSensitive){
			System.out.println(lineOfInput.toUpperCase());
		}
		//for compilation purposes (remove)
		return "hi";
	}

	public String toString(){
		//for compilation purposes (remove)
		return "hi";
	} 

	//public 
	
}