import java.io.*;

class BufferedIOX
{
    public static void main(String A[]) throws IOException
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        

        System.out.println("Enter Your Name");
        String name = bobj.readLine();

        System.out.println("Hello " + name);

    }
}