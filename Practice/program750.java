/*
    codesheff
    litecode
    hackerrank
    hackerworld

    Accept string from user and count occuerence of that word
    Input = India is my countri i live in india
    Output :- bharat is my country i live in bharat
*/

package Advanced_LB;

import java.util.*;

class program750
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
            if(Token[i].equals("india"))
            {
                iCount++;
            }
        }

        System.out.println("frequency is : "+iCount);
    }
}