package executavel;

public class ArrayMatriz {

	public static void main(String[] args) {
		
		int notas[][] = new int[3][3];
		
		//notas[0][0] = 80;
		//notas[0][1] = 70;
		//notas[0][2] = 80;
		
		int valor = 0;
		for (int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas.length; j++) {
				valor++;
				notas[i][j] = valor;
				System.out.println(notas[i][j]);
			}
		}
	}
}
