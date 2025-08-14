package br.com.jmorais;

public class CalculoMedia {

	public static void main(String[] args) {
		mediaFinal();
	}
	public static void mediaFinal() {
		double nota1 = 4.0;
		double nota2 = 7.0;
		double nota3 = 8.0;
		double nota4 = 6.0;
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println(media);
	}

}
