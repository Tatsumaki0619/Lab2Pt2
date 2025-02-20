
/**
 * This is the second challenge in Lab2part2. The output is the user's favourite city, the number of characters in the name,
 * the name in upper and lower cases and the first letter the city's name.
 *
 * @author Qianyi Li
 * @version 1.0
 * @since 2/23/2025
 */
import java.util.Scanner;
public class Lab2Pt2ProChall12{
     public static void main(String []args){
         String cityName, cityUpper, cityLower;
         char cityStart;
         int cityLength;
         Scanner keyboard = new Scanner(System.in);
         
         System.out.print(" Enter the city name:");
         cityName = keyboard.nextLine();
         
         cityLength = cityName.length();
         System.out.println('\n' + "The city entered has: " + cityLength + " chars");
         
         cityUpper = cityName.toUpperCase();
         cityLower = cityName.toLowerCase();
         System.out.print("In upper case: " + cityUpper + '\n');
         System.out.print("In lower case: " + cityLower + '\n');
         
         cityStart = cityName.charAt(0);
         System.out.println("First character: " + cityStart);
     }
}
