import java.util.Scanner;

public class ContainsTheCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numWords = scanner.nextInt();

        scanner.nextLine();

        String[] words = new String[numWords];
        for (int i = 0; i < numWords; i++) {
            words[i] = scanner.next();
        }

        char character = scanner.next().charAt(0);

        for (int i = 0; i < numWords; i++) {
            if (words[i].indexOf(character) >= 0) {
                System.out.println(words[i]);
            }
        }
    }
}
