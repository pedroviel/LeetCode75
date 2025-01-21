import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println(solution.mergeAlternately(word1, word2));
    }
}
