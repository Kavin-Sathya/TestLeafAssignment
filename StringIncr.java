package week1;

public class StringIncr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String txt="A1B2C3";
		
		System.out.println("InPut: "+txt);
		
		System.out.println("OutPut: ");
		
		for (int i = 0; i<txt.length() ; i++) {
			
			char value=(char) ((txt.charAt(i))+1);
			System.out.print(value);
		}
		
		
		
		
	}

}
