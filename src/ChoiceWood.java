import java.util.Scanner;

public class ChoiceWood {
    public static boolean playChoiceWood() {

        Scanner sc = new Scanner(System.in);
        long slowPrintWaitTime  = 1;
        long dotPrintTime = 1;

        String enter = "";

        System.out.println("You selected wood.");
        Util.slowPrint("You sigh and decide on the wood. ‘Fine..I guess I'll choose the wood.’", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("You pick the pieces of wood up. ", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("‘What am I going to do with this...?’", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("*The mysterious voice speaks up once again*, 'Choose one, building a campfire or building a bridge'", slowPrintWaitTime);
        sc.nextLine();
        System.out.println();
        String choice = sc.nextLine().toLowerCase();
        if(choice.equals("campfire")) {
            System.out.println("You selected to build a campfire.");
            Util.slowPrint("You make a fire by rubbing two sticks and build the campfire.", slowPrintWaitTime);
            enter = sc.nextLine();
            System.out.println();
            Util.slowPrint("It becomes the night. You are sitting by the fire. You see an ominous silhouette moving forward. It is a pack of tigers", slowPrintWaitTime);
            enter = sc.nextLine();
            System.out.println();
            Util.slowPrint("You get eaten by the pack of tigers and you die. Press enter to restart the game, or type any character to end the game.", slowPrintWaitTime);
            System.out.println();
            enter = sc.nextLine();
            if(enter == null || enter.trim().equals("")) {
                return true;
            }
            else{
                System.out.println("Thank you for playing the game!");
                return false;
            }
        }
        else {
            Util.slowPrint("You have decided to build a bridge", slowPrintWaitTime);
            enter = sc.nextLine();
            System.out.println();
            Util.slowPrint("You decide to lay the pieces of wood out on the river.", slowPrintWaitTime);
            enter = sc.nextLine();
            System.out.println();
            Util.slowPrint("You pick the pieces of wood up. ", slowPrintWaitTime);
            enter = sc.nextLine();
            System.out.println();
            Util.slowPrint("‘Let's hope nothing happens…’", slowPrintWaitTime);
            enter = sc.nextLine();
            System.out.println();
            Util.slowPrint("You toss the pieces of wood in the river, hoping to get across in one piece. But, the minute you place them on the water, the current takes them away... ", slowPrintWaitTime);
            enter = sc.nextLine();
            System.out.println();
            Util.slowPrint("‘What the…?’", slowPrintWaitTime);
            enter = sc.nextLine();
            System.out.println();
            Util.slowPrint("The night goes on, and you are stranded with no resources.", slowPrintWaitTime);
            enter = sc.nextLine();
            System.out.println();
            Util.slowPrint("You die in the cold, press enter to restart the game.", slowPrintWaitTime);
            if(enter == null || enter.trim().equals("")) {
                return true;
            }
            else{
                System.out.println("Thank you for playing the game!");
                return false;
            }
        }
    }
}
