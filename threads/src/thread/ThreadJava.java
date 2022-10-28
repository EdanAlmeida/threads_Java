package thread;

import javax.swing.JOptionPane;

public class ThreadJava {

	public static void main(String[] args) throws InterruptedException {

		/*Thread processando em paraelo*/
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
					System.out.println("Executando alguma rotina: Envio de email, por exemplo! ");
				}
				/* Fim do código em paralelo */
			};
		}.start();

		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("CHEGOU AO FIM DO TESTE DE THREAD");

		/* Fluxo do sistema */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário! ");
	}

}