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
            System.out.println(tokens[i] + " : " +tokens[i].length());
        }
    }

    void LargestWord(String str)
    {
        int iMax  = 0;

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].length() > iMax)
            {
                iMax = tokens[i].length();
            }
        }

        System.out.println("Largest value is : "+ iMax);
    }
}

class program716
{
    public static void main(String A[])
    {
        StringX strobj = new StringX();

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        strobj.LargestWord(str);
    }
    
}
