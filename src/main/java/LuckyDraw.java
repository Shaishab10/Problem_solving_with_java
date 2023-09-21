import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LuckyDraw {//13
    public static void main(String[] args) {
        int[] numbers ={100,150,140,180,170,200,250,230,220,300};
        System.out.println(Arrays.toString(numbers));
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please Enter a Number from the given array: ");
        int input = scanner.nextInt();
        System.out.println("Input Number: "+input );

        boolean status = false;
        Random random =new Random();

        for(int i=0;i<3;i++){
            int j=random.nextInt(numbers.length-1);
            System.out.println("Random Number: "+ numbers[j]);
            if(input==numbers[j]){
                status =true;
                break;
            }
        }
        if(status){
            System.out.println("You are Lucky");
        }
        else {
            System.out.println("You are not Lucky");
        }
    }
}
