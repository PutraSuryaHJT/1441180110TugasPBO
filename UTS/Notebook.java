public class Notebook extends Komputer {
	int prosesor;
	int baterai;
	
	public Notebook(int prosesorInput, int memoriInput, int storageInput, int bateraiInput){
		prosesor = prosesorInput;
		memori 	 = memoriInput;
		storage  = storageInput;
		baterai  = bateraiInput;

	}
	public void CetakSpesifikasi(){
		System.out.println("Kecepatan prosesor komputer :"+ getProsesor());
		System.out.println("Kecepatan prosesor notebook :"+prosesor);
		System.out.println("Kapasitas memori :"+memori);
		System.out.println("Kapasitas storage :"+storage);
		System.out.println("Kapasitas baterai :"+baterai);
		System.out.println();
		
	}
	public void Overclock(int prosesor){
		prosesor = prosesor;
		System.out.println("Notebook dioverclock dengan kecepatan prosesor :"+ prosesor);

	}
}