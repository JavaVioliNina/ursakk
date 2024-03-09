import java.util.Scanner;
public class XY {
    public static void main(String[] args) {
        System.out.println("Hi! XY - the most important app in your life! try and enjoy!");
        int x = 0;
        int y = 0;

        System.out.println("Where you want to go?\n 1 - X(+)\n 2 - X(-)" +
                "\n 3 - Y(+)\n 4 - Y(-)");
        int go = new Scanner(System.in).nextInt();

        System.out.println("How many steps (max 3) you want to go?");
        int steps = new Scanner(System.in).nextInt();

        if (go == 1 && steps == 1) {
            System.out.println("\t \t Y \n \t \t .\n \t \t ." +
                    "\n \t \t . \n X . . . 0 * . . (+)\t \n \t \t ." +
                    "\n \t \t .\n \t \t . \n \t \t(-) ");
        } else if (go == 1 && steps == 2) {
            System.out.println("\t \t Y \n \t \t .\n \t \t ." +
                    "\n \t \t . \n X . . . 0 . * . (+)\t \n \t \t ." +
                    "\n \t \t .\n \t \t . \n \t \t(-)");
        } else if (go == 1 && steps == 3) {
            System.out.println("\t \t Y \n \t \t .\n \t \t ." +
                    "\n \t \t . \n X . . . 0 . . * (+)\t \n \t \t ." +
                    "\n \t \t .\n \t \t . \n \t \t(-)");
        } else {
            System.out.println("What???");
        }

        if (go == 2 && steps == 1) {
            System.out.println("\t \t Y \n \t \t .\n \t \t ." +
                    "\n \t \t . \n X . . * 0 . . . (+)\t \n \t \t ." +
                    "\n \t \t .\n \t \t . \n \t \t(-) ");
        } else if (go == 2 && steps == 2) {
            System.out.println("\t \t Y \n \t \t .\n \t \t ." +
                    "\n \t \t . \n X . * . 0 . . . (+)\t \n \t \t ." +
                    "\n \t \t .\n \t \t . \n \t \t(-)");
        } else if (go == 2 && steps == 3) {
            System.out.println("\t \t Y \n \t \t .\n \t \t ." +
                    "\n \t \t . \n X * . . 0 . . . (+)\t \n \t \t ." +
                    "\n \t \t .\n \t \t . \n \t \t(-)");
        } else {
            System.out.println("What???");
        }

        if (go == 3 && steps == 1) {
            System.out.println("\t \t Y \n \t \t .\n \t \t ." +
                    "\n \t \t * \n X . . . 0 . . . (+)\t \n \t \t ." +
                    "\n \t \t .\n \t \t . \n \t \t(-) ");
        } else if (go == 3 && steps == 2) {
            System.out.println("\t \t Y \n \t \t .\n \t \t *" +
                    "\n \t \t . \n X . . . 0 . . . (+)\t \n \t \t ." +
                    "\n \t \t .\n \t \t . \n \t \t(-)");
        } else if (go == 3 && steps == 3) {
            System.out.println("\t \t Y \n \t \t *\n \t \t ." +
                    "\n \t \t . \n X . . . 0 . . . (+)\t \n \t \t ." +
                    "\n \t \t .\n \t \t . \n \t \t(-)");
        } else {
            System.out.println("What???");
        }

        if (go == 4 && steps == 1) {
            System.out.println("\t \t Y \n \t \t .\n \t \t ." +
                    "\n \t \t . \n X . . . 0 . . . (+)\t \n \t \t *" +
                    "\n \t \t .\n \t \t . \n \t \t(-) ");
        } else if (go == 4 && steps == 2) {
            System.out.println("\t \t Y \n \t \t .\n \t \t ." +
                    "\n \t \t . \n X . . . 0 . . . (+)\t \n \t \t ." +
                    "\n \t \t *\n \t \t . \n \t \t(-)");
        } else if (go == 4 && steps == 3) {
            System.out.println("\t \t Y \n \t \t .\n \t \t ." +
                    "\n \t \t . \n X . . . 0 . . . (+)\t \n \t \t ." +
                    "\n \t \t .\n \t \t * \n \t \t(-)");
        } else {
            System.out.println("What???");
        }
    }
        }





