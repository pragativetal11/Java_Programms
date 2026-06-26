//array creation statically

import java.util.*;

class program143
{
    public static int Summation(int Arr[])
    {
        int iSum = 0, iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum= iSum + Arr[iCnt];
        }

        return iSum;
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter the Number of Elements :");
        int ilength = sobj.nextInt();

        int Brr[] = new int[ilength];
        
        System.err.println("Enetr The Elements : ");

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array : ");

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

        int iRet = Summation(Brr);

        System.out.println("Summation is : " + iRet);

        Brr = null;              //Reference count becomes 0
        //Free Memory
        System.gc();
    }
}