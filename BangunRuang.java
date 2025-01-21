public class BangunRuang {
    private static final double PHI = 22.0 / 7.0;

    // Metode untuk menghitung luas permukaan balok
    public double luasPermukaanBalok(double panjang, double lebar, double tinggi) {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    // Metode untuk menghitung volume balok
    public double volumeBalok(double panjang, double lebar, double tinggi) {
        return panjang * lebar * tinggi;
    }

    // Metode untuk menghitung luas permukaan bola
    public double luasPermukaanBola(double diameter) {
        return PHI * Math.pow(diameter, 2);
    }

    // Metode untuk menghitung volume bola
    public double volumeBola(double diameter) {
        return (PHI * Math.pow(diameter, 3)) / 6;
    }
}
