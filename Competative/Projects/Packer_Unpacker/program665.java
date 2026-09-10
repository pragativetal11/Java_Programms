/*
    write data into file
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program665
{
    public static void main(String A[]) 
    {
        FileWriter fwobj = null;
        
        try
        {
        fwobj = new FileWriter("Demo.txt"); 
        
        fwobj.write("Jay ganesh...");

        fwobj.close();              ////if file is not close then data is not written into file(IMP)

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