import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        System.out.println("Hi! XY - the most important app in your life! try and enjoy!");
        int x = 0;
        int y = 0;

        System.out.println("Where you want to go?\n 1 - X(+)\n 2 - X(-)" +
                "\n 3 - Y(+)\n 4 - Y(-)");

        int go = new Scanner(System.in).nextInt();
        System.out.println("How many steps you want to go?");
        int steps = new Scanner(System.in).nextInt();

        if(go == 1){
            x = x + steps;
            System.out.println("Your coordinates are: X = " + x + ", Y = " + y);
        } else if(go == 2){
            x = x - steps;
            System.out.println("Your coordinates are: X = " + x + ", Y = " + y);
        } else if(go == 3){
            y = y + steps;
            System.out.println("Your coordinates are: X = " + x + ", Y = " + y);
        } else if(go == 4){
            y = y - steps;
            System.out.println("Your coordinates are: X = " + x + ", Y = " + y);
        } else {
            System.out.println("Muuuur!!!!!!");
        }
    }
}
