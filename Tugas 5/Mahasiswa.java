class Mahasiswa {


	private String nama;
	private int umur;

	public Mahasiswa(){

		nama = "Ridwan Rismanto";
		umur = 20;
	}

	public Mahasiswa(String a, int b) {
	
	nama = a;
	umur = b;
	
	}

	public String getNama()
	{
		return nama;
	}
	
	public int getUmur()
	{
		return umur;
	}

	public void setUmur(int b){

		umur = b;
	}

	public void tampilkanBiodata()
	{
		System.out.println("B I O D A T A");
		System.out.println("Nama : " +getNama() );
		System.out.println("Umur : " +getUmur());
		
	}
}