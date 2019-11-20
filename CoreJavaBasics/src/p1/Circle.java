package p1;

public class Circle extends Shape {
	
	public static void main  (String... args)
	{
//		Circle c = new Circle();
		Shape c = new Circle();
		c.draw();
		c.color();
	}
	
	@Override 
	void draw() {
		System.out.println("Circle");
	}

	@Override
	void color() {
		System.out.println("Inside Color");
		// TODO Auto-generated method stub
		
	}
}
