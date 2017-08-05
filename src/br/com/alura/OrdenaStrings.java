package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		List<String>  palavras = new ArrayList<>();
		
		palavras.add("alura online");
		palavras.add("editora casa do codigo");
		palavras.add("caelum");
		
		//Consumer<String> consumidor = new ImprimeNaLinha();
			
		Ordena ordena = new Ordena();
		Collections.sort(palavras, ordena);
		
		palavras.forEach((String s) -> System.out.println(s));
		

	}

}

class ImprimeNaLinha implements Consumer<String>{
	@Override
	public void accept(String t) {
		System.out.println("imprimindo: " +t);
		
	}	
}

class Ordena implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length())
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
	
}

