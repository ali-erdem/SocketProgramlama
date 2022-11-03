
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class Client {
    
    public static void main(String [] args) throws IOException{
        
        Socket client = new Socket ("localhost", 4444);
        // port seçimi üzerinde değişiklik olabilir ayrıca ıp adresinizi ve localhostunuzu girebilirsiniz 
        
        while(true){
        InputStreamReader inputStream = new InputStreamReader(client.getInputStream());
        BufferedReader buffered = new BufferedReader(inputStream);
        PrintWriter print = new PrintWriter(client.getOutputStream());
        
        System.out.println("Gönder: ");
        Scanner scanner = new Scanner (System.in);
        
        print.println(scanner.nextLine());
        print.flush();
        
        System.out.println("Gelen: " + buffered.readLine());
        
        }
    }
}
