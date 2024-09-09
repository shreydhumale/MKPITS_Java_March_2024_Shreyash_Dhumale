//4. Write a C program to check if an array is palindrome or not.

class Assign4{
	public static boolean isPalindrome(int[] array){
		for(int i=0; i<array.length/2; i++){
			if(array[i] != array[array.length -i -1]){
				return false;
			}
		}
		return true;
	}	

	public static void main(String args[]){
		int array[]={1,3,3,1};
		if(isPalindrome(array)){
			System.out.println("array is palindrome");
		}
		else{
			System.out.println("array is not palindrome");	
		}
	}
}