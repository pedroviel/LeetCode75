import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();
        
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        System.out.println(solution.gcdOfStrings(str1, str2));
    }
}
