package Exam1;
import java.util.Scanner;

// 1 bag = 40 cookies
// 10 servings per bag
// 1 serving = 300 cals
// Let user enter number of cookies they ate and report number of cals consumed
// There are 4 cookies per serving. 4 cookies = 300 cals. 3000 total.

public class CookieCalories {
    public static void main(String[] args) {
        final int COOKIES_ONE_BAG = 40;
        final int SERVINGS_ONE_BAG = 10;
        final int CALORIES_ONE_SERVING = 300;

        Scanner scanner = new Scanner(System.in); // User input object

        System.out.print("Enter number of cookies consumed: ");
        int cookiesConsumed = scanner.nextInt();

        // Calculations of number of servings and calories consumed for total calories consumed
        double numServings = (double) cookiesConsumed / COOKIES_ONE_BAG * SERVINGS_ONE_BAG; // 2 operations, so double
        int caloriesConsumed = (int) numServings * CALORIES_ONE_SERVING; // 1 operation, so int

        // Result output in Terminal for user
        System.out.println("You have consumed a total of " + caloriesConsumed + " calories.");

        scanner.close();
    }
}

// NOTE: double numServings is truncated and will improperly display calories! Updated code is only in my submitted quiz.
