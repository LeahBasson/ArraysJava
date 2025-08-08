
import java.util.Scanner;


public class Program4 {

    public static void main(String[] args) {
        // 3 parallel arrays to simulate a dictionary.
        // translates 15 English phrases into a language of your choice.
        // Hard-code the english and other language arrays. nrLookUps is an array of integer counters that all start with a value of 0.
        // must allow the user to enter an English phrase, and then display its translation (if there is one).
        // and increase that phrase's counter by 1. This must continue until the user types in "X" as the English phrase.
        // must display: most often searched-for phrase, its translation, the number of times that it was searched for (or looked up), for its translation.

        String[] engPhr = {"Good morning", "My name is", "How are you",
            "Good bye", "My number is", "I would like some", "Coffee",
            "French fries", "Beer", "Ice-cream", "Tea", "Cheers",
            "May I have the bill", "Please", "Thank you"};

        String[] sloPhr = {"Dobre rano", "Som", "Jak se mas", "Dovidenia",
            "Moje cislo je", "Prosim si", "Kava", "Hranloy", "Pivo", "Zmrzlina",
            "Caj", "Na zdravie", "Mozem mat ucet", "Prosim", "Dakujem"};

        int[] nrLookUps = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        System.out.println("Translating list of phrases into Slovak");
        System.out.println("---------------------------------------");
        System.out.println("English Phrases: ");
        
        for (int i = 0; i < engPhr.length; i++){
            System.out.println(engPhr[i]);
        }
        
        Scanner kbd = new Scanner(System.in);
        
        System.out.print("\nEnter an english phrase: ");
        String userSearch = kbd.next();
        
        boolean found = false;
        int indexFound = 0;
        
        while(!userSearch.equals("x")){ 
            while((indexFound < engPhr.length) && (!found)){
                if (engPhr[indexFound].equals(userSearch)){
                    found = true;
                } else {
                    indexFound ++;
                }
            }
            
            System.out.print("Enter an english phrase: ");
            userSearch = kbd.next();
        }
        
       

    }// end of main

}// end of class
