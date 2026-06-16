import java.util.*;

class NumberX
{
    public void SumFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;

        for( iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        System.out.println("Summation of Factors :" +iSum);
    }
}

class program48
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        
        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        NumberX nobj = new NumberX();

        nobj.SumFactors(iValue);
    }
}
