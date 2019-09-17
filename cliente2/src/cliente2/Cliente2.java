/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente2;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
/**
 *
 * @author Salvador
 */
public class Cliente2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
             
        Socket socket = new Socket("127.0.0.1", 2500);
        PrintWriter escritor = new PrintWriter(
        socket.getOutputStream(),true);
        
        BufferedReader lector = new BufferedReader(
        new InputStreamReader(socket.getInputStream()));
        
        String datos;
        String datosEntrada;
        Scanner scanner = new Scanner(System.in);
        while(true){
            datos=scanner.nextLine();
            escritor.println(datos);
            datosEntrada=lector.readLine();
            System.out.println(datosEntrada);
            datos= scanner.nextLine();
            escritor.println(datos);
        }
        
    
    }
    
    }

