
/**
 * This is the last challenge for Lab2pt2. the out put is given by using dialog with paid for shares,
 * commission and total cost.
 *
 * @author Qianyi Li
 * @version 1.0
 * @since 2/15/2025
 */
import javax.swing.JOptionPane;
public class Lab2Pt2ProCHAll15
{
    public static void main(String []args){
        final double COMMISION_FEE;
        COMMISION_FEE = 0.02;
        double pricePerShare, shareFee, commisionFee, totalFee;
        int number;
        String inputValue;
        
        inputValue = JOptionPane.showInputDialog("What is the" + " price per share?");
        pricePerShare = Double.parseDouble(inputValue);
        
        inputValue = JOptionPane.showInputDialog("What is the" + " amount of share?");
        number = Integer.parseInt(inputValue); //the first "Int" written in full "Integer"
        
        shareFee = number * pricePerShare;
        commisionFee = shareFee * COMMISION_FEE;
        totalFee = shareFee + commisionFee;
        shareFee = Math.round(shareFee * 100.0)/100.0;
        commisionFee = Math.round(commisionFee * 100.0)/100.0;
        totalFee = Math.round(totalFee * 100.0)/100.0;
        
        JOptionPane.showMessageDialog(null, "Total cost of shares are: $" + shareFee + '\n' + "Commission cost is: $" + commisionFee + '\n' + "Total Cost is: $" + totalFee);
        System.exit(0);
    }
}
