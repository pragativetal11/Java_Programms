import java.util.Scanner;

class DynamicMemory
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;

        System.out.println("Enter Number of Elements :");

        Size = sobj.nextInt();

        //Dynamic Memory Allocation
        float Marks[] = new float[Size];    //marks is array in java but it is internally trested as pointer

        //use the momory
        

        Marks = null;
        System.gc();


    }
}