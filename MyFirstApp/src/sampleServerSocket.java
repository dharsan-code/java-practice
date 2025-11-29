import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class sampleServerSocket {

	public static void main(String[] args) throws Exception {
		ServerSocket io = new ServerSocket(2000);
		Socket socket = io.accept();

		DataOutputStream sent = new DataOutputStream(socket.getOutputStream());
		
		sent.writeUTF("Hi Dharsan!");
		sent.flush();
		sent.close();
	}

}
