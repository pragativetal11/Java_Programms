/*
    problems on strings
    Accept string and replace occuence of a to --

*/

import java.util.*;

class StringX
{
    public String Update(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();             //converting string into array

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'a' || Arr[i] == 'A')
            {
                Arr[i] = '_';
            }
        }

        String ret = new String(Arr);               //converting array into string

        return ret;
    }
}

class program278
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String data = null;
        StringX strobj = new StringX();
        String sRet = null;

        System.out.println("Enter String: ");
        data = sobj.nextLine();

        sRet = strobj.Update(data);
        System.out.println("Updated string is : " + sRet);
    }
}