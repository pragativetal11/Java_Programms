/*
    create new file with exception handling
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program656
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Demo.txt");

            fobj.createNewFile();       
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }
        
    }
}