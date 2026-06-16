//Type 2

import java.util.*;

class program41
{
    static void CheckDivisible(int iNo)     //Access Specifier = default
    {
        if((iNo % 3 == 0) && (iNo % 5 == 0))
        {
            System.out.println("Number is Divisible by 3 & 5");
        }
        else
        {
            System.out.println("Number is not divisible by 3 & 5");
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter Number to Check : ");
        iValue = sobj.nextInt();

        CheckDivisible(iValue);                 
    }
}