package multithreading;

public class Calc extends Thread {
public int summ=0;

public int total()
{
for(int i=1;i<100;i++)
{
summ+=i;
}
return summ;
}
public void run()
{
synchronized(this)
{
total();
this.notify();
}
}

}