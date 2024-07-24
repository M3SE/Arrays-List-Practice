import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        System.out.println("Enter integers to add to the list (enter 0 to finish):");

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            integers.add(input);
        }

        int sum = calculateSum(integers);
        System.out.println("The sum of the list is: " + sum);
    }

    public static int calculateSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }
}