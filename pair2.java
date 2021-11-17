package GenericAssignments;

public class pair2{


	public static void main(String[] args) {
		pair<String, String> p = new pair<>("shah", "111");
		System.out.println(p.toString());
		p.setKey("syed");
		p.setValue("999");
		System.out.println(p.toString());
		
		pair<String ,java.util.Date> p1 = new pair<>("Today is",(new java.util.Date()));
		System.out.println(p1.toString());
	}
	}