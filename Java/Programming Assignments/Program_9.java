package Programs;


public class Program_9 {
	public static void main(String[] args) {
		
		String string="Hello how are you i am fine";
		
		String[] word=string.split(" ");
		
		String smallest = word[0];
		String longest = word[0];
		
		for(String w : word) {
			if(w.length() < smallest.length()) {
				smallest=w;
			}
			if(w.length() > longest.length()) {
				longest=w;
			}
		}
		System.out.println("smallest word in the String :"+smallest);
		System.out.println("longest word in the String :"+longest);
	}
}
