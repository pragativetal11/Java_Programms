import java.util.*;

class Logic
{
    public int iDigit = 0;
    public int iSum = 0;
    public void SumofDigits(int iNum)
    {
        while (iNum != 0) 
        {
            iDigit =iNum % 10;
            iSum = iSum + iDigit;
            iNum = iNum / 10;
        }

        System.out.println("Summation is : " + iSum);
    }
}

class Ass17_1
{
    public static void main(String A[])
    {
        int iValue  = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println(("ENter Number : "));
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.SumofDigits(iValue);
    }
}