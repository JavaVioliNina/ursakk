import java.util.Scanner;
public class UrsaWeight {
    public static void main(String[] args) {
        System.out.println("Welcome to the UrsaWeight team!");
        System.out.println("Ursa:");
        int UrsaKg = new Scanner(System.in).nextInt ();
        System.out.println("Barsik:");
        int BarsikKg = new Scanner(System.in).nextInt ();
        System.out.println("Ursak:");
        int UrsakKg = new Scanner(System.in).nextInt ();
        System.out.println("Middle weight of members UtsaWeight team:");
        System.out.println((UrsaKg + BarsikKg + UrsakKg) / 3);
    }
}
