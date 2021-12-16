
	import java.io.IOException;
	import java.net.InetAddress;
	import java.net.Socket;


	public class ClientSocket {
	    Socket socket;
	    String ip;
	    int porta;
	    
	    public ClientSocket(String ip, int porta){
	        this.ip=ip;
	        this.porta=porta;
	    }
	    
	    //conexão com o socket
	    public void conect() {
	        try {
	            socket = new Socket(ip, porta);
	        } catch (IOException ex) {
	            ex.getStackTrace();
	        }
	    }

	    public Socket getSocket() {
	        return socket;
	    }
	    
	    public String getName(){
	        String nomeHost = socket.getInetAddress().getHostName();
	        return nomeHost;
	    }
	}
}
