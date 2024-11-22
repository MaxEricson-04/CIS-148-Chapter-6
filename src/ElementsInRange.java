import java.util.Scanner;

public class ElementsInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numValues = scanner.nextInt();

        int[] values = new int[numValues];

        for (int i = 0; i < numValues; i++) {
            values[i] = scanner.nextInt();
        }

        int lowerBound = scanner.nextInt();
        int upperBound = scanner.nextInt();

        for (int i = 0; i < numValues; i++) {
            if (values[i] >= lowerBound && values[i] <= upperBound) {
                System.out.print(values[i] + " ");
            }
        }
        System.out.println();
    }
}
