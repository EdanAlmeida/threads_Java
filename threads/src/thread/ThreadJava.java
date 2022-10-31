package thread;

import javax.swing.JOptionPane;

public class ThreadJava {

	public static void main(String[] args) throws InterruptedException {

		/*O processamento é gerenciável pelo próprio Java levando em conta o processamento do computador
		 * arquitetura do mesmo
		 * tempo de processamento
		 * performance etc.*/
		
		/*============================ THREAD 1 ============================*/
		/*Thread processando paralelo envio email*/
		new Thread() {
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
			};
		}.start();
		
		/*============================ THREAD 2 ============================*/
		
		/*Thread processando paralelo envio de nota fiscal*/
		new Thread() {
			public void run() {
				/* Código da rotina que eu quero executar em paralelo */
				for (int i = 0; i < 10; i++) {

					/* Executar o envio com tempo de parada ou determinado */
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Executando alguma rotina: Envio de email de nota fiscal! ");
				}
				/* Fim do código em paralelo */
			};
		}.start();

		/*============================ CÓDIGO FORA DAS THREADS ============================*/
		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("CHEGOU AO FIM DO TESTE DE THREAD");

		/* Fluxo do sistema */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário! ");
	}

}
