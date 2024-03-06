import java.util.Scanner;
public class WeightProgram {
    public static void main (String[] args) {
        System.out.println("Program for weight comparison Ursa's food");

        System.out.println("Please enter first weight:");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Please enter second weight:");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Please enter third weight:");
        double third = new Scanner(System.in).nextDouble();

        if(first > second && first > third) {
            System.out.println("the biggest weight is:" + first);
        } else if(second > first && second > third) {
            System.out.println("the biggest weight is:" + second);
        } else {
            System.out.println("the biggest weight is:" + third);
        }

        if(first > second && first < third) {
            System.out.println("the middle weight is:" + first);
        } else if(first < second && first > third) {
            System.out.println("the middle weight is:" + first);
        } else if(second < first && second > third) {
            System.out.println("the middle weight is:" + second);
        } else if(second > first && second < third) {
            System.out.println("the middle weight is:" + second);
        } else if(third < first && third > second) {
            System.out.println("the middle weight is:" + third);
        } else{
            System.out.println("the middle weight is:" + third);
        }

        if(first < second && first < third) {
            System.out.println("the smallest weight is:" + first);
        } else if(second < first && second < third) {
            System.out.println("the smallest weight is:" + second);
        } else{
            System.out.println("the smallest weight is:" + third);
        }

    }
}
