package thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_fila = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();
	
	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_fila.add(objetoFilaThread);
	}
	
	@Override
	public void run() {
		
		System.out.println("Thread Rodando");
		
		while(true) {
		
		synchronized (pilha_fila) { /*Bloquear o acesso a lista por outros processos*/
			
			Iterator iteracao = pilha_fila.iterator();
		
			while (iteracao.hasNext()) { /*enquanto tiver dados na lista vai processar*/
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
				
				/*Processar 10 mil notas fiscais, por exemplo*/
				/*Gerar lista de pdf, por exemplo*/
				/*Envio de e-mail em massa*/
				
				System.out.println("---------------------------------");
				System.out.println(processar.getEmail());
				System.out.println(processar.getNome());
				
				iteracao.remove();
				try {
					Thread.sleep(1000); /*Dar tempo para descarga de memória*/
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		try {
			Thread.sleep(1000); /*Tempo para limpeza de memória depois de processamento pesado*/
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}	
}
