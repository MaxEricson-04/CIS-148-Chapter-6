import java.util.Scanner;

public class MiddleItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_SIZE = 9;
        int[] userValues = new int[MAX_SIZE];  // Set of data specified by the user

        int num = scanner.nextInt();
        int i = 0;

        while (num >= 0 && i < MAX_SIZE) {
            userValues[i] = num;
            num = scanner.nextInt();
            i++;
        }

        if (num >= 0) {
            System.out.println("Too many inputs");
        } else {
            System.out.println(userValues[i / 2]);
        }
    }
}
