package Ch2A;
import java.util.Scanner;

public class mafpercents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("How many males are registered in the class? "); // males input #
            int numMales = scanner.nextInt();
            System.out.print("How many females are registered in the class? "); // females input #
            int numFemales = scanner.nextInt(); 

            int totalNum = numMales + numFemales; // percentage calc
            double percentMale = ((double) numMales / totalNum) * 100;
            double percentFemale = ((double) numFemales / totalNum) * 100;

            // display final percents--experimented with using variables first and using % as text after calculations to optimize
            System.out.println((percentMale) + "% Males");
            System.out.println((percentFemale) + "% Females");

            // fix resource leak from problems terminal
            scanner.close();
    }
}
