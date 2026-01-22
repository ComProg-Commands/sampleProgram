import java.util.Scanner;
class GreenCafe{
    int choice, Latte,Temperature, initialprice, finalprice;;

    public GreenCafe(){
        initialprice = 50;
        finalprice = initialprice;
    }
    Scanner s = new Scanner(System.in);
    public void Latte(){
        System.out.println("\n(0 for no, 1 for yes)");
        System.out.print("Do you want a latte? ");
        Latte = s.nextInt();
        if (Latte == 1){
            finalprice += 5;
        }
        return;
    }

    public void Temperature(){
        System.out.println("\n(0 for hot, 1 for cold)");
        System.out.print("Do you want it hot or cold? ");
        Temperature = s.nextInt();
        if (Temperature == 1){
            finalprice += 5;
        }
        return;
    }

    public void order(int choice){
        while (true){
            if (choice == 1){
                System.out.println("-- Alright!");
                Latte();
                Temperature();
                System.out.println("\n-- Thank you!");
                System.out.println("Your order: " 
                + (Latte == 1 ? "Latte" : "Regular") + ", "
                + (Temperature == 0 ? "Hot" : "Cold"));
                System.out.println("\n! The amount to pay is " + finalprice);
            }else {
                System.out.println("\n-- Thank you! \n! The amount to pay is " + initialprice);
                break;
            }
            break;
        }
    }
}