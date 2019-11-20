package p1;

public class ClassChild extends ClassParent {
	
//	static void m3() {
//		
//		System.out.println("M3");
//		
//	}
//	
	void m4() {
		System.out.println("M4");
		
	}
	
	void m5 () {
		System.out.println("M5");
	}
	
	private void m1() {
		System.out.println("M1");
	}

	public static void main(String[] args) {
		
		
		ClassChild c = new ClassChild();
		c.m1();
//		c.m2();
		c.m3();
//		m1();
		
		
		
		
		
		// TODO Auto-generated method stub
//		System.out.println(ClassA.m1);
//		//System.out.println(ClassA.m2);
//		System.out.println(ClassA.m3);
//		System.out.println(ClassA.m4);

	}

}
