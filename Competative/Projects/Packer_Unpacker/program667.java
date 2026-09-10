/*
    write data into file
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program667
{
    public static void main(String A[]) 
    {
        FileReader frobj = null;
        
        try
        {
        frobj = new FileReader("Demo.txt"); 
        
        System.out.println((char)frobj.read());             //it return  1st character

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