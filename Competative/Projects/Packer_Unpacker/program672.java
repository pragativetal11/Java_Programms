/*
    write data into file using fileoutputstram
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program672
{
    public static void main(String A[]) 
    {
        String Fname = null;
        File fobj = null;
        FileOutputStream foobj = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name : ");
        Fname = sobj.nextLine();

        fobj = new File(Fname);

        foobj = new FileOutputStream(fobj);

        String data = "Marvellous Infosystems";

        if(fobj.exists())
        {
            foobj.write(data);          //Error
        }
        else
        {
            System.out.println("There is no such file");
        }
        
    }
}