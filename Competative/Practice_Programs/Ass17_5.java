/*
    find Minimum of three numbers
*/

import java.util.*;

class Logic
{

    public void PrintTable(int iNo1)
    {
        for(int iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.err.println(iNo1 * iCnt);
        }
    }
}

class Ass17_5
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println(("ENter Number 1: "));
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.PrintTable(iValue);
    }
}