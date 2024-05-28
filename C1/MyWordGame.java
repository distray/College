package Ch2A;
import java.util.Scanner;

public class MyWordGame {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
             System.out.print("What is your name? "); // Name input
             String NAME = scanner.nextLine();
             System.out.print("What is your age? "); // Age input
             String AGE = scanner.nextLine();
             System.out.print("What is the name of your city? "); // City input
             String CITY = scanner.nextLine();
             System.out.print("What is the name of your college? "); // College input
             String COLLEGE = scanner.nextLine();
            System.out.print("What's your profession? "); // Profession input
            String PROFESSION = scanner.nextLine();
            System.out.print("Enter a type of animal: "); // Animal input
            String ANIMAL = scanner.nextLine();
            System.out.print("What's your pet's name? If none, enter the first name that comes to mind: "); // Pet input
            String PETNAME = scanner.nextLine();

            String story = ("There once was a person named " + NAME + " who lived in " + CITY + ". At the age of " + AGE + ", " + NAME + 
            " went to college at " + COLLEGE + ". " + NAME + " graduated and went to work as a " 
            + PROFESSION + ". Then, " + NAME + " adopted a(n) "  + ANIMAL + " named " + PETNAME + 
            ". They both lived happily ever after!");

            System.out.println("Here is your story!");
            System.out.println(story);

            scanner.close(); // fix resource leak from problems terminal
    }
}
