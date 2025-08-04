
import java.util.Scanner;

public class ShopApplication {

    public static void main(String[] args) {
        // Create an array of item names and prices.
        // Display every item name and its corresponding price.
        // Print the average price of all the items.
        // Find and display the price of a specific item.

        String[] item_names = {"Bread", "Milk", "Butter", "Chips", "Honey", "Soap", "Towel", "Carrots", "Beans", "Samp", "Dress", "Pants", "Shoes", "Socks"};
        double[] item_prices = {15.50, 12.00, 56.00, 20.00, 45.00, 7.00, 75.00, 8.00, 5.00, 12.00, 200.00, 150.00, 400.00, 25.00};

        System.out.println("Items in stock with prices");
        System.out.println("--------------------------");

        double sum = 0, avg;

        for (int i = 0; i < item_names.length; i++) {
            // Display all items
            System.out.println(item_names[i] + " - R" + item_prices[i]);

            // sum calculation
            sum += item_prices[i];

        }

        avg = sum / item_prices.length;
        System.out.printf("The average price of all the items is R" + "%.1f%n", avg);

        Scanner scn = new Scanner(System.in);

        System.out.println("\nItem Look-up");
        System.out.println("What item are you looking for? ");
        String item_lookup = scn.next();
        
        boolean found = false; // we dont know if the item is there so we set it to.
        
        for(int i = 0; i < item_names.length; i++){
            if(item_names[i].equalsIgnoreCase(item_lookup)){
                System.out.println("The price of item " + item_names[i] + " is R" + item_prices[i]);
                found = true; // if we find it we set it to true.
                break;
            }
        }
        
        if (!found){
            // then if not true this displays.
            System.out.println("Item " + item_lookup + " is not stocked in the shop.");
        }
        
    } // end of main

} // end of class
