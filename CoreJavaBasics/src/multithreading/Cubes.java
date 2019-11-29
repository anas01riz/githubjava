package multithreading;

public class Cubes {
public void cubes()
{
for(int i=1;i<10;i++)
{
System.out.println("cube of "+i+" is : "+i*i*i);
try {
	Thread.sleep(10);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
}

public void run()
{
cubes();
}


}