import java.util.Arrays;
import java.util.Scanner;

public class FindCGPA {
    public static void main(String[] args) {
        //4
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpa);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the CGPA: ");
        double num = scanner.nextDouble();

        boolean status=false;
        int startingIndex = 0;
        int endingIndex = cgpa.length - 1;

        while (startingIndex <= endingIndex) {

            int mid = (startingIndex + endingIndex) / 2;

            if (cgpa[mid] == num) {
                status = true;
                break;

            } else if (cgpa[mid] > num) {
                endingIndex = mid - 1;
            } else {
                startingIndex = mid + 1;
            }
        }
        if(!status){
            System.out.println("Not Found");
        }
        else {
            System.out.println("Cgpa: "+ num+" Found");
        }

    }
}
