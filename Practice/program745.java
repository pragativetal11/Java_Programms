/*
    codesheff
    litecode
    hackerrank
    hackerworld

    Accept string from user reverse the string
    Input = my name is amit
    Output :- ym eman si tima
*/

package Advanced_LB;

import java.util.*;

class program745
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();           //Immutable string

        str = str.trim();

        str = str.replaceAll("\\s+", " ");

        String Token[] = str.split(" ");

        StringBuffer sb = null;

        for(int i = 0; i < Token.length; i++)
        {
            sb = new StringBuffer(Token[i]);

            System.out.println(sb.reverse());
        }


    }
}