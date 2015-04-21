class TestMobil{

	public static void main(String[] args) {
		
		Mobil lamborghini = new Mobil(50, "Di Jalan SoeHat", "N 1111 N", "lamborghini", "Hitam", "Lamborghini Aventador LP 700-4");
		Mobil suzuki 	  = new Mobil(200, "Di Veteran", "M 154 M", "lamborghini", "Hitam", "Turbo Charger 5000cc");

		System.out.println("Mobil lamborghini:\nKecepatan\t: "+lamborghini.getSpeed()+"Km/hour"+"\nPosisi\t\t: "+lamborghini.getPosisi()+"\nNomor Plat\t: "+lamborghini.getNoplat()+"\nMerk\t\t: "+lamborghini.getMerk()+"\nWarna\t\t: "+lamborghini.getWarna()+"\nMesin\t\t: "+lamborghini.getMesin());
		
		System.out.println();
		lamborghini.maju();
		lamborghini.ngebut();
		lamborghini.ngerem();	
		lamborghini.mundur();
		lamborghini.belok();
		lamborghini.berhenti();
		
		System.out.println();
		System.out.println("Mobil Suzuki:\nspeed\t: "+suzuki.getSpeed()+"Km/hour"+"\nPosisi\t\t: "+suzuki.getPosisi()+"\nNomor Plat\t: "+suzuki.getNoplat()+"\nMerk\t\t: "+suzuki.getMerk()+"\nWarna\t\t: "+suzuki.getWarna()+"\nMesin\t\t: "+suzuki.getMesin());

		System.out.println();
		suzuki.maju();
		suzuki.ngebut();
		suzuki.ngerem();
		suzuki.mundur();
		suzuki.belok();
		suzuki.berhenti();

		System.out.println();
		System.out.println("Setelah Modif: \n");
		lamborghini.setSpeed(300);
		lamborghini.setMesin("Lamborghini Aventador LP 700-4");
		lamborghini.setWarna("Putih"); 
		lamborghini.setNoplat("H 4 NA");
	
		System.out.println("Mobil :\nSpeed\t: "+lamborghini.getSpeed()+"Km/hour"+"\nPosisi\t\t: "+lamborghini.getPosisi()+"\nNomor Plat\t: "+lamborghini.getNoplat()+"\nMerk\t\t: "+lamborghini.getMerk()+"\nWarna\t\t: "+lamborghini.getWarna()+"\nMesin\t\t: "+lamborghini.getMesin());


	}

	
}