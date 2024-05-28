import java.util.Scanner;
public class threepointfour {
    // Chapter 
        public static void main(String[] args) {

        // create an instance of the scanner for user input
        Scanner keyboard = new Scanner(System.in);

        // ask salary from user
        System.out.print("Enter your age in years ");
        double ageInYears = keyboard.nextDouble();
        keyboard.nextLine();

        // Age Group    Years
        // Infant       <1 -- Last
        // Child        1-12
        // Teen         13-17
        // Adult        18-64
        // Senior       65+ -- First
        if (ageInYears >= 65) {
            System.out.println("Group: Senior " + ageInYears);
        }
        else if (ageInYears >= 18) {
            System.out.println("Group: Adult " + ageInYears);
        }
        else if (ageInYears >= 13) {
            System.out.println("Group: Teen " + ageInYears);
        }
        else if (ageInYears >= 1) {
            System.out.println("Group: Child " + ageInYears);
        }
        else if (ageInYears == 0.0) {
            System.out.println("You weren't born yet");
        }
        else {
            System.out.println("Group: Infant " + ageInYears);
        }

        keyboard.close();
    }

    
}
