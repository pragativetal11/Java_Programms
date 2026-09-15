/*
    pack folder gets created
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program692
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        int iRet = 0;

        System.out.println("Enter Folder name: ");
        FolderName = sobj.nextLine();

        System.out.println("Enter the name of packed file : ");
        PackFileName = sobj.nextLine();

        File fobjfolder = new File(FolderName);

        if((fobjfolder.exists()) && (fobjfolder.isDirectory()))
        {
            System.out.println("Folder exists");

            File fobjpack = new File(PackFileName);
            fobjpack.createNewFile();       //Pack file gets created

            foobj = new FileOutputStream(fobjpack);

            File fArr[] = fobjfolder.listFiles();

            System.out.println("Number of files in folder : " + fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                byte Buffer[] = new byte[100];

                fiobj = new FileInputStream(fArr[i]);

                //write file name and size
                System.out.println("File Name : "+fArr[i].getName());
                System.out.println("File Size : "+fArr[i].length());

                //loop to read from fiobj and write to foobj
                 while ((iRet = fiobj.read(Buffer)) != -1) 
                {
                    foobj.write(Buffer,0,iRet);    
                }
                fiobj.close();

            }
            foobj.close();
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}