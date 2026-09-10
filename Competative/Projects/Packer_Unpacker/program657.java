/*
    is exists
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program657
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Demo.txt");

            System.out.println(fobj.exists());       
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
        
    }
}