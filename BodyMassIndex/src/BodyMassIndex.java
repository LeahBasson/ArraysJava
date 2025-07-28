
public class BodyMassIndex {

    public static void main(String[] args) {
        // Create and initialize an array with 10 double values. = height (m)
        // Create and initialize another array with 10 double values. = weight (kg0)
        // Display the heights and the weights for every person. (heights [0] & weights [0] is for the same person)
        // Calculate and display the BMI for every height and weight. 

        double[] height = {1.75, 1.57, 1.50, 1.80, 1.60, 1.73, 1.67, 1.70, 1.53, 1.56};
        double[] weight = {70, 65, 78, 80, 90, 72, 66, 78, 85, 63};

        double bmi;

        for (int i = 0; i < height.length; i++) {
            bmi = weight[i] / Math.pow(height[i], 2);

            System.out.println("person " + (i + 1));
            System.out.println("height(m): " + height[i]);
            System.out.println("weight(kg): " + weight[i]);
            System.out.println("bmi: " + bmi);
            System.out.print("result: ");

            if (bmi <= 18.4) {
                System.out.println("Underweight\n");
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                System.out.println("Normal\n");
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                System.out.println("Overweight\n");
            } else if (bmi >= 40.0) {
                System.out.println("Obese\n");
            }

        }

    }//end of main

}//end of class
