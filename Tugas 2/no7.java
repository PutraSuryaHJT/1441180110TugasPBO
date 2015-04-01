class no7 {
	public static void main(String[] args) {
		float n=10;
		float hasil=0;
		float i=1;

		while (i<=n){
			System.out.print(i);
			if (i != n) {
				System.out.print(" + ");
			}
			else
			{
				System.out.print(" = ");
		}
		hasil += i;
		i++;
					}
			System.out.print(hasil / n);
	}
}