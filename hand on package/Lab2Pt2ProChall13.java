
/**
 * This is the third challenge for Lab2Part2. The output is the tax, the tips
 * and the total amount the user will pay for the meal based on his/her input.
 *
 * @author Qianyi Li
 * @version 1.0
 * @since 2/13/2025
 */
import java.util.Scanner;
public class Lab2Pt2ProChall13
{
    public static void main(String []args){
        final double TIP_RATE;
        final double TAX_RATE;
        double tax, tip;
        double roundTax, roundTip;
        double sumMoney;
        double money;
        Scanner keyboard = new Scanner(System.in);
        TIP_RATE = 0.2;
        TAX_RATE = 0.0675;
        
        System.out.print("Enter meal amount: $");
        money = keyboard.nextDouble();
        tax = TAX_RATE * money;
        tip = TIP_RATE * money;
        roundTax = Math.round( tax * 100.0) / 100.0;
        roundTip = Math.round( tip * 100.0) / 100.0;
        sumMoney = roundTax + roundTip + money;
        
        System.out.println("\nThe tax is $" + roundTax);
        System.out.println("The tip is $" + roundTip);
        System.out.println("The meal cost with tax and tip is " + sumMoney);
    }
}
