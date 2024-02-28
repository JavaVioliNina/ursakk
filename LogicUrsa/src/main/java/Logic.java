import java.util.Scanner;
public class Logic {
    public static void main(String [] args) {
        System.out.println("Ursak team forever together!");
        System.out.println("Ursak age:");
        int ursak = new Scanner(System.in).nextInt();
        if (ursak < 60 && ursak > 40) {
            System.out.println("Ursak is young and strong and clever cat");

        } else if(ursak> 60 && ursak < 100) {
            System.out.println("Ursak is ancient ant");
        } else if(ursak > 20 && ursak < 40) {
            System.out.println("Ursak is baby-cat");
        } else {
            System.out.println("Ursak-kaput");
        }

    }
}
