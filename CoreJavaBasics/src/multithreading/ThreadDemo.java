package multithreading;

public class ThreadDemo implements Runnable {
	
	
	
	
	
//	Display d;
	String s;
	
	public void run() {
		for (int i=0;i<10;i++) {
//		System.out.println(Thread.currentThread().getName());
	
		System.out.println("Inside Run Method");
//		try {
//			Thread.sleep(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	}

	public static void main(String[] args) {
		
		
		
		
		// TODO Auto-generated method stub

		ThreadDemo t = new ThreadDemo();
		ThreadDemo t1 = new ThreadDemo();
//		t.start();
//		t1.start();
		
		
//		System.out.println(Thread.activeCount());
////		System.out.println(t.getPriority());
//		t.setPriority(1);
//		t1.setPriority(5);
//		System.out.println(t.isAlive());
		
		
			
			
			Cubes c1 = new Cubes();
			Square s1 = new Square();
			
			
			
			c1.cubes();
			
			try {
				s1.square();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			for (int i=0;i<10;i++) {
//				System.out.println(Thread.currentThread().getName());
				System.out.println("Inside Main Method");
//				try {
//					Thread.sleep(10);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
		}
	}
}
