import java.util.Scanner;
public class GreenCafeOp{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        GreenCafe g = new GreenCafe();
        
        System.out.println("\n Hello, Welcome!");
        System.out.println("-- You are currently ordering matcha!");
        System.out.print("\nWould you like to order plain matcha(0 for yes, 1 for no)? ");
        g.order(s.nextInt());

        s.close();
    }
}