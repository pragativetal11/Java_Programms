/*
    problems on strings
    Accept string and replace lower into upper character

*/

import java.util.*;

class StringX
{
    public String toUpperX(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();             //converting string into array

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = (char)(Arr[i] - 32);                  //Issue
            
        }
        return new String(Arr);                     //Converting array into string(Anonomous object)
    }
}

class program285
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String data = null;
        StringX strobj = new StringX();
        String sRet = null;

        System.out.println("Enter String: ");
        data = sobj.nextLine();

        sRet = strobj.toUpperX(data);
        System.out.println("Updated string is : " + sRet);
    }
}