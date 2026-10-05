/*
    codesheff
    litecode
    hackerrank
    hackerworld

    Accept string from user and convert into camelcase.
    Input = my NAME is aMiT
    Output :- My Name Is Amit
*/

package Advanced_LB;

import java.util.*;

class program740
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();           //Immutable string

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();

        System.out.println(str);

    }
}