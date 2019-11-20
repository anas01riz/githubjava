package interface_basics;

public interface Interface_Basics {

	int emp=1;
	void draw();
	void getArea();
	void setArea();
	void fillColor();
	default void applyColor() {
		System.out.println("Color Applied");
	}
	static void done() {
		System.out.println("Dimessions Updated");
	}
	
	
}
