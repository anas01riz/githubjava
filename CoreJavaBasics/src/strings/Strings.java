package strings;

public class Strings {
	
	//String - immutable
	String str = "New";
	static //String Buffer - mutable threading not allowed
	StringBuffer sb = new StringBuffer("Hell");
	
	//String Buffer - mutable threading allowed one at a time
	StringBuilder sb1 = new StringBuilder("Hell Yeah");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sb);
		sb.append(" No!");
		System.out.println(sb);
	}

}
