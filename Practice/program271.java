/*
    problems on strings
    Accept string and count capital letters from string (using separate class)

*/

import java.util.*;

class StringX
{
    public int CountCapital(String str)
    {
        int iCount = 0;
        int i = 0;

        for(i = 0; i < str.length(); i++)           
        {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')        
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSmall(String str)
    {
        int iCount = 0;
        int i = 0;

        for(i = 0; i < str.length(); i++)           
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')        
            {
                iCount++;
            }
        }
        return iCount;

    }
}

class program271
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String data = null;
        StringX strobj = new StringX();
        int iRet = 0;

        System.out.println("Enter String: ");
        data = sobj.nextLine();

        iRet = strobj.CountCapital(data);

        System.out.println("Number of capital Characters : " + iRet);

        iRet = strobj.CountSmall(data);

         System.out.println("Number of small Characters : " + iRet);
    }
}