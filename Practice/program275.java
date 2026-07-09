/*
    problems on strings
    Accept string and count capital, small, space, special symbols and Digits letters from string (converting string into char array)

*/

import java.util.*;

class StringX
{
    public int CountCapital(String str)
    {
        int iCount = 0;
        int i = 0;

        char Arr[] = str.toCharArray();             //converting string into character array

        for(i = 0; i < Arr.length; i++)           
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')          //count capital letters
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

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)           
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')                      //count small letters
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountDigits(String str)
    {
        int iCount = 0;
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)           
        {
            if(Arr[i] >= '0' && Arr[i] <= '9')                      //count digits
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSpace(String str)
    {
        int iCount = 0;
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)           
        {
            if(Arr[i] == ' ')                                       //count space
            {
                iCount++;
            }
        }
        return iCount;
    }

    public int CountSpecial(String str)
    {
        int iCount = 0;
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)                 
        {
            if( (Arr[i] >= '!' && Arr[i] <= '/') ||                  //count special symbols
                (Arr[i] >= ':' && Arr[i] <= '@') ||
                (Arr[i] >= '[' && Arr[i] <= '`') ||
                (Arr[i] >= '{' && Arr[i] <= '~')
            )          
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program275
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

        iRet = strobj.CountDigits(data);
        System.out.println("NUmber of Digits are : " + iRet);

        iRet = strobj.CountSpace(data);
        System.out.println("Number of white spaces are : " + iRet);

        iRet = strobj.CountSpecial(data);
        System.out.println("Number of Special symbols are : " + iRet);
    }
}