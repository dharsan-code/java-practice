import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class chatAppClient extends Frame implements Runnable, ActionListener{

	TextField textField;
	TextArea textArea;
	Button send;
	
	
	Socket socket;
	
	DataInputStream datainputStream;
	DataOutputStream dataoutputStream;
	
	Thread chat;
	
	
	chatAppClient(){
		textField = new TextField();
		textArea = new TextArea();
		send = new Button("Send");
		
		try {
			
			socket = new Socket("localhost", 12000);
			
			datainputStream = new DataInputStream(socket.getInputStream());
			dataoutputStream = new 	DataOutputStream(socket.getOutputStream());
						
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		chat = new Thread(this);
		chat.setDaemon(true);	
		chat.start();
	    
		add(textField);
		add(textArea);
		add(send);
		
		
		send.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
		    public void windowClosing(WindowEvent e) {
		        System.exit(0);
		    }
		});
		
		setSize(500, 500);
		setTitle("ChatApp Client");
		setLayout(new FlowLayout());
		setVisible(true);
		
		
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = textField.getText();
		textArea.append("Client  " + msg + "\n");
		textField.setText("");
		
		try {
			dataoutputStream.writeUTF(msg);
			dataoutputStream.flush();
		}
		catch(Exception E) {
			System.out.println(E.getMessage());
		}
		

	}
	
	public void run() {
		while(true){
			try {
				String msg = datainputStream.readUTF();
				textArea.append("Server  " + msg + "\n");
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		new chatAppClient();

	}
}
