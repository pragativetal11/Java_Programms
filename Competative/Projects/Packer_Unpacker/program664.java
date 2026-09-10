/*
    write data into file
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program664
{
    public static void main(String A[]) throws IOException
    {
        FileWriter fwobj = new FileWriter("Demo.txt"); //Filewriter creates file if not present 
        
        fwobj.write("Jay ganesh...");

        fwobj.close();      //if file is not close then data is not written into file(IMP)
    }
}