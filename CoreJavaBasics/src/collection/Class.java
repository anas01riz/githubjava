package collection;

import java.util.ArrayList;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		int sum=0;
		for(int i=1;i<=100;i++)
//			Iterator itr = l.iterator();
//		while (itr.hasNext()){
//			System.out.println(itr.next());
//		}
		{
		al.add(i);
		if(i%2==0)
		{
		sum+=i;
		}
		}
		System.out.println(sum);

//		ArrayList l = new ArrayList();
//		
//	for (int i=0;i<=100;i++)
//	{
//		l.add(i);
//	}
	 
	
//	Iterator itr = l.iterator();
//			while (itr.hasNext()){
//				System.out.println(itr.next());
//			}
//	{
//		System.out.println(l);
//	}
		
		
	}

}
