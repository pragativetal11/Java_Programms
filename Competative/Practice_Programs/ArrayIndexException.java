import java.util.*;
class ArrayIndexException

{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {11, 21, 51, 101, 111};

        System.out.println("Enter the index of Array : ");
        int index = sobj.nextInt();

        try
        {
            System.out.println("Inside Try Block");
            System.out.println("Element at the index is : "+Arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println("Exception Occured" + aobj);
        }

        System.out.println("End of Application");
    }
} 
    
