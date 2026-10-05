/*
    codesheff
    litecode
    hackerrank
    hackerworld

    Accept string from user reverse the string(append)
    Input = my name is amit
    Output :- ym eman si tima
*/

package Advanced_LB;

import java.util.*;

class program746
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
        StringBuffer Finalstr = new StringBuffer();

        for(int i = 0; i < Token.length; i++)
        {
            sb = new StringBuffer(Token[i]);

            sb = sb.reverse();

            Finalstr = Finalstr.append(sb);
        }

        System.out.println(Finalstr);
    }
}