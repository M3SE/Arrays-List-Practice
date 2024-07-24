import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        while (true) {
            System.out.println("Enter an integer (or enter 0 to finish):");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            integers.add(input);
        }

        System.out.println("You are done adding integers to the list.");

        System.out.println("What number are you looking for in the list?");
        int numberToFind = scanner.nextInt();

        int index = integers.indexOf(numberToFind);
        if (index != -1) {
            System.out.println("The index of " + numberToFind + " is: " + index);
        } else {
            System.out.println(numberToFind + " is not in the list.");
        }
    }
}