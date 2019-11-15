package priorityq;

import java.util.*;

//comparable interface using method compareTO()

class Student implements Comparable<Student>{
	
    private int token;
    private String fname;
    private double cgpa;
    
    // generating getters and setters
	public int getToken() {
		return token;
	}


	public String getFname() {
		return fname;
	}


	public double getCgpa() {
		return cgpa;
	}


	public int compareTo(Student st)
    {
        if (getCgpa() != st.getCgpa()) { 
            return getCgpa() > st.getCgpa() ? -1 : 1; 
        } 
        int val = getFname().compareTo(st.getFname()); 
        if (val != 0) { 
            return val; 
        } 
        return getToken() < st.getToken() ? -1 : 1; 
    }
    
    
    public Student(int id, String fname, double cgpa) {
        super();
        this.token = id;
        this.fname = fname;
        this.cgpa = cgpa;
   }	    
    
}
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student> queue = new PriorityQueue<Student>();

        while(totalEvents>0){
            String event = in.next();
            if (event.equals("ENTER")){
                String name = in.next();
                double cgpa = in.nextDouble();
                int token = in.nextInt();
                queue.add(new Student(token, name, cgpa));
            }
            else if(event.equals("SERVED")){
                if (queue.size()>0){
                    queue.poll();
                }
            }
            totalEvents--;
        }
        
        if (queue.size() > 0) {
            Student st = null;
            while ((st = queue.poll()) != null) {
                System.out.println(st.getFname());
                System.out.println(st.getToken());
            }
        } else {
            System.out.println("EMPTY"); 
        }
    }
}