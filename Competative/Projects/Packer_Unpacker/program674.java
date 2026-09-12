/*
    write data into file using fileoutputstram
*/
package Packer_Unpacker;

import java.io.*;
import java.util.*;

class program674
{
    public static void main(String A[]) 
    {
        String data = "Marvellous Infosystems";

        byte Arr[] = data.getBytes();       //String array to byte array conversion

        System.out.println(data.length());
        System.out.println(Arr.length);

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}