package fileio;

import java.io.Serializable;

public class Emp implements Serializable {
	private static final long serialVersionUID = 1L;

	private static final String Anas = null;
	
	int EmpCode;
	
	
	

	public Emp(int empCode, String name) {
		super();
		EmpCode = empCode;
//		this.name = name;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e = new Emp(10, Anas);
		System.out.println(e.EmpCode);
//		System.out.println(e.name);
		}



}
