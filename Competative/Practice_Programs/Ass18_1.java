import java.util.*;

class Logic
{
    public void CheckPrime(int num)
    {
        int iCnt = 0;

        if(num <= 1)
        {
            System.err.println("Number is not prime");
            return;
        }

        for(iCnt = 2; iCnt <= num/2; iCnt++)
        {
            if(num % iCnt == 0)
            {
                System.err.println("Number is not Prime");
                return;
            }
        }
        System.err.println("Number is Prime");
    }
}

class Ass18_1
{
    public static void main(String A[])
    {
        System.err.println("Mian running");

        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.err.println("Enter NUmber : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CheckPrime(iValue);
    }
}