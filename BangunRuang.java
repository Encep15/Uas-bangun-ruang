class Balok {
	private double panjang;
	private double lebar;
	private double tinggi;

	public Balok(double panjang, double lebar, double tinggi){
		this.panjang = panjang;
		this.lebar = lebar;
		this.tinggi = tinggi;
	}
	
	public double hitungLuasPermukaan(){
		return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
	}

	public double hitungVolume(){
		return panjang * lebar * tinggi;
	}
}

class Bola {
	private double diameter;

	public Bola(double diameter){
		this.diameter = diameter;
	}
	public double hitungLuasPermukaan() {
		return Math.PI * Math.pow(diameter, 2);
	}
	
	public double hitungVolume() {
        return (Math.PI * Math.pow(diameter, 3)) / 6;
    }
}

