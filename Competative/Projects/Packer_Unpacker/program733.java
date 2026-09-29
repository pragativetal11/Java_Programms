/*
    Unpackiing File creation

*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program733
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;

        String PackFileName = null;
        File fpackobj = null;

        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        byte Header[] = new byte[100];
        String strHeader = null;
        String Tokens[] = null;
        byte Buffer[] = null;

        File NewFile = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of packed file : ");

        PackFileName = sobj.nextLine();

        fpackobj = new File(PackFileName);

        if(fpackobj.exists())
        {
            fiobj = new FileInputStream(fpackobj);

            //Read header
            while ((iRet = fiobj.read(Header,0,100)) !=-1)
            {
                strHeader = new String(Header);

                System.out.println("header is : "+strHeader);

                strHeader = strHeader.trim();
                strHeader = strHeader.replace("\\s+", " ");

                Tokens = strHeader.split(" ");

                System.out.println("File Name : "+Tokens[0]);
                System.out.println("File size : "+Tokens[1]);

                NewFile = new File(Tokens[0]);

                NewFile.createNewFile();

                foobj = new FileOutputStream(NewFile);

                Buffer = new byte[Integer.parseInt(Tokens[1])];

                //Read Data
                fiobj.read(Buffer, 0, Integer.parseInt(Tokens[1]));

                //write the data 
                foobj.write(Buffer, 0, Integer.parseInt(Tokens[1]));
                
            }   //End of While
        }
        else
        {
            System.out.println("There is no such Packed file");
        }
    }
}