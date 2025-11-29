import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
public class socket {

	public static void main(String[] args) throws IOException{
		
			Socket io = new Socket("localhost", 1001);
			
            DataInputStream input = new DataInputStream(io.getInputStream());
		
            String msg = input.readUTF();
            
            System.out.println("Server says "+msg);
            
	} 

}
