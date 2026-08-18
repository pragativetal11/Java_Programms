/*
    problems on strings
    Accept string and count capital, small, space, special symbols and Digits letters from string (converting string into char array)

*/

import java.util.*;
import Marvellous.StringX;          //importing user defined package

class program277
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