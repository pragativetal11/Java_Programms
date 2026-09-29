package Packer_Unpacker;

class program722
{
    public static void main(String A[])
    {
        String header = "Hello.txt 1078";

        System.out.println(header.length());        //8

        System.out.println("Actual header length : " + header.length());

        //System.out.println("NUmber of white spaces we need : " +(100 - header.length()));  
        
        int size = 100 - header.length();

        System.out.println("size variable : "+size);

        for(int i = 1; i <= size; i++)
        {
            header = header + " ";
        }

        System.out.println("Updated header length is : "+header.length());
        System.out.println("Updated header is : "+header);
    }
    
}
