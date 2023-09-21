import java.util.Arrays;
import java.util.Scanner;

public class Height {
    //10
    public static void main(String[] args) {

        int[] heights= new int[10];
        Scanner scanner =new Scanner(System.in);
        System.out.println("Input Height(in cm): ");

        for(int i=0;i< heights.length;i++){
            heights[i]=scanner.nextInt();
        }
        System.out.println("Heights: "+ Arrays.toString(heights));


        int min = heights[0];
        int min2 = heights[1];

        for (int i = 0; i < heights.length; i++) {
            if (min > heights[i]) {
                min = heights[i];
            }
        }

        for (int i = 0; i < heights.length; i++) {
            if (min2 > heights[i] && heights[i] != min) {
                min2 = heights[i];
            }
        }
        System.out.println("Lowest Height: "+min);
        System.out.println("2nd Lowest Height: "+min2);
    }
}
