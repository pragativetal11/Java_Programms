/*
    write data into file(issue)
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program663
{
    public static void main(String A[]) throws IOException
    {
        FileWriter fwobj = new FileWriter("Demo.txt");
        
        fwobj.write("Jay ganesh...");
    }
}