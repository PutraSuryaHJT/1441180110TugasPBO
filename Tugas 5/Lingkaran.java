public class Lingkaran
{
	
	int r = 2;
	double phi = 3.14;

	public void cetakKeLayar()
	{
		System.out.println("Jari-jari     : " + r);
		System.out.println("Phi 	      : " + phi);
	}

	public  void ubahProperty(int rBaru)
	{
		r = rBaru;
	}

	public double hitungLuas()
	{
		double luas;
		luas = phi * r * r;	
		return luas;	
	}

	public double hitungKeliling()
	{
		double keliling;
		keliling = 2 * phi * r;
		return keliling;
	}
}