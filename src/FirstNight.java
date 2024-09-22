import java.util.Scanner;

public class FirstNight {
    public static Scanner sc = new Scanner(System.in);

    public static boolean playFirstNight() {
        String choiceTwo;
        Util.displayMessageWithEnter("Sunset Happens, and eerie sounds are coming from the forest");
        Util.displayMessageWithEnter("You look up to see the abandoned building, in the forest.");
        Util.displayMessageWithEnter("As you walk in front of the building, the door is locked");
        Util.displayMessageWithEnter("There is a keypad on the building");
        Util.displayMessageWithEnter("It Says, 'Note: Where are you (Take a random Guess)");
        String input = Util.codeOne("Please type the code to enter the abandoned shelter.");
        if (!"W213".equals(input)) {
            System.out.println("Invalid input, please retype..");
            input = Util.codeOne("Please type the code to enter the building (hint: 4 digits, one digit is an Uppercase letter, others are numbers, it is also where you are... IRL)");
            if (!"W213".equals(input)) {
                System.out.println("You are not smart enough to enter the building, you will die now.");
                return false;
            }
        }
        Util.displayMessageWithEnter("*Mysterious Voice* You are in the Abysmal Chasm");
        Util.displayMessageWithEnter("*Mysterious Voice* You have to escape, sadly I can't help you");
        Util.displayMessageWithEnter("*Mysterious Voice* The Abysmal Chasm connects the real world to this  world");
        Util.displayMessageWithEnter("*Mysterious Voice*, My friend have fun, and I wish you the best of luck to survive");
        Util.displayMessageWithEnter("Energy Levels dropping to 20%");
        Util.displayMessageWithEnter("'What is that voice', you say");
        Util.displayMessageWithEnter("I am Bai Ze, You can call me Bai");
        Util.displayMessageWithEnter("Bai Ze is a white dog-looking creature");
        Util.displayMessageWithEnter("*Bai* I will monitor your progress and your energy levels");
        Util.displayMessageWithEnter("*Bai* I recommend for you to find food");
        Util.displayMessageWithEnter("As you look down, you see a chest labeled resources");
        Util.displayMessageWithEnter("You try opening the chest, but you see a lock");
        Util.displayMessageWithEnter("There is a 'Note: YAMAHABLSSCMM (Case Sensitive), there are 2 words one with 7 words while another with 5'");
        String inputTwo = Util.codeTwo("Unscramble the word to access the cage...").toLowerCase();
        if (!"ABYSMAL CHASM".equals(inputTwo)) {
            inputTwo = Util.codeTwo("Invalid input, please retype the code..");
            if (!"ABYSMAL CHASM".equals(inputTwo)) {
                Util.displayMessageWithEnter("*Bai* You are not smart enough to open the chest, you will die now.");
                return false;
            }
        }
        else {
            Util.displayMessageWithEnter("*Bai* You have opened the chest, chosen one..");
            Util.displayMessageWithEnter("*Bai* You found a matchstick, a radio, and 10 coconuts.");
            String eat = Util.displayMessageWithStringInput("Type to eat to eat.");
            eat = sc.nextLine();
            Util.displayMessageWithEnter("You have eaten one coconut, your energy levels have increased to 60%");
            Util.displayMessageWithEnter("*Bai* Your inventory consists of an Axe, a matchstick, a radio and a few coconuts, you have only one more spot left");
            Util.displayMessageWithEnter("*Bai* We have provided you a bed to sleep with. Be careful chosen one, there is something wrong... I feel it...");
            Util.displayDotsWithEnter("...");
            Util.displayMessageWithEnter("You hear rustling. You're tired. You had a good sleep, and your energy levels have increased to 90%.");
            Util.displayMessageWithEnter("*Bai* Hurry. You are running out of time. It is here. I can sense it. There is string under your bed, you can take it or leave it.");
        }
        return true;
    }
}
