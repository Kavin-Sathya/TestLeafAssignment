package week1;

public class Android {
	
	long makeid= 987654348;
	String modelname="Nokia";
	float cost=4324.55f;
	boolean isactive=true;
	int modelid=5456;
	


	public static void main(String[] args) {
		
		Android Oreo=new Android();
		
		float cost2 = Oreo.cost;
		boolean isactive2 = Oreo.isactive;
		long makeid2 = Oreo.makeid;
		int modelid2 = Oreo.modelid;
		String modelname2 = Oreo.modelname;
		
		System.out.println(cost2);
		System.out.println(isactive2);
		System.out.println(makeid2);
		System.out.println(modelid2);
		System.out.println(modelname2);
		
		

	}

}
