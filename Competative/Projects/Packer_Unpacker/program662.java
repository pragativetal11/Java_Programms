/*
    Accept file name from user and if is present then delete it
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program662
{
    public static void main(String A[])
    {
        File fobj = null;           //Reference is created
        boolean bRet = false;
        String Fname = null;
        Scanner sobj = null;

        System.out.println("Enter the file name : ");

        sobj = new Scanner(System.in);

        Fname = sobj.nextLine();


        try
        {
            fobj = new File(Fname);        //object is created of class file

            bRet = fobj.exists();
            if(bRet == true)
            {
                fobj.delete();
                System.out.println("File gets deleted");
            }
            else
            {  
                System.out.println("There is no such file");  
            }   
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
        
    }
}