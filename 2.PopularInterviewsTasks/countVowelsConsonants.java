import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//import static jdk.vm.ci.meta.JavaKind.Char;

public class countVowelsConsonants {
    public static void main(String[] args) {

        String s1 = " maDam aBba towel ";
        String s2 = "raceCar";
        String s3 = "aBba";

        System.out.println(countVowelsConsonantsMine(s1));

    }

    public static String countVowelsConsonantsMine(String string) {
        List<Character> vowelsArray = List.of('a', 'e', 'i', 'o', 'u', 'y');
        String normalized = string.toLowerCase().trim();
        var countVowels = 0;
        var countSpaces = 0;
        for (char c : normalized.toCharArray()) {
            if (vowelsArray.contains(c)) {
                countVowels++;
            } else if (c == ' ') {
                countSpaces++;
            }
        }
        return "количество гласных " + countVowels + " количество согласных " + (normalized.length() - countVowels - countSpaces);
    }

    public static String countVowelsConsonantsTradAvt(String input) {
        String vowels = "aeiouy";
        String normalized = input.toLowerCase().trim();
        var countVowels = 0;
        var countConsonants = 0;
        char[] normalizedArray = normalized.toCharArray();
        for (char c : normalizedArray) {
            if (vowels.indexOf(c) != -1 ) {
                countVowels++;
            }
            else if (c != ' ') {
                countConsonants++;
            }
        }

        return "количество гласных " + countVowels + " количество согласных " + countConsonants;
    }

    public static void findNumberOfVowelsAndConsonantsStreams(String input) {
        String vowels = "aeiouy";
        String normalized = input.toLowerCase().trim();

        int[] letters = normalized.chars()
                .filter(Character::isAlphabetic)
                .toArray();

        long vowelsCount = Stream.of(letters)
                .filter(c -> vowels.indexOf(String.valueOf(c)) != -1)
                .count();

     //   long consonantCount = letters.stream().count() - vowelsCount;

        System.out.println("There are " + vowelsCount + " vowels in " + input);
//        System.out.println("There are " + consonantCount + " consonants in " + input);
        System.out.println();
    }
}
