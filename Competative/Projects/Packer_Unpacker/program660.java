/*
    create new file if is not exits(perfect code)
*/
package Packer_Unpacker;

import java.io.*;

class program660
{
    public static void main(String A[])
    {
        File fobj = null;           //Reference is created
        boolean bRet = false;

        try
        {
            fobj = new File("Demo.txt");

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