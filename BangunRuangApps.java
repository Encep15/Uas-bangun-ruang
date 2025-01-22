import java.util.Scanner;

public class BangunRuangApps{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Masukkan panjang, lebar, dan tinggi balok: ");
		double panjang = scanner.nextDouble();
		double lebar = scanner.nextDouble();
		double tinggi = scanner.nextDouble();

		Balok balok = new Balok(panjang, lebar, tinggi);

		System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
		System.out.println("Volume Balok: " + balok.hitungVolume());
	
		System.out.println("Masukkan diameter: ");
		double diameter= scanner.nextDouble();

		Bola bola = new Bola(diameter);

		System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());
		System.out.println("Volume Bola: " + bola.hitungVolume());

		scanner.close();
	}
}
