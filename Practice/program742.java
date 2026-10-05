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

class program742
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

        for(int i = 0; i < Arr.length; i++)         //issue in the 1st word
        {
            if(Arr[i] == ' ')
            {
                if(Arr[i+1] >= 'a' && Arr[i+1] <= 'z')
                {
                    Arr[i+1] = (char)(Arr[i+1] - 32);
                }

            }
        }
        String output = new String(Arr);

        System.out.println("Updated String is : "+output);


    }
}