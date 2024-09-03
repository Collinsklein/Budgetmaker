package orderBudgeter2;

public class OrderBudgeter2 {
    public static void main(String[] args) {
        // Step 1, I need to declare all the Variables for product details
        String productName = "Rice"; //rice is a word so I will use String
        int quantity = 20;  // I am using int for any whole numbers
        double pricePerUnit = 5.0; // I could use float f for price but because
        // I wouldn't want any decimal errors in case of any large decimal amounts
        double distance = 10.0;

        // To Calculate the shipping fee based on the distance .....i will use double and
        //if condition and else if because I have many values for distance
        double shippingFee;
        if (distance <= 5) { // whenever distance is less than or equal to 5
            shippingFee = 2.0;
        } else if (distance <= 15) {  //else if the distance is less or equal to 15 then;
            shippingFee = 5.0;
        } else if (distance <= 25) {
            shippingFee = 10.0;
        } else if (distance <= 50) {
            shippingFee = 15.0;
        } else {
            shippingFee = 20.0;
        }

        // last Step is to Calculate the total cost
        double totalCost = (quantity * pricePerUnit) + shippingFee;// this is the ideology part for me
        // gives me the idea of what's supposed to be done

        // to Print or to display or to output the results I need sout...
        System.out.println("Product      Qty      Price       Miles      Total");
        System.out.println("----         ---      -----      -----      -----");
        System.out.printf("%-12s %-8d %-10.1f %-10.1f %.1f\n", productName, quantity, pricePerUnit, distance, totalCost);
    }
}
