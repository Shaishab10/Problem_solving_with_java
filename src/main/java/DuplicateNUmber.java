import java.util.ArrayList;

public class DuplicateNUmber {
    //12
    public static void main(String[] args) {
        int[] numbers= {1, 2, 3, 1, 2, 4, 5, 6, 4};
        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        for(int i=0;i<numbers.length;i++){
            for(int j= i+1; j<numbers.length;j++){
                if((numbers[i]==numbers[j]) && !duplicates.contains(numbers[j])){
                    duplicates.add(numbers[j]);
                }
            }
        }
        System.out.println("Duplicates numbers: " + duplicates);
    }
}
