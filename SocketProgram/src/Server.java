
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server {
    
    public static void main(String[] args) throws IOException{
        
        ServerSocket server = new ServerSocket(4444); //hangi port numarası üzerinden çalışılacaksa onu verebilirsiniz. burada 4444 portu seçilmiştir.
        Socket client = server.accept();
        
        while(true){
        InputStreamReader inputStream = new InputStreamReader(client.getInputStream());
        BufferedReader buffered = new BufferedReader(inputStream);
        PrintWriter print = new PrintWriter(client.getOutputStream());
        
        String gelenVeri = buffered.readLine();
        System.out.println("Gelen veri: " +gelenVeri);
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Gönder: ");
        String gonder = scanner.nextLine();
        
        print.println(gonder);
        print.flush();
        
        }
    }
}
