package multithreading;

public class RunnableDemo implements Runnable{
	
	
	public void run() {	
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunnableDemo t1 = new RunnableDemo();
		Thread t = new Thread(t1);
		Thread t2 = new Thread(t);
		t.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(t);
		}
	}
