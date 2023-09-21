import java.util.Scanner;
public class HongTipCalculator {
    public static void main(String[] args){
        int i = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome Summoner!");
        System.out.print("How many people are in your group: ");
        int numPeople = scan.nextInt();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();
        System.out.print("Enter a cost in dollars and cents (-1 to end): ");
        double bill = scan.nextDouble();
        System.out.print("Enter the item: ");
        String item = scan.nextLine();
        while (bill != -1){
            System.out.print("Enter a cost in dollars and cents (-1 to end): ");
            bill = bill + scan.nextDouble();
            System.out.print("Enter the item: ");
            item = item.add(scan.nextLine());
        }

        double total = bill * tipPercentage / 100 + bill;
        double tip = bill * tipPercentage / 100;
        System.out.println("-----------------------------");
        System.out.println("Total bill before tip: $" + bill);
        System.out.println("Total percentage: " + tipPercentage + "%");
        System.out.println("Total tip: $" + tip);
        System.out.println("Total bill with tip: $" + total);
        System.out.println("Per person cost before tip: $" + (bill / numPeople));
        System.out.println("Tip per person: $" + (tip / numPeople));
        System.out.println("Total cost per person: $" + (total / numPeople));
        System.out.println("-----------------------------");
        System.out.println("Items ordered: ");

    }
}
