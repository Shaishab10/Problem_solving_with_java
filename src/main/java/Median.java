import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        //5
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};
        Arrays.sort(cgpa);
        int index = cgpa.length;
        System.out.println(Arrays.toString(cgpa));
        double median;

        if (index % 2 == 0) {
            median = (cgpa[(index - 1) / 2] + cgpa[index / 2]) / 2;
        } else {
            median = cgpa[(index - 1) / 2];
        }
        System.out.println("Median: " + median);

    }
}