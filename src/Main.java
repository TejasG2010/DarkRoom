import java.util.Scanner;

public class Main {

    public static void mainOne(String[] args) {
        YesString.yesString();
    }

    public static void main(String[] args) {

        //Introductions
        Introduction.startIntroduction();

        //First Day
        boolean isEndOfGame = FirstDay.playFirstDay();

        //First Night
        if (!isEndOfGame) {
            isEndOfGame = FirstNight.playFirstNight();
        }

        if(!isEndOfGame) {
            SecondDay.playSecondDay();
        }

        System.out.print("Thanks for playing, bye!");
    }
}