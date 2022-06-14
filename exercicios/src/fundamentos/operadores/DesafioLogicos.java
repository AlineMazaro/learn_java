package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
	// Trabalho na Terça (V ou F)
	// Trabalho na Quinta (v ou F)
	// Se trabalhar os dois dias, compra TV 50'. Se trabalhar somente 1 dia, compra TV 32'
	// Se trabalhar algum dia, compra sorvete
	
	boolean trabalho1 = true;
	boolean trabalho2 = true;
	
	boolean comprouTv50 = trabalho1 && trabalho2;
	boolean comprouTv32 = trabalho1 ^ trabalho2;
	boolean comprouSorvete = trabalho1 || trabalho2;
	
	
	System.out.println("Comprou TV 50\'? " + comprouTv50);
	System.out.println("Comprou TV 32\'? " + comprouTv32);
	System.out.println("Comprou Sorvete? " + comprouSorvete);
	
	}	
}
