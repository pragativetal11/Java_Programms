//input = 11
//output = * * * # # # * * * # # 
        //1  2 3 4 5 6 7 8 9 10 11


import java.util.*;

class program188
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        int iCounter = 0;
        int i  =0;

        for(iCnt = 1; iCnt <= iNo; iCnt+=3)
        {
             i = 3*iCnt;
            for(iCounter = 1; iCounter <= 3; iCounter++)
            {
                System.out.print("*");
            }
        }
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