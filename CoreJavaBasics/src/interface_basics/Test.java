package interface_basics;


public class Test  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface_Basics s = new Square();
		s.draw();
		s.getArea();
		s.setArea();
		s.fillColor();
		System.out.println(s.emp);
		s.applyColor();
		Interface_Basics.done();

	}

}
