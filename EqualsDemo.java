class Demo
{
    public int No1, No2;

    public Demo(int a, int b)
    {
        No1 = a;
        No2 = b;
        
    }
}

class EqualsDemo
{
    public static void main(String arg[])
    {

        String s1 = "Hello";
        String s2 = "Hello";

        Demo obj1 = new Demo(11,21);
        Demo obj2 = new Demo(11,21);

        System.out.println("HashCode of s1 :"+s1.hashCode());
        System.out.println("HashCode of s1 :"+s2.hashCode());

        if(s1.equals(s2))       //if("Hello" == "Hello")
        {
            System.out.println("Objects are same");
        }
        else
        {
            System.out.println("Objects are different");
        }

        if(s1 == s2)      //if(hashCode of s1 == hashCode pf s2)
        {
            System.out.println("Objects are same");
        }
        else
        {
            System.out.println("Objects are different");
        }
    }
}