//input = 3
//output = *1* *2*  *3*  

import java.util.*;

class program175
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*"+iCnt+"*\t");
        }
        System.out.println();
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter number of Elements :");
        iValue = sobj.nextInt();

        Display(iValue);
    }
}