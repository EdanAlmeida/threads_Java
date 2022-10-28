package executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "Edan, Java, 80, 70";
		
		String[] valoresArray = texto.split(",");
		
		for (int i = 0; i < valoresArray.length; i++) {
			System.out.println(valoresArray[i]);
		}
		
		System.out.println("==============================================");
		
		/*converter array em lista*/
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valor : list) {
			System.out.println(valor);
		}
		
		System.out.println("==============================================");
		
		/*converter lista em array*/
		String[] conversaoArray = list.toArray(new String[4]);

		for (int i = 0; i < conversaoArray.length; i++) {
			System.out.println(conversaoArray[i]);
		}
		
	}

}
