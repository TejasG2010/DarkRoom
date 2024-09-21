import java.util.Scanner;

public class FirstDayOne {

    public static void playFirstDay() {
        Scanner sc = new Scanner(System.in);
        long slowPrintWaitTime  = 1;
        long dotPrintTime = 1;

        Util.displayMessageWithEnter("You wake up abruptly. You’re confused and disoriented.");
        String enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("'What?...Where?...Am I?...'", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();

        Util.displayMessageWithEnter("You look around and come to a realization that you're in a forest.");

        Util.slowPrint("It's eerily silent…but you feel like someone…or something is watching you", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("'This…This can't be real…I'm dreaming….Right?'", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("*You look around once again and in the near distance you see an abandoned building.*", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("You have to cross a river…but there isn't a way to get across.", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("'How am I going to get across?'", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("The minute you say that…magical items appear in front of you", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("There are 10 pieces of wood, rope, and an axe", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("'Am I…supposed to build a bridge..?'", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("*The mysterious voice speaks up*, 'Choose one…and one only'", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint(": 'How..?', you say", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("*The voice speaks up again*, " +
                "'You will only choose one resource to get to the other side…" +
                "you don't want to stay out in the cold…right?'", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        Util.slowPrint("*The voice says*, choose one you are running out of time", slowPrintWaitTime);
        enter = sc.nextLine();
        System.out.println();
        String choice;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // If loop until the user makes a valid choice
        boolean isEndOfGame = false;
        do {
            System.out.print("Select an item (wood, rope, axe): ");
            choice = sc.nextLine().toLowerCase();

            if (choice.equals("wood")) {
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
                choice = sc.nextLine().toLowerCase();
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
                        continue;
                    }
                    else{
                        System.out.println("Thank you for playing the game!");
                        break;
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
                        continue;
                    }
                    else{
                        System.out.println("Thank you for playing the game!");
                        break;
                    }
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
}
