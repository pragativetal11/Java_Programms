/*
    create new file if is not exits
*/
package Packer_Unpacker;

import java.io.*;

class program659
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Demo.txt");
            boolean bRet = false;       //variable is created to call function

            bRet = fobj.exists();
            if(bRet == true)
            {
                System.out.println("File already Present");
            }
            else
            {
                fobj.createNewFile();  
                System.out.println("File gets successfully created...");  
            }   
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