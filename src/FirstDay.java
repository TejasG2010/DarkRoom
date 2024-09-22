import java.util.Scanner;

public class FirstDay {

    public static boolean playFirstDay() {

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
                    isEndOfGame = true;
                    break;
                }
            } else if (choice.equals("rope")) {
               boolean continueGame = ChoiceRope.playChoiceRope();
               if(continueGame) {
                   continue;
               }
               else {
                   isEndOfGame = true;
                   break;
               }
            } else if (choice.equals("axe")) {

                boolean continueGame = ChoiceAxe.playChoiceAxe();
                if(continueGame) {
                    isEndOfGame = false;
                    break;
                }
                else {
                    isEndOfGame = true;
                    break;
                }
            } else {
                System.out.println("Invalid selection. Please try again");
            }
        } while (!isEndOfGame);
        return isEndOfGame;
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
        Util.displayMessageWithEnter("'How...?'");
        Util.displayMessageWithEnter("'The voice speaks up again, “You will only choose one resource to get to the other side…you don't want to stay out in the cold…right?'");
    }
}
