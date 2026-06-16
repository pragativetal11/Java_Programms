//Type 1

import java.util.*;

class program39
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number to Check : ");
        iValue = sobj.nextInt();

        if((iValue % 3 == 0) && (iValue % 5 == 0))
        {
            System.out.println(iValue +" Number is Divisible by 3 & 5");
        }
        else
        {
            System.out.println(iValue + " Number is not divisible by 3 & 5");
        }
    }
}