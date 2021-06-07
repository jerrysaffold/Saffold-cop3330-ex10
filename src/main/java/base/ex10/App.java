package base.ex10;
/*
 *  UCF COP3330 Summer 2021 Assignment 10 Solution
 *  Copyright 2021 Jerry Saffold
 */

/*
Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items.
Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%.
Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52
Constraints
Keep the input, processing, and output parts of your program separate. Collect the input,
then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        double price1 = input.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        double quantity1 = input.nextInt();
        System.out.print("Enter the price of item 2: ");
        double price2 = input.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        double quantity2 = input.nextInt();
        System.out.print("Enter the price of item 3: ");
        double price3 = input.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        double quantity3 = input.nextInt();

        double tax_rate = 0.055;
        double item1_total = price1 * quantity1;
        double item2_total = price2 * quantity2;
        double item3_total = price3 * quantity3;
        double subtotal = item1_total + item2_total + item3_total;
        double tax_amount = subtotal * tax_rate;
        double final_total = subtotal + tax_amount;

        System.out.printf("Subtotal: %.2f\nTax: %.2f\nTotal: %.2f", subtotal, tax_amount, final_total);
    }
}
