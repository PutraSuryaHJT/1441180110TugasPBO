import java.util.Scanner; //import lib I/O java 

public class Menu{
  int hasil=0; 
  //Fungsi Penjumlahan bil1 + bil2
        void Penjumlahan (int bil1,int bil2){
            hasil=bil1+bil2;
            System.out.println("Pertambahan : "+bil1+" + "+bil2+" = "+hasil);
        }
        //Fungsi Pengurangan bil1 + bil2
        void Pengurangan (int bil1,int bil2){
            hasil=bil1-bil2;
            System.out.println("Pengurangan : "+bil1+" - "+bil2+"  = "+hasil);
        }
        //Fungsi Perkalian bil1 + bil2
        void Perkalian (int bil1,int bil2){
            hasil=bil1*bil2;
            System.out.println("Perkalian   : "+bil1+" X "+bil2+" = "+hasil);
        }
        //Fungsi Pembagian bil1 + bil2
        void Pembagian (int bil1,int bil2){
            hasil=bil1/bil2;
            System.out.println("Pembagian   : "+bil1+" / "+bil2+"  = "+hasil);
        }
        //Fungsi Exit
        void Exit (){
            System.exit(0);
        }
 public static void main (String args[]){
  for (int i = 1; i < 9999 ; ){
  Scanner input = new Scanner( System.in );  
  System.out.println("Putra Surya (JAVA Menu Sederhana)");
  System.out.println("Menu :");
  System.out.println("1. Penjumlahan");
  System.out.println("2. Pengurangan");
  System.out.println("3. Perkalian");
  System.out.println("4. Pembagian");
  System.out.println("5. Exit");
  System.out.println("Masukan Pilihan anda  :");
  int pilihan = input.nextInt(); 
  
  switch(pilihan){

  case 1 :
Scanner a1 = new Scanner(System.in);
System.out.print("Masukan bil1 : ");
int bil1 = a1.nextInt();
Scanner b2 = new Scanner(System.in);
System.out.print("Masukan bil2 : ");
int bil2 = b2.nextInt();
int c;
c = bil1+ bil2;
System.out.print("Hasil Dari "+ bil1 );
System.out.print(" + " + bil2);
System.out.print(" = " + c);
System.out.println("");
     break;

   case 2 :
Scanner a2 = new Scanner(System.in);
System.out.print("Masukan bil1 : ");
int x1 = a2.nextInt();
Scanner b1 = new Scanner(System.in);
System.out.print("Masukan bil2 : ");
int x2 = b1.nextInt();
int x3;
x3 = x1 - x2;
System.out.print("Hasil Dari " + x1 );
System.out.print(" - " + x2 );
System.out.print(" = " + x3 );
System.out.println("");
     break;
  
   case 3 :
Scanner z1 = new Scanner(System.in);
System.out.print("Masukan bil1 : ");
int na = z1.nextInt();
Scanner z2 = new Scanner(System.in);
System.out.print("Masukan bil2 : ");
int nb = z2.nextInt();
int nc;
nc = na * nb;
System.out.print("Hasil Dari "+ na );
System.out.print(" X " + nb);
System.out.print(" = " + nc);
System.out.println("");
     break;
  
   case 4 :
Scanner k1 = new Scanner(System.in);
System.out.print("Masukan bil1 : ");
double ka = k1.nextInt();
Scanner k2 = new Scanner(System.in);
System.out.print("Masukan bil2 : ");
double kb = k2.nextInt();
double kc;
kc = ka/ kb;
System.out.print("Hasil Dari "+ ka );
System.out.print(" / " + kb);
System.out.print(" = " + kc);
System.out.println("");
      break;
    
    case 5:
        System.out.println("=> Anda Memilih Keluar. . .Terima Kasih!, Thank You! :)");
          System.exit(0);
        System.out.println("");
        break;
   default :
     System.out.println("Maaf, pilihan yang anda ketik tidak tersedia!");
     break;
   }
  }
 }

}