/*
    read all data from file
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program671
{
    public static void main(String A[]) 
    {
        String Fname = null;
        File fobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name : ");
        Fname = sobj.nextLine();

        fobj = new File(Fname);

        if(fobj.exists())
        {
            System.out.println("File name : " + fobj.getName());
            System.out.println("Absolute path : "+fobj.getAbsolutePath());
            System.out.println("File Size  : "+fobj.length());
        }
        else
        {
            System.out.println("There is no such file");
        }
        
    }
}