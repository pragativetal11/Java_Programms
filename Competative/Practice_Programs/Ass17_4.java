/*
    find Minimum of three numbers
*/

import java.util.*;

class Logic
{

    public void FindMin(int iNo1, int iNo2, int iNo3)
    {
        if(iNo1 <= iNo2 && iNo1 <= iNo3)
        {
            System.err.println(iNo1 + " is Minimum");
        }
        else if(iNo2 <= iNo3 && iNo2 <= iNo1)
        {
            System.err.println(iNo2 + " is Minimum");
        }
        else
        {
            System.err.println(iNo3 + " is Minimum");
        }
    }
}

class Ass17_4
{
    public static void main(String A[])
    {
        int iValue1  = 0;
        int iValue2 = 0;
        int iValue3 = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println(("ENter Number 1: "));
        iValue1 = sobj.nextInt();

        System.out.println(("ENter Number 2: "));
        iValue2 = sobj.nextInt();

        System.out.println(("ENter Number 3: "));
        iValue3 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.FindMin(iValue1, iValue2, iValue3);
    }
}