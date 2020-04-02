package week1;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String txt="Welcome";
		
		System.out.println("InPut: "+txt);
		
		for (int i = txt.length()-1; i>=0 ; i--) {
			
			char value=txt.charAt(i);
			
			System.out.println("output: "+ value);
			
		}
		
		
	}

}
