/*
    Check number id palindrome or not
*/

import java.util.*;

class Logic
{

    public void CheckPalindrome(int iNum)
    {
         int iDigit = 0;
         int iSum = 0;
        int iRev = 0;
        int iTemp = iNum;

        while (iNum != 0) 
        {
            iDigit =iNum % 10;
            iRev = (iRev*10) + iDigit;
            iNum = iNum / 10;
        }
        if(iRev == iTemp)
        {
            System.err.println("Number is Palindrome");
        }
        else
        {
            System.out.println("Number is not Plaindrome");
        }
    }
}

class Ass17_2
{
    public static void main(String A[])
    {
        int iValue  = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println(("ENter Number : "));
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CheckPalindrome(iValue);
    }
}