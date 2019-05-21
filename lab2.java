import java.util.Scanner;

public class lab2 {
    public static void main(String args[]){
//        step1();
//        step2();
//        step3();
//        step4();
        System.out.println(step5(7));
    }

    public static void step1(){
        Scanner scanner = new Scanner(System.in);
        do {
            // Scanners reads input from the command line through various methods
            //promot and read a string
//        System.out.print("Enter your name: ");
//        String username = scanner.next();

            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            if (age >= 16) {
                System.out.println("You are old enough to drive. No texting!");
            } else {
                System.out.println("Enjoy driving when you get a chance. You will hate it later in life.");
            }
            if (age >= 18) {
                System.out.println("You are old enough to vote. Vote or die!");
            } else {
                System.out.println("Voting is a major responsibility, one which you are not ready for yet.");
            }
            if (age >= 21) {
                System.out.println("You are old enough to drink. Turn up!!!");
            } else {
                System.out.println("Hennything is possible, but not for you. Soon...");
            }
            if (age >= 35) {
                System.out.println("You are old enough to run for President. Such fun.");
            } else {
                System.out.println("Who wants to be President anyways?");
            }
            if (age >= 55) {
                System.out.println("You are old enough to join AARP. Yay?!?");
            } else {
                System.out.println("What even is AARP?");
            }
            if (age >= 67) {
                System.out.println("You are old enough to draw from Social Security. Get them benefits!!");
            } else {
                System.out.println("Your bones ain't that old yet.");
            }
            System.out.println("Would you like to enter another age?");
            System.out.println(String.format("Enter (true) for yes, and (false) for no: "));
        }while(scanner.nextBoolean()==true);
    }
    public static void step2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your employment status");
        System.out.println("Enter (E) for Employed, (U) for Unemployed, or (S) for student: ");
        String status = scanner.next();
        System.out.println("What kind of vehicle do you drive?");
        System.out.println("Enter (C) for car, (T) for truck, (V) for van, (S) for SUV, or (N) for none of the above");
        String car = scanner.next();


        switch (status){
            case "E":
                System.out.println("You have entered in that you are Employed.");
                break;
            case "U":
                System.out.println("You have entered in that you are Unemployed.");
                break;
            case "S":
                System.out.println("You have entered that you are a Student");
                break;
            default:
                System.out.println("You have not entered a valid response, try again.");
                step2();
        }
        switch (car){
            case "C":
                System.out.println("You drive a Car!");
                break;
            case "T":
                System.out.println("You drive a Truck!");
                break;
            case "V":
                System.out.println("You drive a Van!");
                break;
            case "S":
                System.out.println("You drive a SUV!");
                break;
            case "N":
                System.out.println("I wish I didn't drive a car either. Trust me.");
                break;
            default:
                System.out.println("You have not selected a valid option, please try again!!!");
                step2();
        }
    }
    public static void step3(){
        int[] myArray = new int[30];

        for (int i = 0; i < myArray.length;i++){
            myArray[i]= i * 2;
        }
        for(int i : myArray){
            System.out.println(i);
        }

        for (int t = myArray.length-1; t>=0; t--){
            System.out.println(myArray[t]);
        }

    }
    public static void step4(){
        int [] myArray = new int[30];
        int i = 0;
        do {
            myArray[i]=i*2;
            System.out.println(myArray[i]);
            i++;
        } while(i < myArray.length);
        i = 60;
        do{
            System.out.println(i);
            i-=2;
        } while(i>=0);
    }
    public static int step5(int newNumber){
        int[] myArray = new int[30];
        int sum = 0;

        for (int i = 0; i < myArray.length;i++){
            myArray[i]= i;
            if(myArray[i]%2!=0){
                System.out.println(myArray[i]);
            }else if(myArray[i]%2==0){
                sum = sum + myArray[i];
            }
            if(newNumber == myArray[i]){
                break;
            }
        }
        return sum;
    }

}
