import java.util.Scanner;
public class Lab1 {

    public static void main(String[] args){
//        step1();
//        step3();
//        step4();
//        anotherMethod();
        playWithStrings();
    }
//    Step 1
    static void step1 (){
        int firstInt = 6;
        System.out.println(firstInt);
        int secondInt = 20;
        System.out.println(secondInt);
        int thirdInt = 0;
//        System.out.println(thirdInt);
        float idk1 = 4.4f;
        System.out.println(idk1);
        boolean isCold = false;
        System.out.println(isCold);
        double trouble = 384_923;
        System.out.println(trouble);
//        Step 2
//        int firstAdd = firstInt + secondInt;
        System.out.println(firstInt + secondInt);
        System.out.println(secondInt/firstInt);
        System.out.println(secondInt%firstInt);
        int lastStep2 = firstInt + (secondInt%firstInt);
        System.out.println(++lastStep2);
    }
    static void step3(){
        int x = 100;
        int y = 106;
        int z = 92;
        boolean compare3 = (x<y)==!(x>y);
        System.out.println(compare3);

    }
    static void step4(){
        int n = 64;
        System.out.println(n);
        System.out.println(n>>1);
        System.out.println(n/2);
        System.out.println(n<<1);
        System.out.println(n*2);
    }
    public static void anotherMethod(){
        Integer idk = Integer.valueOf(2327);
        Integer idk2 = Integer.valueOf("2328");
//        This code can only be ran if you call the method within main().
        if(idk>idk2){
//            System.out.println(idk + " is greater than 1000. Big value!");
            System.out.println(idk2 + " is less than " + idk);
            System.out.println("Comparing " + idk + " and "  + idk2 + " : " + idk.compareTo(idk2));
        }else{
//            System.out.println(idk + " is less than 1000. Not a big value!");
            System.out.println("Comparing " + idk + " and "  + idk2 + " : " + idk.compareTo(idk2));
        }
    }

    public static void playWithStrings(){
        String Ronnie = new String("Ronnie ");
        String Stevenson = new String("Stevenson");
        String Name = Ronnie.concat(Stevenson);
        System.out.println(Ronnie);
        System.out.println(Stevenson);
        System.out.println(Name);
        System.out.println("Hello " + Name);
    }
}
