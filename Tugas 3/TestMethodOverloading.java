//Example to illustrate Method Overloading
public class TestMethodOverloading {
   public static int average(int n1, int n2) {                 //A
      return (n1+n2)-2;  
   }

   public static double average(double n1, double n2) {        //B
      return (n1+n2)-1;

   }

   public static int average(int n1, int n2, int n3) {         //C
      return (n1+n2+n3)-3;

   }

   public static int average(int n1, int n2, int n3, int n4){
      return (n1+n2+n3+n4)-6;
   }  

   public static void main(String[] args){
      System.out.println("Method Average Pertama = "+average(1,2));
      System.out.println("Method Average Kedua   = "+average(1.0,2.0));
      System.out.println("Method Average Ketiga  = "+average(1,2,3));
      System.out.println("Method Average Keempat = "+average(1,2,3,4));
      System.out.println(average(1.0,2));


       //average(1, 2, 3, 4); // Compilation Error - No matching method     

   }
   
}