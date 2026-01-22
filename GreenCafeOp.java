import java.util.Scanner;
public class GreenCafeOp{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        GreenCafe g = new GreenCafe();
        
        System.out.println("\n Hello, Welcome!");
        System.out.println("-- KAPEHAN NI ABA MINUE:");
        System.out.println("\n1. Americano \n2. Matcha ");
        System.out.print("what would you like to order? ");

        g.order(s.nextInt());

        s.close();
    }
}