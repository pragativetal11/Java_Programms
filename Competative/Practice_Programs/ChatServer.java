import java.io.*;
import java.net.*;

class ChatServer
{
    public static void main(String A[])throws Exception
    {
        System.out.println("Server Application is Running...");

        ServerSocket ssobj = new ServerSocket(2100);        //shutter open

        System.out.println("Server is Waiting at port 2100");

        Socket sobj = ssobj.accept();       //client request accept

        System.out.println("Client Request get Accepted Successfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());    

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("-------------------------------------------");
        System.out.println("---------- Marvellous Chat Server ---------");
        System.out.println("-------------------------------------------");

        String str1= null, str2=null;

        while((str1 = bobj1.readLine()) != null)
        {
            System.out.println("Client Says :" + str1);
            System.out.println("Enter Message for Client :");
            str2 = bobj2.readLine();
            pobj.println(str2);
        }
            sobj.close();
            ssobj.close();
    }
}