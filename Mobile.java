package week1;

public class Mobile {
	
	boolean isStatus=false;
	
	int model=656;
	
	String brand="Nokia";
	
	
	public static void main(String[] args) {
		
		System.out.println("I'm Ready");
		
		
		Mobile nokia1=new Mobile();
		
		int model2 = nokia1.model;
		
		System.out.println(model2);
		
		String brand2 = nokia1.brand;
		
		System.out.println(brand2);
		
	boolean isStatus2 = nokia1.isStatus;
	
	System.out.println(isStatus2);
		
	}

}
