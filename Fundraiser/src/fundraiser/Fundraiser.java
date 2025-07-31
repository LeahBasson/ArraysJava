package fundraiser;

public class Fundraiser {

    public static void main(String[] args) {
        // store the surnames of fundraisers.
        // amounts of funds that they raised.

        String[] surnames = {"Malan", "Jones", "West", "Nadile", "King", "Bester", "Peters", "Adams"};
        double[] amounts = {50000, 80000, 45000, 42000, 61000, 30000, 49000, 25000};
        double sum = 0;

        System.out.println("PERSONS WHO RAISED > R30000");
        System.out.println("---------------------------\n");
        System.out.println("SURNAME" + "\t\tAMOUNT");
        System.out.println("-------" + "\t\t------");

        for (int i = 0; i < surnames.length; i++) {
            // display amounts more than 30 000.
            if (amounts[i] > 30000) {
                System.out.println(surnames[i] + "\t\t" + amounts[i]);
            }
            
            //total calculation
            sum += amounts[i];
        }
        System.out.println("\nThe total amount raised is R" + sum);

    } //end of main

} //end of class
