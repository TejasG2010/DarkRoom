import java.util.Scanner;

public class ChoiceRope {
    public static boolean playChoiceRope() {

        Scanner sc = new Scanner(System.in);
        long slowPrintWaitTime = 1;
        long dotPrintTime = 1;

        String enter = "";

        System.out.println("You selected rope.");
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("You pick the rope. ‘Rope it is…’", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("You look around and find a tree, which has a sturdy branch attached to it.", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("‘Maybe I can tie the rope to the branch…and swing across!’", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("You use all your strength and climb the tree, until you settle on the branch. It's a little flimsy, but you couldn't care less.", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("Your energy levels are getting lower: 50%, sleep, food, and water gain energy back.", slowPrintWaitTime);
        enter = sc.nextLine();
        Util.slowPrint("You lose energy while doing actions, based on intensity, you will die if you are at 0%", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("You secure the rope around the branch, before tying the other end around your waist.", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("‘Okay…all I need to do is jump and swing…not too hard at all…’", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("Press 123 to swing yourself across.", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("You look down, realizing how high up you are.", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("‘Alright..here goes nothing..’", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("You jump…But the moment you jump, the branch trips you.", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("You fall off and the rope tightens around your neck. ", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("You die due to your neck snapping in half. Enter to restart to start over.", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        if(enter == null || enter.trim().equals("")) {
            return true;
        }
        else{
            System.out.println("Thank you for playing the game!");
            return false;
        }
    }
}