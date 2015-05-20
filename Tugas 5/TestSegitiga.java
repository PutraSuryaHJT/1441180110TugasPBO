public class TestSegitiga{
	
	public static void main(String[] args) {
		Segitiga bangun = new Segitiga();

		bangun.alas = 5;
		bangun.tinggi = 8;
		bangun.miring = 3;

		bangun.cetakKeLayar();

		System.out.println("Keliling     = "+bangun.hitungKeliling());
		System.out.println("Luas         = "+bangun.hitungLuas());

		bangun.ubahProperty(7, 10, 5);

		System.out.println("Property baru:");
		bangun.cetakKeLayar();

		System.out.println("Keliling Baru= "+bangun.hitungKeliling());
		System.out.println("Luas Baru    = "+bangun.hitungLuas());	
	}
}