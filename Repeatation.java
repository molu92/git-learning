package javaPrograms;
public class Repeatation {

	public static void main(String[] args) {
		
		int arr[] = {3,3,4,4,7,7,6};
		int count =0;
		
		for(int i=1	;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				count++;
			}
		}
		System.out.println("Repeatation count is "+ count);
	}

}