import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {

//    // (F = C * 1.8 + 32)
        System.out.println("Temperature C:" + 50);
        System.out.println("Temperature F =" + (50 * 1.8 + 32));

        int c = new Scanner(System.in).nextInt();
        double formula = c * 1.8 + 32;

        System.out.println("Please, write down your temperature:");
        System.out.println();
    }
}
