package thread;

import javax.swing.JOptionPane;

public class ThreadJava {

	public static void main(String[] args) throws InterruptedException {
			
		/*============================ THREAD 1 ============================*/
		/*Thread processando paralelo envio email*/
		Thread threadEmail = new Thread(thread1); 
		threadEmail.start();
		
		/*============================ THREAD 2 ============================*/
		
		/*Thread processando paralelo envio de nota fiscal*/
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();
			
			
		/*============================ CÓDIGO FORA DAS THREADS ============================*/
		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("CHEGOU AO FIM DO TESTE DE THREAD");

		/* Fluxo do sistema */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário! ");
	}
	
	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			/* Código da rotina que eu quero executar em paralelo */
			for (int i = 0; i < 10; i++) {

				/* Executar o envio com tempo de parada ou determinado */
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Executando alguma rotina: Envio de email, por exemplo! ");
			}
			/* Fim do código em paralelo */
		}
		
	};
	
	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Executando alguma rotina: Envio de nota fiscal! ");
			}
		}	
	};

}
