import java.util.Scanner;

public class YesString {
    public static Scanner sc = new Scanner(System.in);

    public static boolean yesString() {
        boolean yesString = false;
        do {
            String choiceTwo;

            Util.displayMessageWithEnter("Select yes or no for the string.");
            choiceTwo = sc.nextLine().toLowerCase();
            if (choiceTwo.equals("yes")) {
                System.out.print("You have selected to take the string.");
                Util.displayMessageWithEnter("You fill up all your inventory spots.");
                Util.displayMessageWithEnter("*Bai* Quickly, get out of this room. There is a shelter room with a table there. Get to the room. I will fend off the Mananggals");
                Util.displayMessageWithEnter("You don't understand what is happening, but you listen to Bai Ze.");
                Util.displayMessageWithEnter("Remember, you have an axe, a matchstick, a few coconuts, a string and a radio.");
                Util.displayMessageWithEnter("You get into the room with shelter. ");
                Util.displayMessageWithEnter("Kill the creatures.");
                int input2 = Util.displayMessageWithNumberTwoInput("Please press 2 to kill the creatures");
                if (input2 != 2) {
                    System.out.println("Invalid input, please retype 2");
                    input2 = Util.displayMessageWithNumberTwoInput("Please type 2 to break the tree");
                    if (input2 != 2) {
                        System.out.println("Invalid input, too many attempts, your game has ended, you have no way to proceed.");
                        return false;
                    }
                } else {
                    Util.displayMessageWithEnter("You have killed the Mananngall, 1/5 dead.");
                    Util.displayMessageWithEnter("*Bai* I will help you, you just need to kill one more.");
                    input2 = Util.displayMessageWithNumberTwoInput("Please press 2 to kill the creatures");
                    if (input2 != 2) {
                        System.out.println("Invalid input, please retype 2");
                        input2 = Util.displayMessageWithNumberTwoInput("Please type 2 to break the tree");
                        if (input2 != 2) {
                            System.out.println("Invalid input, too many attempts, your game has ended, you have no way to proceed.");
                            return false;
                        }
                    } else {
                        Util.displayMessageWithEnter("Mananngall killed, 2/5 dead. Your axe has broken. Use the string to rebuild the axe.");
                        Util.displayMessageWithEnter("*Bai* Don't worry chosen one, I will kill the rest. Run out of the building, there is no time.");
                        Util.displayMessageWithEnter("Remember, you have an axe to defend yourself, a radio, a matchstick, and a few coconuts.");
                        Util.displayMessageWithEnter("You get to the exit. There is another key,");
                        Util.displayMessageWithEnter("You see the key. It says beware of the White Marsh, and there is a ripped part of the note...");
                        Util.displayMessageWithEnter("It says, also known as VARZY. What is VARZY? What is the White Marsh?");
                        String input3 = Util.codeOne("You need to decipher what VARZY means. Please type the code to exit the building.");
                        if (!"BAI ZE".equals(input3)) {
                            System.out.println("Invalid input. Try again.");
                            input3 = Util.codeOne("Please type the code to exit the building. (Hint: Think of each letters opposite, a = z, b = y, and flip it backwards.)");
                            if (!"BAI ZE".equals(input3)) {
                                System.out.println("*Bai* You are not smart enough to exit the building, you will die now.");
                                return false;
                            }
                            Util.displayMessageWithEnter("You have finally exit the building.");
                        }
                    }
                }
                yesString = true;
            } else if (choiceTwo.equals("no")) {
                System.out.print("You have selected not to take the string, you still have one inventory spot left");
                Util.displayMessageWithEnter("You see Bai looking worried.");
                Util.displayMessageWithEnter("*Bai* Quickly, get out of this room. There is a shelter room with a table there. Get to the room. I will fend off the Mananggals");
                Util.displayMessageWithEnter("You don't understand what is happening, but you listen to Bai Ze.");
                Util.displayMessageWithEnter("Remember, you have an axe, a matchstick, a few coconuts, a string and a radio.");
                Util.displayMessageWithEnter("You get into the room with shelter. ");
                Util.displayMessageWithEnter("*Bai* This was not supposed to happen. Your next objective: Kill the creatures.");
                int input4 = Util.displayMessageWithNumberTwoInput("Please press 2 to kill the creatures");
                if (input4 != 2) {
                    System.out.println("Invalid input, please retype 2");
                    input4 = Util.displayMessageWithNumberTwoInput("Please type 2 to kill the Mananggal");
                    if (input4 != 2) {
                        System.out.println("Invalid input, too many attempts, your game has ended, you have no way to proceed.");
                        return false;
                    }
                } else {
                    Util.displayMessageWithEnter("You have killed the Mananngall, 1/5 dead.");
                    Util.displayMessageWithEnter("*Bai* I will help you, you just need to kill one more.");
                    input4 = Util.displayMessageWithNumberTwoInput("Please press 2 to kill the creatures");
                    if (input4 != 2) {
                        System.out.println("Invalid input, please retype 2");
                        input4 = Util.displayMessageWithNumberTwoInput("Please type 2 to break the tree");
                        if (input4 != 2) {
                            System.out.println("Invalid input, too many attempts, your game has ended, you have no way to proceed.");
                            return false;
                        }
                    } else {
                        Util.displayMessageWithEnter("Mananngall killed, 2/5 dead. Your axe has broken. Use the string to rebuild the axe.");
                        Util.displayMessageWithEnter("*Bai* Don't worry chosen one, I will kill the rest. Run out of the building, there is no time.");
                        Util.displayMessageWithEnter("Remember, you have an axe to defend yourself, a radio, a matchstick, and a few coconuts.");
                        Util.displayMessageWithEnter("You get to the exit. There is another key,");
                        Util.displayMessageWithEnter("You see the key. It says beware of the White Marsh, and there is a ripped part of the note...");
                        Util.displayMessageWithEnter("It says, also known as VARZY. What is VARZY? What is the White Marsh?");
                        String input3 = Util.codeOne("You need to decipher what VARZY means. Please type the code to exit the building.").toUpperCase();
                        if (!"BAI ZE".equals(input3)) {
                            System.out.println("Invalid input. Try again.");
                            input3 = Util.codeOne("Please type the code to exit the building. (Hint: Think of each letters opposite, a = z, b = y, and flip it backwards.)").toUpperCase();
                            if (!"BAI ZE".equals(input3)) {
                                System.out.println("*Bai* You are not smart enough to exit the building, you will die now.");
                                return false;
                            }
                            Util.displayMessageWithEnter("You have finally exited the building.");
                            Util.displayMessageWithEnter("You don't understand, how is Bai Ze evil? Why should we beware it?");
                        }
                    }
                }
                yesString = true;
            } else {
                System.out.print("Invalid Input... Please Try Again: ");
                yesString = false;
            }
        }
        while (!yesString);

        return true;
    }
}
