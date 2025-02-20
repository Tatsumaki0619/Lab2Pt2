
/**
 * This is the last challenge for Lab2pt2. the out put is given by using dialog with the cost for shares,
 * commission and total cost. Comments are notes and an example of Math.round(round the answer in two decimals)
 *
 * @author Qianyi Li
 * @version 1.1
 * @since 2/15/2025
 */
import javax.swing.JOptionPane;
public class Lab2Pt2ProCHAll15
{
    public static void main(String []args){
        final double COMMISION_FEE_RATE;
        COMMISION_FEE_RATE = 0.02;
        double pricePerShare, shareFee, commisionFee, totalFee;
        int number;
        String inputValue; // receive temporary InputDialog contents
        
        inputValue = JOptionPane.showInputDialog("What is the" + " amount of share?");
        number = Integer.parseInt(inputValue); //the first "Int" written in full "Integer"
        
        inputValue = JOptionPane.showInputDialog("What is the" + " price per share?");
        pricePerShare = Double.parseDouble(inputValue);// the first "Double" should written in full (see INT below)
        
        shareFee = number * pricePerShare;
        commisionFee = shareFee * COMMISION_FEE_RATE;
        totalFee = shareFee + commisionFee;
        
        // Math.round example
        /**shareFee = Math.round(shareFee * 100.0)/100.0; // Math.round with division can be rounded to two decimal
        commisionFee = Math.round(commisionFee * 100.0)/100.0;
        totalFee = Math.round(totalFee * 100.0)/100.0;*/
        
        JOptionPane.showMessageDialog(null, "Total cost of shares are: " + String.format("$%,.2f",shareFee) + '\n' 
        + "Commission cost is: " + String.format("$%,.2f",commisionFee) + '\n'
        + "Total Cost is: " + String.format("$%,.2f",totalFee));// "," separator 3 numbers in a goup
        System.exit(0);// System.exit(0);
    }
}
