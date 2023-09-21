import java.util.Scanner;

public class CountNotes {
    public static void main(String[] args) {
        //7
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        System.out.println("Enter Input: ");
        Scanner scanner =new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println("Input: " + input);
        for (int i = 0; i < notes.length; i++) {
            if (input >= notes[i]) {
                int count = input / notes[i];
                input = input % notes[i];
                System.out.println(notes[i] + " " + count);
            }
        }
    }
}
