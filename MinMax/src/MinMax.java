
public class MinMax {

    public static void main(String[] args) {
        // array of numbers
        int[] numbers = {5, 6, 1, 3, 9, 4};

        int minNum = 0;
        int maxNum = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[maxNum]) {
                maxNum = i;
                System.out.println(numbers[maxNum]);
            }
        }

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < numbers[minNum]){
                minNum = i;
            }
        }

        System.out.println("Max number: " + numbers[maxNum]);
        System.out.println("Min number: " + numbers[minNum]);

    } // end of main

} // end of class
