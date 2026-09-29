package Packer_Unpacker;

import java.util.*;

class StringX
{
    int CountWords(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        return tokens.length;
    }

    void DisplayWords(String str)
    {
        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        for(int i = 0; i < tokens.length; i++)
        {
            System.out.println(tokens[i]);
        }
    }
}

class program714
{
    public static void main(String A[])
    {
        StringX strobj = new StringX();

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        iRet = strobj.CountWords(str);

        System.out.println("number of words are : "+iRet);
        
        strobj.DisplayWords(str);
    }
    
}
