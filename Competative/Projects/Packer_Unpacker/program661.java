/*
    if file is present then delete it
*/
package Packer_Unpacker;

import java.io.*;

class program661
{
    public static void main(String A[])
    {
        File fobj = null;           //Reference is created
        boolean bRet = false;

        try
        {
            fobj = new File("Demo.txt");        //object is created of class file

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