import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {//14
        int sum=0;
        String ch;

        do {
            System.out.println("Input number:");
            Scanner input=new Scanner(System.in);
            ch=input.next();

            if(Character.isDigit(ch.charAt(0))){
                int num= Integer.parseInt(ch);
                sum+=num;
                System.out.println("Sum: " +sum);
            }
            else if((!ch.equals("q"))){
                System.out.println("Input the number again");
            }
            else{
                break;
            }
        }
        while (true);
        System.out.println("Total sum: " + sum);
    }
}
