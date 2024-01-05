import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.Random;
public class Main {
    private static final Logger log = Logger.getLogger(Main.class.getName());
    static boolean sum_Massive (int[][] matrix, int[] sum_str, int[] sum_stb) {
        int sum1 = 0;
        int sum2 = 0;

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[1].length; y++)
                sum_str[x] += matrix[x][y];
            sum1 += sum_str[x];
        }

        log.log(Level.INFO, "info", new Throwable());

        for (int x = 0; x < matrix[1].length; x++) {
            for (int y = 0; y < matrix.length; y++)
                sum_stb[x] += matrix[y][x];
            sum2 += sum_stb[x];
        }

        log.log(Level.INFO, "info", new Throwable());
        log.log(Level.INFO, "warning", new Throwable());

        assert sum1 > 0; // условие, что первая сумма должна быть больше нуля
        assert  sum2 > 0; // условие, что вторая сумма должна быть больше нуля

        if (sum1 == sum2)
            return true;
        else
            return false;
    }
    public static void main(String[] args) throws Exception {
        int[][] matrix = new int[][] {
                new int[]{5, 4, 3, 2, 1},
                new int[]{1, 2, 3, 4, 5},
                new int[]{1, 1, 1, 1, 4},
                new int[]{3, 3, 3, 3, 3},
        }; // исходный массив

        int[] sum_str = new int[matrix.length]; //  массив с суммой строк
        int[] sum_stb = new int[matrix[1].length]; // массив с суммой столбцов

        System.out.println(sum_Massive(matrix, sum_str, sum_stb));
    }
}