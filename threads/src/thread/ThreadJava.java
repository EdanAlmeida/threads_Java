package thread;

public class ThreadJava {
	
	public static void main(String[] args) throws InterruptedException{
		
		for (int i = 0; i < 10; i++) {
			
			/*Executar o envio com tempo de parada ou determinado*/
			Thread.sleep(1000); /*Dá um tempo*/
			System.out.println("Executando alguma rotina: Envio de email! ");
		}
		
		System.out.println("CHEGOU AO FIM DO TESTE DE THREAD");
		
	}

}
