/*
    Unpackiing File creation

*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program730
{
    public static void main(String A[]) throws Exception
    {

        String PackFileName = null;
        File fpackobj = null;

        FileInputStream fiobj = null;
        byte Header[] = new byte[100];

        String strHeader = null;
        String Tokens[] = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of packed file : ");

        PackFileName = sobj.nextLine();

        fpackobj = new File(PackFileName);

        if(fpackobj.exists())
        {
            fiobj = new FileInputStream(fpackobj);

            fiobj.read(Header,0,100);

            strHeader = new String(Header);

            System.out.println("header is : "+strHeader);

            strHeader = strHeader.trim();
            strHeader = strHeader.replace("\\s+", " ");

            Tokens = strHeader.split(" ");

            System.out.println("File Name : "+Tokens[0]);
            System.out.println("File size : "+Tokens[1]);
        }
        else
        {
            System.out.println("There is no such Packed file");
        }
    }
}