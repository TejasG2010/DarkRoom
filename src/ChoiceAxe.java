import java.util.Scanner;

public class ChoiceAxe {
    public static boolean playChoiceAxe() {

        Scanner sc = new Scanner(System.in);
        long slowPrintWaitTime = 1;
        long dotPrintTime = 1;

        String enter = "";
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
        if (enter == null || enter.trim().equals("")) {
            return true;
        } else {
            System.out.println("Thank you for playing the game!");
            return false;
        }
    }
}

