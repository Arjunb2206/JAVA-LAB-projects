public class StringOperations {
    public static void main(String[] args) {
        String str = "HelloWorld";
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels++;
            } else if (Character.isLetter(c)) {
                consonants++;
            }
        }

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("Original String: " + str);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Reversed: " + reversed);
    }
}
