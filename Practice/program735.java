/*
    codesheff
    litecode
    hackerrank
    hackerworld

    Accept string from user and count number of
     length of each word
*/

package Advanced_LB;

import java.util.*;

class program735
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();           //Immutable string

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        System.out.println("Number of words : "+ Tokens.length);

        for(int i = 0; i < Tokens.length; i++)
        {
            System.out.println(Tokens[i] + " : "+Tokens[i].length());
        }
    }
}