package p1;

public class Employee {
	
	private int id;
	private String fname;
	private String lname;
	private int empcode;
	private int mobile;
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	
	


	public Employee(int id, String fname, String lname, int empcode, int mobile) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.empcode = empcode;
		this.mobile = mobile;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1, "Anas", "Rizvi", 3225, 999);
		
//		Employee emp1 = new Employee(2, "Eswar", "Siva", 3229, 999);
//		System.out.println(emp.getClass());
		
//		Employee emp1 = new Employee();
			emp.setId(1);;
			System.out.println(emp.getId());
//			emp.setFname("Anas");
			System.out.println(emp.getFname());
//			emp.setLname("Rizvi");
			System.out.println(emp.getLname());
//			emp.setEmpcode(3225);
			System.out.println(emp.getEmpcode());
//			emp.setMobile(999);
			System.out.println(emp.getMobile());
			
	}
	

}
