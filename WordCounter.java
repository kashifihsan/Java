import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class WordCounter {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("familynames.txt");
		Scanner fileInput = new Scanner(fin);
		
		//create 2 arraylists, one for words(force it to be string <String>)
		//and one for occurance(force it to be integer <Integer>)
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		
		while(fileInput.hasNext()){
			//Get next word
			String nextWord = fileInput.next();
			//check if the word is in ArrayList
			if(words.contains(nextWord)){
				int index = words.indexOf(nextWord);
				count.set(index, count.get(index) + 1);
			}
			else{
				words.add(nextWord);
				count.add(1);
			}
			
		}
		//close scanner and fileInput
		fileInput.close();
		fin.close();
		
		//print final results
		for(int i = 0; i < words.size(); i++){
			System.out.println(words.get(i) + "  " + count.get(i));
		}
		
		

	}

}
