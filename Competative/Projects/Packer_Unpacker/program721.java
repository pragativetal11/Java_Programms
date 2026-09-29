package Packer_Unpacker;

class program721
{
    public static void main(String A[])
    {
        String header = "A.txt 10";

        System.out.println(header.length());        //8

        System.out.println("Actual header length : " + header.length());

        //System.out.println("NUmber of white spaces we need : " +(100 - header.length()));  
        
        int size = 100 - header.length();

        System.out.println("size variable : "+size);

        for(int i = 1; i <= size; i++)
        {
            header = header + " ";
            System.out.println(i);
        }

        System.out.println("Updated header length is : "+header.length());
    }
    
}
