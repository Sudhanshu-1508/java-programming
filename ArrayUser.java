import java.util.Scanner;

class ArrayUser
{
    public static void main(String arg[])
    {
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the size of array :");

        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("number of elements in the array are :"+Arr.length);
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println(("Elements of the array are :"));
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
        int iAns = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iAns = iAns + Arr[iCnt];
        }
        System.out.println("addition is : "+iAns);
    }
}