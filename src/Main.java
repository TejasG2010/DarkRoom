import java.util.Scanner;

public class Main {

    public static void mainOne(String[] args) {

    }

    public static void main(String[] args) {

        //Introductions
        Introduction.startIntroduction();

        //First Day
        boolean isEndOfGame = FirstDay.playFirstDay();

        //First Night
        if (!isEndOfGame) {
            FirstNight.playFirstNight();
        }
        else {
            System.out.print("Thanks for playing, bye!");
        }
    }
}