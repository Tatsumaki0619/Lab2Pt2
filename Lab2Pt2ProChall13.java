
/**
 * This is the third challenge for Lab2Part2. The output is the tax, the tips
 * and the total amount the user will pay for the meal based on his/her input.
 *
 * @author Qianyi Li
 * @version 1.1
 * @since 2/20/2025
 */
import java.util.Scanner;
public class Lab2Pt2ProChall13
{
    public static void main(String []args){
        final double TIP_RATE;
        final double TAX_RATE;
        TIP_RATE = 0.2;
        TAX_RATE = 0.0675;
        double tax, tip, sumMoney, money;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter meal amount: $");
        money = keyboard.nextDouble();
        tax = TAX_RATE * money;
        tip = TIP_RATE * money;
        sumMoney = tax + tip + money;
        
        System.out.printf("The tax is: $%.2f" + '\n' + 
        "The tip is: $%.2f" + '\n' + 
        "The meal cost with tax and tip is: $%.2f\n" , tax, tip, sumMoney);
    }
}
