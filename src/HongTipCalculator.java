package src;

import java.util.Scanner;
public class HongTipCalculator {
    public static void main(String[] args){
        boolean clear = true;
        Scanner scan = new Scanner(System.in);
        //allows repeat
        while (clear) {
            // Basic setup for calculations
            System.out.println("Welcome customer!");
            System.out.print("How many people are in your group: ");
            int numPeople = scan.nextInt();
            System.out.print("What's the tip percentage? (0-100): ");
            int tipPercentage = scan.nextInt();
            double bill = 0;
            String item = "";
            double num = 0;
            //inputs of all item and cost
            while (num != -1.0) {
                System.out.print("Enter a cost in dollars and cents (-1 to end): ");
                num = scan.nextDouble();
                scan.nextLine();
                bill += num;

                if (num != -1) {
                    System.out.print("Enter the item: ");
                    item = (item + "\n" + (scan.nextLine()));
                }
            }
            bill++;
            double tip = Math.round(bill * tipPercentage) / 100.00;
            double total = tip + bill;
            //prints receipt
            System.out.println("-----------------------------");
            System.out.println("Total bill before tip: $" + String.format("%.2f",bill));
            System.out.println("Total percentage: " + tipPercentage + "%");
            System.out.println("Total tip: $" + String.format("%.2f", tip));
            System.out.println("Total bill with tip: $" + String.format("%.2f", total));
            System.out.println("Per person cost before tip: $" + String.format("%.2f", (bill / numPeople)));
            System.out.println("Tip per person: $" + String.format("%.2f", (tip / numPeople)));
            System.out.println("Total cost per person: $" + String.format("%.2f", (total / numPeople)));
            System.out.println("-----------------------------");
            System.out.println("Items ordered: ");
            System.out.print(item);
            System.out.println();
            //special condition
            if (total >= 250) {
                System.out.println("You get a free plane ticket Narnia");
                System.out.println("  | | ");
                System.out.println(" [___] ");
            }
            //determines if code restarts
            System.out.print("Would you like to clear and restart? ");
            String restart = scan.nextLine();

            if (restart.equals("no")){
                clear = false;
                return;
            }
        }
        scan.close();
        /*
        I learned how to round from here
        https://www.educative.io/answers/how-to-use-the-java-mathround-method
        I learned string format here
        https://www.geeksforgeeks.org/java-string-format-method-with-examples/
         */
    }
}
