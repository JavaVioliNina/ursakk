import java.util.Scanner;
public class MacUrsak {
    public static void main(String[]args) {
        System.out.println("Welcome to the Mac-Ursak!");
        System.out.println("Please enter all your money!");
        int money = new Scanner(System.in).nextInt();

        int big = 250;
        int file = 190;
        int vegan = 102;
        int luxury = 2099;
        int whiskas = 50;

        System.out.println("Please chose Ursak-Menu!\n 1. Big-Ursa - 250$\n 2. File-o-Mur - 190$\n" +
                " 3. Vegan-Ursak-Style - 102$\n 4. Luxury-Big-Ursa - 2099$ \n 5. Whiskas - 50$");
        int choose = new Scanner(System.in).nextInt();
        if (choose == 1 && money >= big) {
            System.out.println("Enjoy your Big-Ursa Menu!");
        } else if(choose == 2 && money >= file) {
            System.out.println("Enjoy your File-o-Mur!");
        } else if(choose == 3 && money >= vegan) {
            System.out.println("Ugh... Enjoy your Vegan-Ursak-Style...");
        } else if(choose == 4 && money >= luxury) {
            System.out.println("Wooooow!!! Very enjoy your Luxury-Big-Ursa Menu and come to us again!");
        } else if(choose == 5 && money >= whiskas) {
        System.out.println("Enjoy your Whiskas, retarded...");
    } else {
        System.out.println("Ursak is sorry for you");
    }

    }
}
