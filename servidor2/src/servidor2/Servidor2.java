/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor2;
import java.net.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Salvador
 */
public class Servidor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
        throws Exception{
        ServerSocket socketServidor = new ServerSocket(2500);
        Socket socket = socketServidor.accept();
        BufferedReader lector = new BufferedReader(
        new InputStreamReader(socket.getInputStream()));
         
        String entrada="";
         Scanner scanner =new Scanner(System.in);
         String salida;
         PrintWriter escritor = new PrintWriter( socket.getOutputStream(),true);
         do{
             entrada=lector.readLine();
             System.out.println(entrada);
             if (entrada.equalsIgnoreCase("fin")){
        System.out.println("me voy");
        socket.close();
        socketServidor.close();
        System.exit(0);
        
         }
         salida = scanner.nextLine();
         escritor.println(salida);
    }
         while (!entrada.equalsIgnoreCase("fin"));{
            
        }
    }
    
}
