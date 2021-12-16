	import java.io.IOException;
	import java.io.PrintWriter;
	import java.net.Socket;
	import java.util.logging.Level;
	import java.util.logging.Logger;


	public class ClientProdutor extends Thread{

	    Socket ss;
	    MensagemBuffer B;
	    PrintWriter pw;
	    
	    
	    // utilizando printwrite conseguimos colocar dados no buffer de saída do software
	    public ClientProdutor(Msg b, Socket ss) {
	        super();
	        B = b;
	        this.ss=ss;
	        try {
	            pw=new PrintWriter(this.ss.getOutputStream());
	        } catch (IOException ex) {
	            ex.getStackTrace();
	        }
	        super.start();
	    }
	    
	    public void Msg(String msg){
	        synchronized(B){
	            B.put(msg);
	        }
	    }

	    public void run() {
	        while (true) {
	            synchronized (B) {
	                pw.println(B.get());
	                pw.flush();
	            }
	        }
	    }
	}
}
