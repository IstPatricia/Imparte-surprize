import java.util.Random;

public class RandomGenerator {
    private static Random random = new Random();

    public static int generateRandom (int n){

     return random.nextInt(n);
    }
}
