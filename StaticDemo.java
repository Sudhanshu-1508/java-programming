
class StaticDemo
{
    static
    {
        System.out.println("Inside static block of StaticDemo class which contains main");
    }


    public static void main(String arg[])
    {
        System.out.println("Inside main");
        System.out.println("value of static no3:"+Demo.iNo3);
        System.out.println("value of static no4:"+Demo.iNo4);
        Demo.gun();

        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.Fun();
        
    }
    public StaticDemo()
    {
        System.out.println("Inside constructor of StaticDemo");
    }
}

class Demo
{
    public int iNo1;              //non static characteristics
    public int iNo2;              //non static characteristics
    public static int iNo3;              //static characteristics
    public static int iNo4;              //static characteristics


    public Demo()
    {
        System.out.println("Inside Constructor");
        iNo1 = 11;
        iNo2 =21;

    }
    public void Fun()
    {
        System.out.println("Inside non static method Fun");
        System.out.println("value of no1 :"+this.iNo1);
        System.out.println("value of no2 :"+this.iNo2);
        System.out.println("value of no3 :"+this.iNo3);
        System.out.println("value of no4 :"+this.iNo4);
        
    }
    public static void gun()
    {
        System.out.println("Inside  static method gun");
       // System.out.println("value of no1 :"+iNo1);
       // System.out.println("value of no2 :"+iNo2);
        System.out.println("value of no3 :"+iNo3);
        System.out.println("value of no4 :"+iNo4);       
    }
    static
    {
        System.out.println("Inside static block ");
        iNo3 = 51;
        iNo4 = 101;
    }
}
