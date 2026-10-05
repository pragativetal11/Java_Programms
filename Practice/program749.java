/*
    codesheff
    litecode
    hackerrank
    hackerworld

    Accept string from user and count occuerence of that word
    Input = my name is amit school name is abhinav city name is pune
    Output :- 3
*/

package Advanced_LB;

import java.util.*;

class program749
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();           //Immutable string

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Token[] = str.split(" ");

        int iCount = 0;

        for(int i = 0; i < Token.length; i++)
        {
            if(Token[i].equals("name"))
            {
                iCount++;
            }
        }

        System.out.println("Frequency of word is : "+iCount);
    }
}