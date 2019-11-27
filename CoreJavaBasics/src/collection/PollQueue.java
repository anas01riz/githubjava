package collection;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PollQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	PriorityQueue q= new PriorityQueue();
//		PriorityQueue<String> queue= new PriorityQueue<String>();
	 q.add("Eswar");
	 q.add("Shobana");
	 q.add("Ramya");
//		System.out.println(q);
	Iterator itr = q.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
			
	}


}
