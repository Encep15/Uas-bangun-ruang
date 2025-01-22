public class BangunRuang{
	private static final double PHI = 22.0 / 7.0;

	public static double luasPermukaanBalok(double panjang, double lebar, double tinggi){
		return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
	}

	public static double volumeBalok(double panjang, double lebar, double tinggi){
		return panjang * lebar * tinggi;
	}

	public static double luasPermukaanBola(double diameter){
		return PHI * Math.pow(diameter, 2);
	}

	public static double volumeBola(double diameter){
		return (PHI * Math.pow(diameter, 3)) / 6;
	}
}
