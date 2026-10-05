/*
    codesheff
    litecode
    hackerrank
    hackerworld

    Accept string from user reverse the string
    Input = pragati
    Output :- itagarp
*/

package Advanced_LB;

import java.util.*;

class program744
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();           //Immutable string

        StringBuffer sb = new StringBuffer(str);

        System.out.println(sb);

    }
}