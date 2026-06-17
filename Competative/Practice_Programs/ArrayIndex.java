import java.util.*;
class ArrayIndex

{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {11, 21, 51, 101, 111};

        System.out.println("Enter the index of Array : ");
        int index = sobj.nextInt();

        System.out.println("Element at the index is : "+Arr[index]);

        System.out.println("End of Application");
    }
} 
    
