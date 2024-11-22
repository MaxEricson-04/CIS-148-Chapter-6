import java.util.Scanner;

public class OutputValuesBelow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] userValues = new int[20];   // List of integers from input

        int numValues = scanner.nextInt();
        for (int i = 0; i < numValues; i++) {
            userValues[i] = scanner.nextInt();
        }
        int threshold = scanner.nextInt();
        for (int i = 0; i < numValues; i++) {
            if (userValues[i] <= threshold) {
                System.out.print(userValues[i] + " ");
            }
        }
        System.out.println();
    }
}
