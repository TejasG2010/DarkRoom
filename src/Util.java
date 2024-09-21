import java.util.Scanner;

public class Util {

    public static long slowPrintWaitTime  = 1;
    public static long dotPrintTime = 1;
    public static Scanner sc = new Scanner(System.in);

    public static void slowPrint(String str, long waitTime){
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {Thread.sleep(waitTime);} catch(InterruptedException ex){}
        }
    }
    public static void displayMessageWithEnter(String message) {
        Util.slowPrint(message, slowPrintWaitTime);
        String enter = sc.nextLine();
        System.out.println();
    }
    public static void displayDotsWithEnter(String message) {
        Util.slowPrint(message, dotPrintTime);
        String enter = sc.nextLine();
        System.out.println();
    }
    public static String displayMessageWithStringInput(String message) {
        Util.slowPrint(message, slowPrintWaitTime);
        String name = sc.nextLine();
        System.out.println();
        return name;
    }
}
