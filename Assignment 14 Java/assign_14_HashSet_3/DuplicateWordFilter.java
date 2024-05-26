package assign_14_HashSet_3;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateWordFilter {
	HashSet<String>words=new HashSet<String>();
	
	public void addWord(String word) {
		words.add(word);
	}
	public boolean checkWord(String word) {
		return words.contains(word);
	}
	public void removeWord(String word) {
		words.remove(word);
	}
	public void displayWords() {
		for(String dispWords:words) {
			System.out.println(dispWords);
		}
	}
	
	public static void main(String[] args) {
		DuplicateWordFilter D1=new DuplicateWordFilter();
Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("\nDuplicate word filter");
            System.out.println("1. Add a new word");
            System.out.println("2. Check if the word exists");
            System.out.println("3. Remove word");
            System.out.println("4. Display all unique words");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            Integer choice=scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
			case 1:
				System.out.println("Enter word to add :");
				String wordString=scanner.next();
				D1.addWord(wordString);
				break;
				
			case 2:
				System.out.println("Enter a word to check if it exists :");
				String checkWord=scanner.next();
				if(D1.checkWord(checkWord)) {
					System.out.println("word exists");
				}else {
					System.out.println("word does not exists.. ");
				}
				break;
				
			case 3:
				System.out.println("Enter a word to remove :");
				String removeWord=scanner.next();
				D1.removeWord(removeWord);
				break;
				
			case 4:
				D1.displayWords();
				break;
				
			case 5:
				System.out.println("Exiting...");
				return;

			default:
				break;
			}
	}
	}
}
