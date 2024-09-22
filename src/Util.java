import java.util.Scanner;

public class Util {

    public static long slowPrintWaitTime  = 1;
    public static long dotPrintTime = 1;
    public static Scanner sc = new Scanner(System.in);

    public static Scanner numbersc = new Scanner(System.in);
    public static Scanner numbertwosc = new Scanner(System.in);
    public static Scanner sccode = new Scanner(System.in);

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
    public static int displayMessageWithNumberInput(String message) {
        Util.slowPrint(message, slowPrintWaitTime);
        System.out.println();
        int number = numbersc.nextInt();
        return number;
    }
    public static int displayMessageWithNumberTwoInput(String message) {
        Util.slowPrint(message, slowPrintWaitTime);
        System.out.println();
        int numberTwo = numbertwosc.nextInt();
        return numberTwo;
    }
    public static void displayDotsWithEnter(String message) {
        Util.slowPrint(message, dotPrintTime);
        String enter = sc.nextLine();
        System.out.println();
    }
    public static String displayMessageWithStringInput(String message) {
        Util.slowPrint(message, slowPrintWaitTime);
        String name = sc.nextLine();
        if(name == null || name.trim().isEmpty()) {
            name = sc.nextLine();
        }
        System.out.println();
        return name;
    }

    public static String codeOne(String message) {
        Util.slowPrint(message, slowPrintWaitTime);
        System.out.println();
        String codeOne = sccode.nextLine();
        if(codeOne == null || codeOne.trim().isEmpty()) {
            codeOne = sc.nextLine();
        }
        System.out.println();
        return codeOne;
    }
    public static String codeTwo(String message) {
        Util.slowPrint(message, slowPrintWaitTime);
        System.out.println();
        String codeTwo = sccode.nextLine();
        if(codeTwo == null || codeTwo.trim().isEmpty()) {
            codeTwo = sc.nextLine();
        }
        System.out.println();
        return codeTwo;
    }


}
