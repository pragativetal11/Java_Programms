/*
    write data into file
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program666
{
    public static void main(String A[]) 
    {
        FileReader frobj = null;
        
        try
        {
        frobj = new FileReader("Demo.txt"); 
        
        System.out.println(frobj.read());           //it return ascii value of 1st letter

        }
        catch(IOException iobj)     //specific catch 
        {
            System.out.println(iobj);
        }
        finally
        {
            
        }    
    }
}