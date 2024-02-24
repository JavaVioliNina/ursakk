import java.util.Scanner;

public class Lesson4_1 {
    public static void main(String[] args) {
     System.out.println("Kalkulatorrrrrrr");
    int a = new Scanner(System.in).nextInt();
    int b = new Scanner(System.in).nextInt();
    double c = new Scanner(System.in).nextDouble();
        double d = new Scanner(System.in).nextDouble();
        System.out.println(a + "*" + b + "=" + a*b);
        System.out.println(a + "+" + b + "=" + (a+b));
        System.out.println(a + "-" + b + "=" + (a-b));
        System.out.println(a + "/" + b + "=" + a/b);

        System.out.println("------------");

        System.out.println(c + "*" + d + "=" + c*d);
        System.out.println(c + "+" + d + "=" + (c+d));
        System.out.println(c + "-" + d + "=" + (c-d));
        System.out.println(c + "/" + d + "=" + c/d);

    }

}
