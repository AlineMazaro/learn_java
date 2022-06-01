package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		//Convertendo temperatura fahrenheit em celsius
		//(°F - 32) x 5/9= °C
		
		final int ajuste = 32;
		final double multiplicador = (5.0/9);
		
		double temperaturaF = 86;
		double temperaturaC = (temperaturaF - ajuste) * multiplicador;
		
		System.out.println("Temperatura " + temperaturaC + "°C");
					

	}

}
