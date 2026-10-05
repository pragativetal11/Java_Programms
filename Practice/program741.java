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

class program741
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();           //Immutable string

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }



    }
}