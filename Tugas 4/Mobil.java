class Mobil{

	// atribut speed, posisi, plat nomor, merk, warna, mesin
	private int speed;
	private String posisi; 
	private String noPlat;
	private String merk;
	private String warna;
	private String mesin;


	public Mobil(int speedInput, String posisiInput, String noPlatInput, String merkInput, String warnaInput, String mesinInput)
	{
 		speed = speedInput;
	 	posisi = posisiInput; 
	 	noPlat = noPlatInput;
	 	merk = merkInput; 
	 	warna = warnaInput;
	 	mesin = mesinInput;
	}
	

	// method maju, mundur, berhenti, ngebut, ngerem

	public void maju()
	{
		System.out.println("Mobil Maju\t= " +speed+ "Km/Hours");
	}

	public void ngebut()
	{
		speed =speed+100;
		System.out.println("Mobil Mengebut\t= " +speed+ "Km/Hours");
	}
	
	public void mundur()
	{
		speed = 20;
		System.out.println("Mobil Mundur\t= " +speed+ "Km/Hours");
	}	
	
	public void ngerem()
	{
		speed = speed - 40;
		System.out.println("Mobil Mengerem\t= " +speed+ "Km/Hours");
	}

	public void belok()
	{
		System.out.println("Mobil Belok\t= Kanan");
	}

	public void berhenti()
	{
		speed = 0;
		System.out.println("Mobil Berhenti\t= " +speed+ "Km/Hours");
	}
	

	// getter
	public int getSpeed()
	{
		return speed;
	}

	public String getPosisi()
	{
		return posisi;
	}

	public String getNoplat()
	{
		return noPlat;
	}

	public String getMerk()
	{
		return merk;
	}

	public String getWarna()
	{
		return warna;
	}

	public String getMesin()
	{
		return mesin;
	}


	// setter
	public int setSpeed(int speed)
	{
		return this.speed = speed;
	}

	public String setPosisi(String posisi)
	{
		return this.posisi = posisi;
	}

	public String setNoplat(String noPlat)
	{
		return this.noPlat = noPlat;
	}

	public String setMerk(String merk)
	{
		return this.merk = merk;
	}

	public String setWarna(String warna)
	{
		return this.warna = warna;
	}

	public String setMesin(String mesin)
	{
		return this.mesin = mesin;
	}


}