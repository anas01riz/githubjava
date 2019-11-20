package interface_basics;


public class Test  {
	static int x =20;
	static int y= 30;
	int z=100;
	int a=9;
	int l;
	
	
	
	//Static Block 
	static {
	System.out.println(x+y);
	}
	//Instance Block
	{
		l=20;
		System.out.println(l);
	}
	
	

	public Test(int z, int a) {
		super();
		this.z = z;
		this.a = a;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Main Method");
		
		Test t = new Test(10, 20);
		
		
//		Interface_Basics s = new Square();
//		s.draw();
//		s.getArea();
//		s.setArea();
//		s.fillColor();
//		System.out.println(s.emp);
//		s.applyColor();
//		Interface_Basics.done();

	}

}
