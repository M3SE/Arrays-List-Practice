import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
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

        System.out.println("The number of strings you entered is: " + strings.size());
    }
}