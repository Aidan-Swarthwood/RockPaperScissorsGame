import java.util.Scanner;

public class RPS {

    public static void main(String[] args) {

        double one = 0;
        double two = 0;
        double three = 0;
        String trash = "";
        boolean done = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Meters: ");
            if (in.hasNextDouble()) {
                one = in.nextDouble();
                in.nextLine();
                if (one > 0) {
                    done = true;
                } else {
                    System.out.println("Must enter a valid number [> 0]");}
            } else {
                trash = in.nextLine();
                System.out.println("You must enter a valid number here. Not: " + trash);
            }
        } while(!done);
        double inches = 3.3701 * one;
        double feet = 3 * one;
        double miles = 0.000621371 * one;
        System.out.println("Your answer for inches is " + inches + " Your answer for feet is " + feet + " Your answer for inches is " + miles);
    }
}