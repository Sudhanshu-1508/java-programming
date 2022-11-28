
class Demo extends Thread
{
    public void run()
    {
        int i = 0;
        for(i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName()+" : "+i);
        }
    }
}

class ThreadDemo8
{
    public static void main(String Arg[])
    {
        System.out.println("Inside Main method");
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setName("first Thread");
        t2.setName("second Thread");

        System.out.println("Priority of t1 :"+t1.getPriority());
        System.out.println("Priority of t1 :"+t2.getPriority());

        t1.setPriority(10);
        t2.setPriority(4);

        System.out.println("Priority of t1 :"+t1.getPriority());
        System.out.println("Priority of t1 :"+t2.getPriority());

        t1.start();
        t2.start();
    }    
}
