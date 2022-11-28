import java.util.*;

class AgeInvalid extends Exception
{
    AgeInvalidException(String str)
    {
        super(str);
    }
    
}

class UserDefined
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter your age :");
        int iAge  = sobj.nextInt();

        try
        {
            if(iAge < 15)
            {
                throw new AgeInvalidException("Your age is less than 15");
            }
            else
            {
                System.out.println("aGE IS valid");
            }
        }

        catch(AgeInvalidException obj)
        {
            System.out.println(obj);
        }
    }

}
