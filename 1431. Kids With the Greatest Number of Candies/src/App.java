import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] candies = {2,3,5,1,3};

        System.out.println(solution.kidsWithCandies(candies, 3));
    }
}
