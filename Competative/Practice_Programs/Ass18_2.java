import java.util.*;

class Logic
{
    public void PrintEvenNumber(int num)
    {
        int iCnt = 0;

        for(iCnt  = 1; iCnt < num; iCnt++)
        {
            if(num % 2 == 0)
            {
                System.out.println(iCnt + "\t");
            }
        }
    }
}

class Ass18_2
{
    public static void main(String A[])
    {
        System.err.println("Mian running");

        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.err.println("Enter NUmber : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.PrintEvenNumber(iValue);
    }
}