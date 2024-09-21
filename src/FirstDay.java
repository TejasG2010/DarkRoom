import java.util.Scanner;

public class FirstDay {

    public static void playFirstDay() {

        Scanner sc = new Scanner(System.in);
        long slowPrintWaitTime  = 1;
        long dotPrintTime = 1;
        String enter = "";

        displayFirstDayMessages();

        String choice;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // If loop until the user makes a valid choice
        boolean isEndOfGame = false;
        do {
            System.out.print("Select an item (wood, rope, axe): ");
            choice = sc.nextLine().toLowerCase();

            if (choice.equals("wood")) {
                boolean continueGame = ChoiceWood.playChoiceWood();
                if(continueGame) {
                    continue;
                } else {
                    break;
                }
            } else if (choice.equals("rope")) {
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
                    continue;
                }
                else{
                    System.out.println("Thank you for playing the game!");
                    break;
                }

            } else if (choice.equals("axe")) {
                System.out.println("You selected an axe.");
                enter = sc.nextLine();
                System.out.println();
                Util.slowPrint("You look around the forest, ‘What am I going to do with an axe?!’", slowPrintWaitTime);
                enter = sc.nextLine();
                System.out.println();
                Util.slowPrint("Then something clicks...the trees.", slowPrintWaitTime);
                enter = sc.nextLine();
                System.out.println();
                Util.slowPrint("You walk around the forest, trying to find the sturdiest tree.", slowPrintWaitTime);
                enter = sc.nextLine();
                System.out.println();
                Util.slowPrint("You come across a huge, strong tree, ‘perfect!’", slowPrintWaitTime);
                enter = sc.nextLine();
                System.out.println();
                Util.slowPrint("Please press tab to break the tree", slowPrintWaitTime);
                String tab = sc.nextLine();
                tab = sc.nextLine();
                System.out.println();
                Util.slowPrint("You're still not able to break the tree, hit the tab button again.", slowPrintWaitTime);
                tab = sc.nextLine();
                System.out.println();
                Util.slowPrint("You are finally able to break the tree.", slowPrintWaitTime);
                enter = sc.nextLine();
                System.out.println();
                Util.slowPrint("You use all your strength to pull the tree trunk over to the river.", slowPrintWaitTime);
                enter = sc.nextLine();
                System.out.println();
                Util.slowPrint("Your energy levels are getting lower: 50%, sleep, food, and water gain energy back.", slowPrintWaitTime);
                enter = sc.nextLine();
                Util.slowPrint("You lose energy while doing actions, based on intensity, you will die if you are at 0%", slowPrintWaitTime);
                enter = sc.nextLine();
                System.out.println();
                Util.slowPrint("‘Now I need to push this across the river.’", slowPrintWaitTime);
                enter = sc.nextLine();
                System.out.println();
                Util.slowPrint("You manage to get the trunk across, making the tree a bridge. ", slowPrintWaitTime);
                enter = sc.nextLine();
                System.out.println();
                Util.slowPrint("You carefully use the tree trunk to walk across the river...managing to make it to the other side.", slowPrintWaitTime);
                enter = sc.nextLine();
                System.out.println();
                Util.slowPrint("Your energy levels are at 20%, recommend finding food immediately.", slowPrintWaitTime);
                enter = sc.nextLine();
                System.out.println();

            } else {
                System.out.println("Invalid selection. Please try again");
            }
        } while (!isEndOfGame);
    }

    private static void displayFirstDayMessages() {

        Util.displayMessageWithEnter("You wake up abruptly. You’re confused and disoriented.");
        Util.displayMessageWithEnter("You look around and come to a realization that you're in a forest.");
        Util.displayMessageWithEnter("'What…Where…Am I….?'");
        Util.displayMessageWithEnter("It's eerily silent…but you feel like someone…or something is watching you.");
        Util.displayMessageWithEnter("‘This…This can't be real…I'm dreaming….Right?’");
        Util.displayMessageWithEnter("You look around once again and in the near distance you see an abandoned building.");
        Util.displayMessageWithEnter("You have to cross a river…but there isn't a way to get across.");
        Util.displayMessageWithEnter("'How am I going to get across?'");
        Util.displayMessageWithEnter("The minute you say that…magical items appear in front of you.");
        Util.displayMessageWithEnter("There are 10 pieces of wood, rope, and an axe.");
        Util.displayMessageWithEnter("The mysterious voice speaks up, 'Choose one... and one only.'");
        Util.displayMessageWithEnter("'How..?'");
        Util.displayMessageWithEnter("'The voice speaks up again, “You will only choose one resource to get to the other side…you don't want to stay out in the cold…right?'");
    }
}
