import java.util.Scanner;

public class ChoiceWood {
    public static boolean playChoiceWood() {

        Scanner sc = new Scanner(System.in);
        long slowPrintWaitTime = 1;
        long dotPrintTime = 1;

        System.out.println("You selected wood.");
        Util.displayMessageWithEnter("You pick the pieces of wood up. ");
        Util.displayMessageWithEnter("‘What am I going to do with this...?’");
        Util.displayMessageWithEnter("*The mysterious voice speaks up once again*, 'Choose one, building a campfire or building a bridge'");
        String choice = sc.nextLine().toLowerCase();

        if (choice.equals("campfire")) {
            System.out.println("You selected to build a campfire.");
            int input2 = Util.displayMessageWithNumberTwoInput("Please press 2 to rub two sticks to make a fire for the campfire.");
            if (input2 != 2) {
                System.out.println("Invalid input, please retype 2");
                input2 = Util.displayMessageWithNumberTwoInput("Please type 2 to break the tree");
                if (input2 != 2) {
                    System.out.println("Invalid input, too many attempts, your game has ended, you have no way to proceed.");
                    return false;
                }
                Util.displayMessageWithEnter("You make a fire by rubbing two sticks and build the campfire.");
                Util.displayMessageWithEnter("You use the rest of the wood to make a bench to sit on near the campfire.");
                Util.displayMessageWithEnter("It becomes the night. You are sitting by the fire. You decide to sleep, but you see an ominous silhouette moving forward. It is a pack of mananggals");
                Util.displayMessageWithEnter("You get eaten by the pack of mananggals and you die. Press enter to restart the game, or type any character to end the game.");
                String enter = sc.nextLine();
                if (enter == null || enter.trim().equals("")) {
                    return true;
                } else {
                    System.out.println("Thank you for playing the game!");
                    return false;
                }
            } else {
                Util.displayMessageWithEnter("You have decided to build a bridge");
                Util.displayMessageWithEnter("You decide to lay the pieces of wood out on the river.");
                Util.displayMessageWithEnter("You pick the pieces of wood up. ");
                Util.displayMessageWithEnter("‘Let's hope nothing happens…’");
                Util.displayMessageWithEnter("");
                int input = Util.displayMessageWithNumberInput("Please press 1 to place the wood on the water");
                if (input2 != 2) {
                    System.out.println("Invalid input, please retype 2");
                    input2 = Util.displayMessageWithNumberTwoInput("Please type 2 to break the tree");
                    if (input2 != 2) {
                        System.out.println("Invalid input, too many attempts, your game has ended, you have no way to proceed.");
                        return false;
                    }
                    Util.displayMessageWithEnter("You toss the pieces of wood in the river, hoping to get across in one piece. But, the minute you place them on the water, the current takes them away... ");
                    Util.displayMessageWithEnter("‘What the…?’");
                    Util.displayMessageWithEnter("The night goes on, and you are stranded with no resources.");
                    Util.displayMessageWithEnter("You die in the cold, press enter to restart the game.");
                    String enter = sc.nextLine();
                    if (enter == null || enter.trim().equals("")) {
                        return true;
                    } else {
                        System.out.println("Thank you for playing the game!");
                        return false;
                    }
                }
            }
            return false;
        }
        return false;
    }
}
