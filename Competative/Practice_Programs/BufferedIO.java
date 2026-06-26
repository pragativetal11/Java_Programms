import java.io.*;

class BufferedIo
{
    public static void main(String A[])
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        

        System.out.println("Enter Your Name");
        String name = bobj.readLine();      //checked Exception

        System.out.println("Hello" + name);

    }
}