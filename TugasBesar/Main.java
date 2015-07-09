package TugasBesar;

/**
 * Created by putra on 7/6/2015.
 */
public class Main {
    public static void main(String[] args) {
        Liga Inggris = new Liga("Inggris");
        Liga Italy   = new Liga("Italy");

        Divisi tingkat1 = new Divisi("Primer league");
        Divisi tingkat2 = new Divisi("Championship league");
        Divisi serieA   = new Divisi("Serie A");
        Divisi serieB   = new Divisi("Serie B");


        Klub satu1  = new Klub("Chelsea",tingkat1,Inggris);
        Klub dua2   = new Klub("Liverpool",tingkat1,Inggris);
        Klub tiga3  = new Klub("Hull City",tingkat2,Inggris);
        Klub empat4 = new Klub("Burnley",tingkat2,Inggris);
        Klub lima5  = new Klub("Juventus",serieA,Italy);
        Klub enam6  = new Klub("Empoli",serieB,Italy);

        Inggris.setDaftarDivisi(tingkat1);
        Inggris.setDaftarDivisi(tingkat2);
        Inggris.setDaftarKlub(satu1);
        Inggris.setDaftarKlub(dua2);
        Inggris.setDaftarKlub(tiga3);
        Inggris.setDaftarKlub(empat4);

        Italy.setDaftarKlub(lima5);
        Italy.setDaftarKlub(enam6);

        tingkat1.setDaftarKlub(satu1);
        tingkat1.setDaftarKlub(dua2);

        tingkat2.setDaftarKlub(tiga3);
        tingkat2.setDaftarKlub(empat4);

        serieA.setDaftarKlub(lima5);
        serieB.setDaftarKlub(enam6);

        System.out.println("1. Get daftar divisi by namaLiga");
        System.out.println("Liga   = " + Inggris.getNamaLiga());
        System.out.println("Divisi = " + Inggris.getDaftarDivisi());

        System.out.println("\n");

        System.out.println("2. Get daftar klub by namaLiga");
        System.out.println("Liga   = " + Inggris.getNamaLiga());
        System.out.println("Klub   = " + Inggris.getDaftarKlub());

        System.out.println("\n");

        System.out.println("3. Get daftar klub by namaDivisi");
        System.out.println("Liga   = " + Inggris.getNamaLiga());
        System.out.println("Klub   = " +tingkat1.getDaftarKlub() + ", " +tingkat2.getDaftarKlub());

        System.out.println("\n");

        System.out.println("4. Get klub ini berada di divisi mana by namaKlub");
        System.out.println("Liga   = " + Inggris.getNamaLiga());
        System.out.println("Klub satu   = " +satu1.getNamaKlub() + " berasal dari " +satu1.getDivisi());
        System.out.println("Klub dua   = " + dua2.getNamaKlub() + " berasal dari " + dua2.getDivisi());
        System.out.println("Klub tiga   = " + tiga3.getNamaKlub() + " berasal dari " + tiga3.getDivisi());
        System.out.println("Klub empat   = " + empat4.getNamaKlub() + " berasal dari " + empat4.getDivisi());
        System.out.println("Klub lima   = " + lima5.getNamaKlub() + " berasal dari " + lima5.getDivisi());
        System.out.println("Klub enam   = " + enam6.getNamaKlub() + " berasal dari " + enam6.getDivisi());

        System.out.println("\n");

        System.out.println("5. Get klub ini berada di liga apa by namaKlub");
        System.out.println("Liga   = " +Inggris.getNamaLiga());
        System.out.println("Klub satu  = " +satu1.getNamaKlub() + " berasal dari " +satu1.getLiga());
        System.out.println("Klub dua   = " + dua2.getNamaKlub() + " berasal dari " + dua2.getLiga());
        System.out.println("Klub tiga  = " + tiga3.getNamaKlub() + " berasal dari " + tiga3.getLiga());
        System.out.println("Klub empat = " + empat4.getNamaKlub() + " berasal dari " + empat4.getLiga());
        System.out.println("Klub lima = " + lima5.getNamaKlub() + " berasal dari " + lima5.getLiga());
        System.out.println("Klub enam = " + enam6.getNamaKlub() + " berasal dari " + enam6.getLiga());

    }
}
