
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        // 3 parallel arrays to simulate a dictionary.
        // translates 15 English phrases into a language of your choice.
        // Hard-code the english and other language arrays. nrLookUps is an array of integer counters that all start with a value of 0.
        // must allow the user to enter an English phrase, and then display its translation (if there is one).
        // and increase that phrase's counter by 1. This must continue until the user types in "X" as the English phrase.
        // must display: most often searched-for phrase, its translation, the number of times that it was searched for (or looked up), for its translation.
        Scanner kbd = new Scanner(System.in);

        String[] engPhr = {"Good morning", "My name is", "How are you",
            "Good bye", "My number is", "I would like some", "Coffee",
            "French fries", "Beer", "Ice-cream", "Tea", "Cheers",
            "May I have the bill", "Please", "Thank you"};

        String[] sloPhr = {"Dobre rano", "Som", "Jak se mas", "Dovidenia",
            "Moje cislo je", "Prosim si", "Kava", "Hranloy", "Pivo", "Zmrzlina",
            "Caj", "Na zdravie", "Mozem mat ucet", "Prosim", "Dakujem"};

        int[] nrLookUps = new int[engPhr.length];

        System.out.println("Translating list of phrases into Slovak");
        System.out.println("---------------------------------------");

        // prints of list of phrases
        for (int i = 0; i < engPhr.length; i++) {
            System.out.println(engPhr[i] + " - " + sloPhr[i]);
        }

        System.out.print("\n");
        // user input
        System.out.print("Enter an english phrase (or x to stop): ");
        String userSearch = kbd.nextLine().trim();

        // loop for user input and search.
        while (!userSearch.equalsIgnoreCase("x")) {
            // has to be inside here so to make it false again when new user input is entered.
            boolean found = false;
            int index = 0;

            // checks if user input is a match
            while ((index < engPhr.length) && (!found)) {
                if (engPhr[index].equalsIgnoreCase(userSearch)) {
                    nrLookUps[index]++;
                    found = true;
                } else {
                    index++;
                }
            }

            // prints out message for the results from the check.
            if (found) {
                System.out.println(
                        "Translation: " + userSearch + " is " + sloPhr[index]);
            } else {
                System.out.println("Phrase not found.");
            }

            System.out.print("Enter an english phrase (or x to stop): ");
            userSearch = kbd.nextLine().trim();
        }

        // finds the most searched phrase.
        int maxIndex = 0;

        for (int i = 1; i < nrLookUps.length; i++) {
            if (nrLookUps[maxIndex] < nrLookUps[i]) {
                maxIndex = i; // index you are comparing to.  
            }
        }
        
        // prints message for most searched, translation & number of times.
        System.out.println(
                "The most often searched for phrase is " + engPhr[maxIndex] + " it's translation is " + sloPhr[maxIndex]);
        System.out.println(
                "The number of times it was searched: " + nrLookUps[maxIndex]);

    }// end of main

}// end of class
