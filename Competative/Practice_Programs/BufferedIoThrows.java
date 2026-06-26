import java.io.*;

class BufferedIoThrows
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        

        System.out.println("Enter Your Name");

        String name = bobj.readLine();

        System.out.println("Hello" + name);

    }
}