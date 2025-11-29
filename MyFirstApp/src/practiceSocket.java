import java.io.IOException;
import java.net.Socket;
import java.io.DataInputStream;

public class practiceSocket {
    public static void main(String[] args) throws  IOException{
    	Socket socket = new Socket("localhost", 2000);
    	
    	DataInputStream data = new DataInputStream(socket.getInputStream());
    	
    	String a = data.readUTF();
    	
    	System.out.println("Server says : "+ a);
    }
}
