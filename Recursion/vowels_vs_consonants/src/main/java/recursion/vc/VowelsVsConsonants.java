package recursion.vc;

public class VowelsVsConsonants {
    public static void main(String[] args) {
        String test = "bb";
        if (hasMoreVowels(test)){
            System.out.println("The string " + test + " has more vowels than consonants");
        }else{
            System.out.println("The string " + test + " has more consonants than vowels");
        }
    }

    public static boolean hasMoreVowels(String s){
        return hasMoreVowels(s, 0, 0, 0);
    }

    private static boolean hasMoreVowels(String s, int index, int vowelCount, int consonantCount){
        /*Check if a word has more vowels than consonants*/
        if (index >= s.length()){
            return vowelCount > consonantCount;
        }
        char c = s.charAt(index);
        if (isVowel(c)){
            return hasMoreVowels(s, index + 1, vowelCount + 1, consonantCount);
        }
        return hasMoreVowels(s, index + 1, vowelCount, consonantCount + 1);
    }

    private static boolean isVowel(char c){
        // Transform the char to lowercase
        if (c <= 85){
            c = (char) (c + 32);
        }
        return (c == 'a' || c == 'e'  || c == 'i' || c == 'o' || c == 'u');
    }
}