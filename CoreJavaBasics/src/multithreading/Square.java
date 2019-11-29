package multithreading;

public class Square  {
public void square() throws InterruptedException
{
for(int i=1;i<10;i++) {
System.out.println("Square of "+i+" is : "+i*i);
Thread.sleep(10);

}

}
public void run()
{
try {
square();
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}

}