import java.util.Random;
import java.util.Scanner;

public class project {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Hello, welcome to Lotto Associations! First, enter your name: ");
        String name = sc.next();
        System.out.println(String.format("Hello, %s!", name));
        boolean first = firstAttempt();
        if (first == false) {
            System.out.println(String.format("Thank you for your time %s! Please return later to do a short survey!", name));
        } else {
            survey();
            while (takeAgain()) {
                survey();
            }
            System.out.println(String.format("Thank you for your time %s! Please return later to do a short survey!", name));
        }
    }

    public static boolean firstAttempt() {
        System.out.println("Would you like to answer some short questions to randomize lotto numbers (Y/N)?");
        char answer = sc.next().toUpperCase().charAt(0);
        if (answer == 'N') {
            return false;
        } else if (answer == 'Y') {
            return true;
        } else {
            System.out.println("You have entered an invalid response. Please try again!");
            return firstAttempt();
        }
    }

    private static boolean takeAgain() {
        System.out.println("Would you like to randomize different numbers (Y/N)?");
        char answer = sc.next().toUpperCase().charAt(0);
        if (answer == 'N') {
            return false;
        } else if (answer == 'Y') {
            return true;
        } else {
            System.out.println("You have entered an invalid response. Please try again!");
            return takeAgain();
        }
    }

    public static class random {
        static Random random = new Random();
        private static int random1() {
            return random.nextInt(50) + 1;
        }
        private static int random2() { return random.nextInt(65) + 1; }
        private static int random3() {
            return random.nextInt(75) + 1;
        }
    }
    public static void survey() {
        int random1 = random.random1();
        int random2 = random.random2();
        int random3 = random.random3();
        System.out.print("What is the name of your favorite pet: ");
        char pet = sc.next().charAt(2);
        System.out.print("What is your lucky number: ");
        int lucky = sc.nextInt();
        System.out.print("Using 2 digits, what is the model year of your car: ");
        int carYr = sc.nextInt();
        System.out.print("What is the first name of your favorite actress or actor: ");
        String act = sc.next();
        System.out.print("What is your favorite color: : ");
        String car = sc.next();
        int value1 = pet;
        value1 = value1 * random1;
        if (value1 > 65) {
            value1 = value1 % 65;
        }
        int value2 = lucky * carYr;
        if (value2 > 65) {
            value2 = value2 % 65;
        }
        int value3 = act.charAt(0) * random2;
        if (value3 > 65) {
            value3 = value3 % 65;
        }
        int value4 = 0;
        for (int i = 0; i > car.length() - 1; i++) {
            int adder = car.charAt(i);
            value4 = value4 + adder;
        }
        if (value4 > 65) {
            value4 = value4 % 65;
        }
        int value5 = act.charAt(act.length() - 1);
        if (value5 > 65) {
            value5 = value5 % 65;
        }
        int magic = lucky * random3;
        if (magic > 75) {
            magic = magic % 75;
        }
        System.out.println("Your lotto numbers are: " + value1 + ", " + value2 + ", " + value3 + ", " + value4 + ", " + value5 + "   Magic Ball: " + magic);
    }
}
