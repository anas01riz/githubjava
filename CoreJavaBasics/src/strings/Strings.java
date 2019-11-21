package strings;

public class Strings {
	
	//String - immutable
	static String str = "aa";
	static String str1 = "aa";
	//String Buffer - mutable threading not allowed
	static StringBuffer sb = new StringBuffer("Hell");
	static StringBuffer sb2 = new StringBuffer("Hello");
	//String Buffer - mutable threading allowed one at a time
	StringBuilder sb1 = new StringBuilder("Hell Yeah");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		System.out.println(sb==sb2);
//		sb.append(" No");
//		System.out.println(sb.equals(sb2));
//		
////		System.out.println(str==str1);
//		sb.append(" No");
//		System.out.println(str.compareTo(str1));
//		System.out.println(str.toLowerCase());
//		System.out.println(str.length());
//		System.out.println(str.charAt(2));
//		System.out.println(str.codePointAt(2));
//		System.out.println(str.concat("Bike"));
//		System.out.println(str.equalsIgnoreCase("str2"));
//		System.out.println(str.isEmpty());
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		System.out.println(sb.equals(sb2));
		System.out.println(sb.hashCode());
		System.out.println(sb.lastIndexOf(str));
		System.out.println(sb.toString());
//		Strings s = new Strings();
//		System.out.println(s);
		}
//	@Override
//	public String toString() {
//		return "Strings [str=" + str + ", sb1=" + sb1 + "]";
//	}

}
