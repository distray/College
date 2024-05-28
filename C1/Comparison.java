import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {

        // create an instance of the scanner for user input
        Scanner keyboard = new Scanner(System.in);

        // ask salary from user
        System.out.print("Enter your annual salary: ");
        double annualSalary = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Enter years of employment at current job: ");
        int yearsEmployment = keyboard.nextInt();
        keyboard.nextLine();

        // nesting aka embedding an if statement 
        if (annualSalary >= 50_000) {
            if (yearsEmployment >= 2) {
                System.out.println("You qualify for a loan!");
            }
            else { // this else is yearsEmployment
                System.out.println("You do not meet the 2 years minimum requirement");
            }
        }
        else { // this else is annualSalary failure
            System.out.println("You do not meet the $50,000/yr requirement");
        }

        keyboard.close();
    }

    
}


