import java.util.Scanner;

public class ChoiceRope {
    public static boolean playChoiceRope() {

        Scanner sc = new Scanner(System.in);
        long slowPrintWaitTime = 1;
        long dotPrintTime = 1;


        System.out.println("You selected rope.");
        Util.displayMessageWithEnter("You pick the rope. ‘Rope it is…’");
        Util.displayMessageWithEnter("You look around and find a tree, which has a sturdy branch attached to it.");
        Util.displayMessageWithEnter("‘Maybe I can tie the rope to the branch... And swing across!’");
        Util.displayMessageWithEnter("You use all your strength and climb the tree, until you settle on the branch. It's a little flimsy, but you couldn't care less.");
        Util.displayMessageWithEnter("Your energy levels are getting lower: 50%, sleep, food, and water gain energy back.");
        Util.displayMessageWithEnter("You lose energy while doing actions, based on intensity, you will die if you are at 0%");
        Util.displayMessageWithEnter("You secure the rope around the branch, before tying the other end around your waist.");
        Util.displayMessageWithEnter("‘Okay... All I need to do is jump and swing... Not too hard at all...’");
        Util.displayMessageWithNumberInput("Type 1 to swing yourself across.");
        Util.displayMessageWithEnter("You look down, realizing how high up you are.");
        Util.displayMessageWithEnter("‘Alright... Here goes nothing...’");
        Util.displayMessageWithEnter("You jump... But the moment you jump, the branch trips you.");
        Util.displayMessageWithEnter("You fall off and the rope tightens around your neck. ");
        Util.displayMessageWithEnter("You die due to your neck snapping in half. Enter to restart to start over.");
        System.out.println("Press enter to restart the game, press any character and then enter to quit the game fully. (type choice here): ");
        String enter = sc.nextLine();
        if(enter == null || enter.trim().equals("")) {
            return true;
        }
        else{
            System.out.println("Thank you for playing the game!");
            return false;
        }
    }
}