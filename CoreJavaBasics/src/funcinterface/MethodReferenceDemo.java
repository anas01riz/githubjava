package funcinterface;

public class MethodReferenceDemo implements ISquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//(num) -> num*num;
		MethodReferenceDemo mrd = new MethodReferenceDemo();
		ISquare ref = mrd :: square;
		System.out.println(ref.square(10)); //100
	}
	public int square(int num) {
		// TODO Auto-generated method stub
		return num * num ;
	}
}

@FunctionalInterface
interface ISquare
{
	public int square(int num);
}	

