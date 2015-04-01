class no9 {
	public static void main(String[] args) {
		// menampilkan angka dari 1 - 110
		// jumalh angka 11 per baris
		// di bagi habis dengan 5 ditampilkan JONI

		int n;
		for (n=1;n<111;n++) 
		{
			if (n%5==0) 
			{
				System.out.print("JONI");
			}

			else
			{
				System.out.print(n+" ");
			}
			if (n%11==0)
			{
				System.out.print("\n");
			}
		}
	}
}