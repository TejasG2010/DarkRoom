public class Introduction {
    public static void startIntroduction() {
        Util.displayMessageWithEnter("In order to start, please press enter, please also press enter after every dialogue.");
        Util.displayDotsWithEnter("...");
        Util.displayMessageWithEnter("You see a dark, blurry figure in your mind.");
        Util.displayMessageWithEnter("Unknown: You have finally arrived... I have been waiting for you...");
        Util.displayMessageWithEnter("I seem to have forgotten your name, your name is...?");
        String name = Util.displayMessageWithStringInput("Enter name: ");
        Util.displayMessageWithEnter("Welcome to The Abysmal Chasm, " + name);
        Util.displayMessageWithEnter("You are fortunate to be the “Chosen One”...");
        Util.displayMessageWithEnter("Soon you will understand..");
        Util.displayMessageWithEnter("Sooner than expected...");

    }
}
