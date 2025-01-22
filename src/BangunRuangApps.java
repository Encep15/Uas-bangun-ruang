import java.util.Scanner;

public class BangunRuangApps{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Masukkan panjang, lebar, dan tinggi balok:");
		double panjang = scanner.nextDouble();
		double lebar = scanner.nextDouble();
		double tinggi = scanner.nextDouble();

		System.out.println("Luas Permukaan Balok: " + BangunRuang.luasPermukaanBalok(panjang, lebar, tinggi));
		System.out.println("Volume Balok: " + BangunRuang.volumeBalok(panjang, lebar, tinggi));

		System.out.println("Masukkan diameter bola: ");
		double diameter = scanner.nextDouble();

		System.out.println("Luas Permukaan Bola: " + BangunRuang.luasPermukaanBola(diameter));
		System.out.println("Volem Bola: " + BangunRuang.volumeBola(diameter));

		scanner.close();
	}
}
