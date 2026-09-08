/*
    Server
*/
import java.io.*;
import java.net.*;      //actual networking

class program924
{
    public static void main(String A[])
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(9000);

            System.out.println("------------------------------------------------------");
            System.out.println("-------------- Marvellous Server Started -------------");
            System.out.println("------------------------------------------------------");

            // loop for multiple client requests
            while (true) 
            {

                System.out.println("Server is waiting for client request");

                Socket clientsocket = serversocket.accept();        //for each client socket object is created

                System.out.println("Client connected successfully");

                // Thread gets created for client
                Thread t = new Thread(() -> HandleClientRequest(clientsocket));     //Actual client request accept and handle

                t.start();
            
            } //End of while

        }
        catch(Exception e)
        {
            System.out.println("Exception occured : "+e);
        }
    } //End of main

    // separate client reuqest are handled indidually
    public static void HandleClientRequest(Socket socket)
    {
        try
        {
            DataInputStream dis = new DataInputStream(socket.getInputStream());     //to accept input

            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());  //to generate the output

            dos.writeUTF("Connected to Marvellous Server");     //Uniform text formatting

            //this while loop iterators for each client to perform operations
            while (true) 
            {
                String command = dis.readUTF();     
                
                System.out.println("Command received from client : "+command);

                String parts[] = command.split(" ");

                String operation = parts[0].toUpperCase();

                if(operation.equals("QUIT"))
                {
                    dos.writeUTF("Disconnected from Server");

                    break;
                }

                if(parts.length != 3)
                {
                    dos.writeUTF("Invalid Command Format");
                    continue;
                }

                double no1 = Double.parseDouble(parts[1]);
                double no2 = Double.parseDouble(parts[2]);

                double result = 0.0;

                if(operation.equals("ADD"))
                {
                    result = no1 + no2;

                    dos.writeUTF("Result is : "+result);
                }

                else if(operation.equals("SUB"))
                {
                    result = no1 - no2;

                    dos.writeUTF("Result is : "+result);
                }

                else if(operation.equals("MULT"))
                {
                    result = no1 * no2;

                    dos.writeUTF("Result is : "+result);
                }

                else if(operation.equals("DIV"))
                {
                    result = no1 / no2;

                    dos.writeUTF("Result is : "+result);
                }

                else
                {
                    dos.writeUTF("Invalid operation");
                }

            } // End of while

            socket.close();

            System.out.println("Client disconnected");
        }
        catch(Exception e)
        {
            System.out.println("Enception occured : "+e);
        }
    }

} //End of class