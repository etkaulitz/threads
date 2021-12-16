

	import java.util.Scanner;

	public class ClientPrincipal {

	    public static void main(String[] args) {
	        ClientProdutor clientProdutor = null;
	        ClientConsomer clientConsomer;

	        
	        //cria a conexao com o servidor 
	        MensagemBuffer mensagensClienteEnvio = new MensagemBuffer(10);
	        MensagemBuffer mensagensClienteRecepcao = new MensagemBuffer(10);
	        ClientSocket clientSocket = new ClientSocket("127.0.0.1", 8889);

	        clienteSocket.conect();

	        if (clientSocket.getSocket() != null) {
	            clientConsomer = new clientConsomer(mensagensClienteRecepcao, clientSocket.getSocket());
	            clientProdutor = new clientProdutor(mensagensClienteEnvio, clientSocket.getSocket());

	        }

	        Scanner leitor = new Scanner(System.in);

	        //leitor é um inputstream
	        while (true) {
	            String texto = leitor.next();
	            clientProdutor.enviarMensagem("Cliente: @ " + texto);
	            
	            
	            String [] dados = mensagensClienteRecepcao.get().split("@");
	            System.out.println("Nome: " + dados[0] + "  " + "Mensagem: " + dados[1]);
	           
	        }

	    }
	}
}
