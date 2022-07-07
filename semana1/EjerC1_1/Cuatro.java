import java.util.Scanner;
public class Cuatro {
    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);
        //Scanner sc1 = new Scanner(System.in);
        float gC, gC1, gF, gF2;
        System.out.println("Introduce grados C uno :");
        gC= sc.nextFloat();
        System.out.println("Introduce grados C dos:");
        gC1= sc.nextFloat();
        
        gF= 32 + (9*gC/5);
        gF2= 32 + (9*gC1/5);
        System.out.println(gC+"C = " +gF+ "F");     
        System.out.println(gC1+"C = " +gF2+ "F");     
        sc.close();
        //sc1.close();                                        
 }

}
