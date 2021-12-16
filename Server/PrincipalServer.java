
public class PrincipalClient {
	
	import java.util.Scanner;

	public class PrincipalServidor {
	    public static void main(String[] args) {
	        
	        Produtor produtor = null;
	        Consomer consomer = null;
	        
	        Msg mensagensServidorEnvio=new Msg(10);
	        Msg mensagensServidorRecepcao=new Msg(10);
	        Socket socket=new Socket(8889);
	        servidorSocket.conect();
	        
	        if (socket.getSocket() != null) {
	            Produtor = new Produtor(mensagensServidorEnvio, Socket.getSocket());
	            consomer = new consomer(mensagensServidorRecepcao, Socket.getSocket());
	        }

	        Scanner leitor = new Scanner(System.in);
	        
	        while (true) {
	            String txt = leitor.next();
	            Produtor.enviarMensagem("Server: @ " + txt);
	            
	            System.out.println(mensagensServidorRecepcao.get());
	           
	        }
	          
	    }
	}
}
