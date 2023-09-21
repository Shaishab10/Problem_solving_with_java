import java.util.Arrays;
import java.util.Random;

public class RandomSwap {//9
    public static void main(String[] args) {
        int[] numbers ={1,2,3,4,5,6,7,8,9,0};
        System.out.println("Before Random Swap: "+Arrays.toString(numbers));

        for (int i=0;i<numbers.length;i++){
            Random random =new Random();
            int j = random.nextInt(numbers.length-1);

            int temp = numbers[i];
            numbers[i]=numbers[j];
            numbers[j]=temp;
        }

        System.out.println("After Random Swap: "+Arrays.toString(numbers));

    }
}
