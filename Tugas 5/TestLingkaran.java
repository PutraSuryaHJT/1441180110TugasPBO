public class TestLingkaran
{
	public static void main(String[] args)
	{
		Lingkaran col = new Lingkaran();
		
		col.r = 5;
						
		col.cetakKeLayar();

		System.out.println("hitungLuas    : " + col.hitungLuas());
		System.out.println("Keliling      : " + col.hitungKeliling());

		col.ubahProperty(15);
		
		System.out.println("Property baru :");
		col.cetakKeLayar();		

		System.out.println("Luas baru     : " + col.hitungLuas());
		System.out.println("Keliling      : " + col.hitungKeliling());
	}
}