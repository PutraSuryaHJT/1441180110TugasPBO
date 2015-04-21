import java.util.Scanner;
class TestTabungan{
	
public static void main(String[] args) {

		Tabungan satu = new Tabungan();
		Tabungan dua = new Tabungan(3000000);
		Tabungan tiga = new Tabungan(4000000, "Hari");
		Tabungan empat = new Tabungan(99999999, "Janto", 90909090);
		Scanner uang = new Scanner(System.in);
		System.out.println("Pemilik Rekening Pertama	= "+ satu.getPemilikRek());
		System.out.println("Simpanan 			= Rp."+satu.getSimpanan()+"");
		System.out.println("Nomor Rekening 			= "+satu.getNoRek());
		System.out.println("Bunga 				= "+satu.getBunga()+"%");
		System.out.println("1. Menabung");
		System.out.println("2. Mengambil");
		System.out.println("3. Transfer");
		System.out.println("4. Cek Terima Transfer");
		System.out.println("5. Keluar");
		System.out.print("Masukkan Pilihan = ");
		int s = uang.nextInt();
    	switch (s) 
    		{
    	case 1 :
			satu.menabung();
			satu.saldo();
        break;
        case 2 :
			satu.mengambil();
			satu.saldo();
		break;
		case 3 :
			satu.mentransfer();
			satu.saldo();
		break;
		case 4 :
			satu.menerima();
			satu.saldo();
		break;
		case 5 : 
			System.out.println("Terima Kasih Sudah Menggunakan Layanan Kami");
			break;
		default:
			System.out.println("Error");
			break;
			}

		System.out.println();
		System.out.println("Pemilik Rekening Kedua		= "+ dua.getPemilikRek());
		System.out.println("Simpanan 			= Rp."+dua.getSimpanan()+"");
		System.out.println("Nomor Rekening 			= "+dua.getNoRek());
		System.out.println("Bunga 				= "+dua.getBunga()+"%");
		System.out.println("1. Menabung");
		System.out.println("2. Mengambil");
		System.out.println("3. Transfer");
		System.out.println("4. Cek Terima Transfer");
		System.out.println("5. Keluar");
		System.out.print("Masukkan Pilihan = ");
		int d = uang.nextInt();
    	switch (d) 
    	{
    	case 1 :
		dua.menabung();
		dua.saldo();
		break;
		case 2 :
		dua.mengambil();
		dua.saldo();
		break;
		case 3 :
		dua.saldo();
		dua.mentransfer();
		break;
		case 4 :
		dua.menerima();
		dua.saldo();
		break;
		case 5 : 
			System.out.println("Terima Kasih Sudah Menggunakan Layanan Kami");
			break;
		default:
			System.out.println("Error");
			break;
		}
		System.out.println();
		System.out.println("Pemilik Rekening Ketiga		= "+ tiga.getPemilikRek());
		System.out.println("Simpanan 			= Rp."+tiga.getSimpanan()+"");
		System.out.println("Nomor Rekening 			= "+tiga.getNoRek());
		System.out.println("Bunga 				= "+tiga.getBunga()+"%");
		System.out.println("2. Mengambil");
		System.out.println("3. Transfer");
		System.out.println("4. Cek Terima Transfer");
		System.out.println("5. Keluar");
		System.out.print("Masukkan Pilihan = ");
		int t = uang.nextInt();
    	switch (t) 
    	{
    	case 1 :
		tiga.menabung();
		tiga.saldo();
		break;
		case 2 :
		tiga.mengambil();
		tiga.saldo();
		break;
		case 3 :
		tiga.mentransfer();
		tiga.saldo();
		break;
		case 4 :
		tiga.menerima();
		tiga.saldo();
		break;
		case 5 : 
			System.out.println("Terima Kasih Sudah Menggunakan Layanan Kami");
			break;
		default:
			System.out.println("Error");
			break;
		}
		System.out.println();
		System.out.println("Pemilik Rekening Keempat	= "+ empat.getPemilikRek());
		System.out.println("Simpanan 			= Rp."+empat.getSimpanan()+"");
		System.out.println("Nomor Rekening 			= "+empat.getNoRek());
		System.out.println("Bunga 				= "+empat.getBunga()+"%");
		System.out.println("1. Menabung");
		System.out.println("2. Mengambil");
		System.out.println("3. Transfer");
		System.out.println("4. Cek Terima Transfer");
		System.out.println("5. Keluar");
		System.out.print("Masukkan Pilihan = ");
		int e = uang.nextInt();
    	switch (e) 
    	{
    	case 1 :
		empat.menabung();
		empat.saldo();
		break;
		case 2 :
		empat.mengambil();
		empat.saldo();
		break;
		case 3 :
		empat.mentransfer();
		empat.saldo();
		break;
		case 4 :
		empat.menerima();
		empat.saldo();
		break;
		case 5 : 
			System.out.println("Terima Kasih Sudah Menggunakan Layanan Kami");
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
}