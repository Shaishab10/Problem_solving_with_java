public class CountFromString {
    public static void main(String[] args) {//11
        String word = "I am a SQA Engineer";
        System.out.println(word);
        String[] words = word.split(" ");
        int wordLength = words.length;
        System.out.println("Words: " + wordLength);

        int chars = 0;
        int vowels = 0;
        int cons = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != ' ') {
                chars++;
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u' ||
                        word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
                    vowels++;
                } else {
                    cons++;
                }
            }
        }
        System.out.println("Chars : " + chars);
        System.out.println("Vowel: " + vowels);
        System.out.println("Consonant: " + cons);
    }
}
