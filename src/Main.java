import java.util.*;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class Main {
    public static void main(String[] args) {

        CountWords words = new CountWords();
        List<String> word = new ArrayList<>();
        word.add("brass");
        word.add("exodus");
        word.add("synagogue");
        word.add("spanner");
        word.add("ferret");
        word.add("brass");
        word.add("brass");
        word.add("synagogue");
        word.add("brass");
        word.add("ferret");






        Dictionary englishRussian = new Dictionary();
        Map<String, String> dictionary = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        englishRussian.addWordOrTranslate(dictionary);
        englishRussian.addWordOrTranslate(dictionary);
        englishRussian.addWordOrTranslate(dictionary);
        englishRussian.addWordOrTranslate(dictionary);
        englishRussian.addWordOrTranslate(dictionary);

        englishRussian.search(dictionary);

        englishRussian.addWordOrTranslate(dictionary);

        englishRussian.removeTranslate("Key", "Ключ", dictionary);

        englishRussian.removeWord("Book", dictionary);


        englishRussian.translate("BoOk", dictionary);
    }
}