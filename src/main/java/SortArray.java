import java.util.Arrays;

public class SortArray {
    //3
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        double temp;
        boolean status;
        do {
            status = false;
            for (int i = 0; i < cgpa.length - 1; i++) {
                if (cgpa[i] < cgpa[i + 1]) {
                    temp = cgpa[i + 1];
                    cgpa[i + 1] = cgpa[i];
                    cgpa[i] = temp;
                    status = true;
                }
            }
        }
        while (status);

        System.out.println("Sorted CGPA: " +Arrays.toString(cgpa));
    }
}
