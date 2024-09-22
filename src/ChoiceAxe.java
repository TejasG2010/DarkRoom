import java.util.Scanner;

public class ChoiceAxe {
    public static boolean playChoiceAxe() {

        Scanner sc = new Scanner(System.in);
        long slowPrintWaitTime = 1;
        long dotPrintTime = 1;
        String enter = "";
        Util.displayMessageWithEnter("You selected an axe.");
        Util.displayMessageWithEnter("You look around the forest, ‘What am I going to do with an axe?!’");
        Util.displayMessageWithEnter("Then something clicks...the trees.");
        Util.displayMessageWithEnter("You walk around the forest, trying to find the sturdiest tree.");
        Util.displayMessageWithEnter("You come across a huge, strong tree, ‘perfect!’");
        int input = Util.displayMessageWithNumberInput("Please type 1 to break the tree");
        if (input != 1) {
            System.out.println("Invalid input, please retype 1");
            input = Util.displayMessageWithNumberInput("Please type 1 to break the tree");
            if (input != 1) {
                System.out.println("Invalid input, too many attempts, your game has ended, you have no way to proceed.");
                return false;
            }
        }
        Util.displayMessageWithNumberInput("You're still not able to break the tree, type 1 again button again.");
        Util.displayMessageWithEnter("You are finally able to break the tree.");
        Util.displayMessageWithEnter("You use all your strength to pull the tree trunk over to the river.");
        Util.displayMessageWithEnter("Your energy levels are getting lower: 50%, sleep, food, and water gain energy back.");
        Util.displayMessageWithEnter("You lose energy while doing actions, based on intensity, you will die if you are at 0%");
        Util.displayMessageWithEnter("‘Now I need to push this across the river.’");
        Util.displayMessageWithEnter("You manage to get the trunk across, making the tree a bridge. ");
        Util.displayMessageWithEnter("You carefully use the tree trunk to walk across the river...managing to make it to the other side.");
        Util.displayMessageWithEnter("Your energy levels are at 20%, recommend finding food immediately.");
        Util.displayMessageWithEnter("The sun has started setting, your vision has lowered to 60%.");

        System.out.println("");
        return true;
    }
}

