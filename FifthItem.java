// importing list class from java.util
import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        while (true) {
            System.out.print("Enter an item: ");
            String input = sc.nextLine();

            if (input.isEmpty()) {
                break;
            }

            strings.add(input);
        }

        if (strings.size() >= 5) {
            System.out.println("The fifth string you entered is: " + strings.get(4));
        } else {
            System.out.println("You entered fewer than five strings.");
        }


    }
}
