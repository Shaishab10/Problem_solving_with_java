import java.util.Arrays;
import java.util.Random;

public class RandomNum {
    //6
    public static void main(String[] args) {
        int[] rand = new int[10];

        for (int i = 0; i < rand.length; i++) {
            Random random =new Random();
            rand[i] = random.nextInt(100);
        }

        System.out.println("Random Number Array: "+ Arrays.toString(rand));

        int max = rand[0];
        int min = rand[0];

        for (int i = 0; i < rand.length; i++) {
            if (rand[i] > max) {
                max = rand[i];
            }
            if (rand[i] < min) {
                min = rand[i];
            }
        }
        System.out.println("Max Number: " + max);
        System.out.println("Min Number: " + min);
    }
}
