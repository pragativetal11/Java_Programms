/*
    write data into file using fileoutputstram
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program676
{
    public static void main(String A[]) throws Exception
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

        byte Arr[] = data.getBytes();

        if(fobj.exists())
        {
            foobj.write(Arr);         
        }
        else
        {
            System.out.println("There is no such file");
        }
        
    }
}