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
        String temp = null;

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].length() > iMax)
            {
                iMax = tokens[i].length();
                temp = tokens[i];
            }
        }

        System.out.println("Largest word length is : "+iMax);
        System.out.println("Largest word is : "+temp);
    }

    int PatternMatching(String str, String word)
    {
        int iCount = 0;

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String tokens[] = str.split(" ");

        for(int i = 0; i < tokens.length; i++)
        {
            if(word.equals(tokens[i]))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class program718
{
    public static void main(String A[])
    {
        StringX strobj = new StringX();

        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        String str = null;

        System.out.println("Enter String : ");
        str = sobj.nextLine();

        iRet = strobj.PatternMatching(str, "are");

        System.out.println("number of word present in string : "+iRet);

    }
    
}
