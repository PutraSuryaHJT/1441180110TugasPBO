public class Segitiga{
	int alas;
	int tinggi;
	int miring;

	public void cetakKeLayar(){
		System.out.println("Alas         = "+alas);
		System.out.println("Tinggi       = "+tinggi);
		System.out.println("Sisi Miring  = "+miring);
	}

	public void ubahProperty(int alasBaru, int tinggiBaru, int miringBaru){
		alas = alasBaru;
		tinggi = tinggiBaru;
		miring = miringBaru;
	}

	public int hitungLuas(){
		int luas;
		luas = alas * tinggi;
		return luas;
	}

	public int hitungKeliling(){
		int keliling;
		keliling = alas + miring + miring;
		return keliling;
	}
}