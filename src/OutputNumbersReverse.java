import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = scanner.nextInt();
        int[] userList = new int[SIZE];
        int numElements;

        for (int i=0; i < SIZE; i++) {
            userList[i] = scanner.nextInt();
        }


        for (int i=SIZE-1; i >= 0; i--) {
            System.out.print(userList[i] + " ");
        }
        System.out.println();
    }
}