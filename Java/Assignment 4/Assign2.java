//2.Create a program to merge two arrays into a single array.

class Assign2{
	public static void main(String args[]){
		int a[]={2,4,5,6};
		int b[]={9,7,5,4};
		int c[]= new int[a.length + b.length];
		int count = 0;

		for(int i=0; i<a.length; i++){
			 c[i] = a[i];
			count ++;
		}

		for(int j=0; j<b.length; j++){
			c[count ++] = b[j];
		}
		
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]+" ");
		}
	}
}