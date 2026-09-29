/*
    pack folder gets created
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program726
{
    public static void main(String A[]) throws Exception
    {
        String header = "";

        int i = 0;
        int j = 0;
        int size = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        byte Buffer[] = new byte[1024];
        byte bHeader[]  = null;

        System.out.println("Enter Folder name: ");
        FolderName = sobj.nextLine();

        System.out.println("Enter the name of packed file : ");
        PackFileName = sobj.nextLine();     //blue bag

        File fobjfolder = new File(FolderName);

        if((fobjfolder.exists()) && (fobjfolder.isDirectory()))
        {
            System.out.println("Folder exists");

            File fobjpack = new File(PackFileName);
            fobjpack.createNewFile();       //Pack file gets created

            foobj = new FileOutputStream(fobjpack);

            File fArr[] = fobjfolder.listFiles();

            System.out.println("Number of files in folder : " + fArr.length);


            for(i = 0; i < fArr.length; i++)
            {

                fiobj = new FileInputStream(fArr[i]);

                //write file name and size

                header = header + fArr[i].getName();
                header = header + " ";
                header = header + fArr[i].length();

                size = 100 - (header.length());

                for(j = 1; j <= size; j++)
                {
                    header = header + " ";
                }

                bHeader = header.getBytes();

                System.out.println(bHeader.length);

                /*  //loop to read from fiobj and write to foobj
                while ((iRet = fiobj.read(Buffer)) != -1) 
                {
                    foobj.write(Buffer,0,iRet);    
                }  */
                 
                fiobj.close();
                header = "";        //reset header

            }

            foobj.close();
            sobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}