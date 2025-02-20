
/**
 * This is the first challenge in Lab2part2. The output is the full name the user inputs
 * and his/her initial name.
 *
 * @author Qianyi Li
 * @version 1.0
 * @since 2/23/2025
 */
import java.util.Scanner;
public class Lab2Pt2ProChall2
{
    public static void main(String[] args){
        String firstName,middleName,lastName;
        char firstStart, middleStart, lastStart;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        firstName = keyboard.nextLine();
        System.out.print("Enter your middle name: ");
        middleName = keyboard.nextLine();
        System.out.print("Enter your last name: ");
        lastName = keyboard.nextLine();
        
        firstStart = firstName.charAt(0);
        middleStart = middleName.charAt(0);
        lastStart = lastName.charAt(0);
        
        System.out.println();
        System.out.println("My name is: " + firstName + " " + middleName + " " + lastName);
        System.out.println("My initials are: "+ firstStart + middleStart + lastStart);
    }
}
