import java.util.ArrayList;
import java.util.Scanner;

public class LastItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            System.out.println("Enter a string (or press enter to finish):");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            strings.add(input);
        }

        if (!strings.isEmpty()) {
            System.out.println("The last string you entered is: " + strings.get(strings.size() - 1));
        } else {
            System.out.println("You didn't enter any strings.");
        }
    }
}