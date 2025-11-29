import java.net.*;
public class serverUDP {

	public static void main(String[] args) throws Exception {
		DatagramSocket datagramsocket = new DatagramSocket();
		
		String msg ="Hi dharsan";
		
		InetAddress ip = InetAddress.getByName("localhost");
		
		DatagramPacket datagrampacket = new DatagramPacket(msg.getBytes(), msg.length(), ip, 1800);
		
		datagramsocket.send(datagrampacket);

	}

}
