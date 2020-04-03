package week1;

import java.util.Arrays;

public class Arrayprog1 {

	public static void main(String[] args) {
		
		int[] a= {200,500,10,3000};
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i]);
			
		}
		
	Arrays.sort(a);
	
	System.out.println("Small: "+a[0]);
	System.out.println("Large: "+a[a.length-1]);

	}
	
	

}
