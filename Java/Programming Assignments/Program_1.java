package Programs;

public class Program_1 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 5, 6, 7, 8, 3, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        
        int sum=0;
        for(int i=0; i<arr.length; i+=3) {
        	int square = arr[i] * arr[i];
        	
        	sum += square;
        }
        System.out.println("sum of square of every 3rd element :"+sum);
	}
}
