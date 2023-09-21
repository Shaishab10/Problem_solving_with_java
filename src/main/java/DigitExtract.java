public class DigitExtract {
    public static void main(String[] args) {//15
        String str="A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";
        str = str.replaceAll("[^\\d]", " ");
        str = str.trim();
        str = str.replaceAll(" +", " ");
        System.out.println(str);
        String[] word=(str.split(" "));
        int laptop_price = Integer.parseInt(word[1]);
        int mouse_price =  Integer.parseInt(word[2]);
        int vat= Integer.parseInt(word[4]);

        System.out.println("Laptop Price: "+laptop_price);
        System.out.println("Gaming Mouse Price: "+mouse_price);
        System.out.println("Vat: "+vat);

        double total_cost =  ((laptop_price+mouse_price)-((laptop_price+mouse_price)*((double) vat /100)));

        System.out.println("Total Cost: "+total_cost );
    }
}
