/*
    find Maximum of two numbers
*/

import java.util.*;

class Logic
{

    public void FindMax(int iNo1, int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.err.println(iNo1 + " is Maximum");
        }
        else
        {
            System.err.println(iNo2 + " is Maximum");
        }
    }
}

class Ass17_3
{
    public static void main(String A[])
    {
        int iValue1  = 0;
        int iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println(("ENter Number 1: "));
        iValue1 = sobj.nextInt();

        System.out.println(("ENter Number 2: "));
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.FindMax(iValue1, iValue2);
    }
}