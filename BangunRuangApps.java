import java.util.Scanner;

public class BangunRuangApps{
	public static void main(String[] Args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pilih perhitungan yang diinginkan: ");
		System.out.println("a. Luas Permukaan Balok");
		System.out.println("b. Volume Balok");
		System.out.println("c. Luas Permukaan Bola");
		System.out.println("d. Volume Bola\n");

		String pilihan = scanner.nextLine().toLowerCase();

		if(pilihan.equals("a")){
			System.out.println("Masukkan panjang, lebar, dan tinggi balok: ");
			double panjang = scanner.nextDouble();
			double lebar = scanner.nextDouble();
			double tinggi = scanner.nextDouble();

			Balok balok = new Balok(panjang, lebar, tinggi);
			System.out.println("Luas Permukaan Balok: " + balok.hitungLuasPermukaan());
		
		} else if(pilihan.equals("b")){
			System.out.println("Masukkan panjang, lebar, dan tinggi balok: ");
                        double panjang = scanner.nextDouble();
                        double lebar = scanner.nextDouble();
                        double tinggi = scanner.nextDouble();

                        Balok balok = new Balok(panjang, lebar, tinggi);
                        System.out.println("Luas Permukaan Balok: " + balok.hitungVolume());

                 } else if(pilihan.equals("c")){
                        System.out.println("Masukkan diameter bola: ");
                        double diameter = scanner.nextDouble();

                        Bola bola = new Bola(diameter);
                        System.out.println("Luas Permukaan Bola: " + bola.hitungLuasPermukaan());
		
		  } else if(pilihan.equals("d")){
                        System.out.println("Masukkan diameter bola: ");
                        double diameter = scanner.nextDouble();

                        Bola bola = new Bola(diameter);
                        System.out.println("Luas Permukaan Bola: " + bola.hitungVolume());

		} else{
			System.out.println("Pilihan tidak valid !!! \n Silakan pilih a, b, c, atau d.");
		}
		scanner.close();
	}
}
