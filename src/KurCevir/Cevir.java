package KurCevir;
import java.util.Scanner;

public class Cevir {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Dönüştürmek İstediğiniz Euro Miktarını Giriniz: ");
		double euro = scan.nextDouble();
		System.out.println(euro);
		
		double dolar = euro/0.8961;
		System.out.println("Girilen Euro Miktarının Dolar Karşılığı: " + dolar + " Dolar.");
		

	}

}
