package Packer_Unpacker;

class program720
{
    public static void main(String A[])
    {
        String header = "A.txt 10";

        System.out.println(header.length());        //8

        System.out.println("Actual header length : " + header.length());

        System.out.println("NUmber of white spaces we need : " +(100 - header.length()));       //11
    }
    
}
