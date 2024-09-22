import java.util.Scanner;

public class SecondDay {

    public static void playSecondDay() {

        Scanner sc = new Scanner(System.in);
        String choiceThree;
        choiceThree = sc.nextLine().toLowerCase();
        Util.displayMessageWithEnter("*Mysterious Voice* You have survived the night, Hmm... Suprising");
        Util.displayMessageWithEnter("*Mysterious Voice* Now you must escape, 'Chosen One'");
        Util.displayMessageWithEnter("*Mysterious Voice* The portal is deep in the forest, beware Chosen One, no one is safe, not even you");
        Util.displayMessageWithEnter("As you walk, you finally see the portal, you look around to see Bai Ze");
        Util.displayMessageWithEnter("*You* 'Bai Ze you are ALIVE!!!'");
        Util.displayMessageWithEnter("*Bai* 'Yes, I am, I see that you are going to leave'");
        Util.displayMessageWithEnter("I ask you of one favor");
        choiceThree = Util.codeThree("You remember to 'Beware the White Marsh A.K.A Bai Ze', You have to choose yes or no to accept favor:").toLowerCase();
        if (choiceThree.equals("yes")) {
            Util.displayMessageWithEnter("*You* 'No, Bai Ze, I know you are the White Marsh'");
            Util.displayMessageWithEnter("Bai Ze turns into a white ox, with a dragon head and says, 'You might've found out but, you shall pay'");
            Util.displayMessageWithEnter("Bai Ze comes at you at once and so do many demons");
            Util.displayMessageWithEnter("You get swallowed by Bai Ze and die");
            Util.displayMessageWithEnter("You become John Benzer, and become part of the Abysmal Chasm");
            Util.displayMessageWithEnter("You are stuck as John Benzer");
            Util.displayMessageWithEnter("You have to wait for the next Chosen One to free you");
        } else if (choiceThree.equals("no")) {

            Util.displayMessageWithEnter("*You* Bai Ze, I am yours to command, I am in your debt for saving me");
            Util.displayMessageWithEnter("*Bai* From time to time, you hear a voice, his name is John Benzer, he has held us hostage, you need to free us by killing him");
            Util.displayMessageWithEnter("*You* 'Yes, Bai Ze, but How?'");
            Util.displayMessageWithEnter("*Bai* 'Call up to him, ask for a challenge'");
            Util.displayMessageWithEnter("*Bai* 'Yes, I am, I see that you are going to leave'");
            Util.displayMessageWithEnter("I ask you of one favor");
            Util.displayMessageWithEnter("*You* Bai Ze, I am yours to command, I am in your debt for saving me");
            Util.displayMessageWithEnter("*Bai* From time to time, you hear a voice, his name is John Benzer, he has held us hostage, you need to free us by killing him");
            Util.displayMessageWithEnter("*You* 'Yes, Bai Ze, but How?'");
            Util.displayMessageWithEnter("*Bai* 'Call up to him, ask for a challenge'");
            Util.displayMessageWithEnter("*You* 'JOHN BENZER, I CHALLENGE YOU THEE ");
            Util.displayMessageWithEnter("*Mysterious Voice* FOOLISH CHILD, I AM THEE JOHN BENZER, YOU ASK FOR MY WRATH");
            Util.displayMessageWithEnter("John Benzer blocks the portal with a wall, you pull out your axe and coconuts");
            Util.displayMessageWithEnter("You eat the coconut so your energy levels are at max, and then you use the shell to create armor for your self");
            Util.displayMessageWithEnter("You use the left over shells, which you break to make sharp shards");
            Util.displayMessageWithEnter("John Benzer laughs and pulls out a Wisteria Poison gun, a special type of potion made by Baba Yaga");
            Util.displayMessageWithEnter("Before he shoots you with the poison, you throw coconut shards into the muzzle, which blocks the flow of the poisonous bullet");
            Util.displayMessageWithEnter("The impact blows the gun up, spilling poison on John Benzer, killing him and the wall in front of the portal falls down");
            Util.displayMessageWithEnter("As you are about to walk into the portal, another portal opens behind you, you look closely and see your home, the portal in front of you shows a mysterious room");
            Util.displayMessageWithEnter("As you walk to the other portal which shows your home, Bai Ze walks in front of you in his full form, a Horned White Ox, with a dragon body and 9 eyes");
            Util.displayMessageWithEnter("*You* Bai Ze, You're Welcome, now I am on my way home");
            Util.displayMessageWithEnter("*Bai* 'Stupid Mortal, you're in my world, John Benzer was an illusion, the source of my power ");
            Util.displayMessageWithEnter("'Since you killed him, I need a new source, a fresh source, my new CHOSEN ONE'");
            Util.displayMessageWithEnter("You look at Bai Ze in astonishment, you know understand the note, as you try attacking Bai Ze he throws you in the portal");
            Util.displayMessageWithEnter("You get stuck in the mysterious place, iron cuffs chain you, and Bai Ze laughs");
            Util.displayMessageWithEnter("*Bai* My name is Bai Ze, the White Marsh, welcome to the illusional world of Varzy, a city in France ");
            Util.displayMessageWithEnter("The other White Marshes have died, We the White Marshes develop eyes as we grow, I was a baby...");
            Util.displayMessageWithEnter("All the White Marshes loved warding off the evil spirits and going up to the Himalayas to celebrate with the Gods");
            Util.displayMessageWithEnter("When the White Marshes asked to go the higher levels, rather than the slums we were denied. ");
            Util.displayMessageWithEnter("The Gods tricked us into the portal, but I was a baby and missed my way, the portal killed everyone except for me");
            Util.displayMessageWithEnter("I need 9 John Benzer's to restore my eyes");
            Util.displayMessageWithEnter("I have 8, you are my last one, each one makes me stronger so I can cross the Chasm and destroy the IRL world and our world and cause Chaos to the Gods");
            Util.displayMessageWithEnter("I WILL MAKE IT MY WORLD!!!!");

        } else {
            Util.displayMessageWithEnter("You can't follow simple instructions");
            Util.displayMessageWithEnter("Get ready to DIE!!!");
            Util.displayMessageWithEnter("Something attacks you and you die");
             }
         }
}
