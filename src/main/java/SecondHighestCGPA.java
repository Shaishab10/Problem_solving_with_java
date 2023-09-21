public class SecondHighestCGPA {
    public static void main(String[] args) {
        //2
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double max = 0;
        double max2 = 0;

        for (int i = 0; i < cgpa.length; i++) {
            if (max < cgpa[i]) {
                max = cgpa[i];
            }
        }

        for (int i = 0; i < cgpa.length; i++) {
            if (max2 < cgpa[i] && cgpa[i] != max) {
                max2 = cgpa[i];
            }
        }
        System.out.println("Second Highest CGPA: " + max2);
    }
}
