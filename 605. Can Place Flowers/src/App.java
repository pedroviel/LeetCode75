import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        int[] flowerbed1 = {1,0,0,0,1};
        int[] flowerbed2 = {1,0,0,0,1};

        System.out.println(solution.canPlaceFlowers(flowerbed1, 1));
        System.out.println(solution.canPlaceFlowers(flowerbed2,2));
    }
}
