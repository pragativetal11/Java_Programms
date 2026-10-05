/*
    codesheff
    litecode
    hackerrank
    hackerworld

    Accept string from user and count number of words

*/

package Advanced_LB;

import java.util.*;

class program734
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
    }
}