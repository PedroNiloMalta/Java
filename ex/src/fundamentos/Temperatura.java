package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		double tempf = 55;
		final int trintaedois = 32;
		final double divisao = (5.0/9.0);
		double tempc = (tempf - trintaedois) * divisao;
		
		System.out.println("Temperatura = "+tempc +" graus celsius");
		
		tempf= 90;
		tempc = (tempf - trintaedois) * divisao;
		
		System.out.println("Temperatura = "+tempc +" graus celsius");
		
	}
}
