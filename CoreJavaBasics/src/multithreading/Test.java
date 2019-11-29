package multithreading;

import exceptions.Calc;

public class Test {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
Calc c=new Calc();
c.start();
//Thread.sleep(10);
//c.join();
synchronized(c)
{
c.wait();
}
System.out.println(c.summ);
}

}