import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CountWords{

    private List<CountWords> words;

    public void countProcess (List<CountWords> countWords, Predicate<CountWords> predicate, Consumer<CountWords> consumer) {
        int i = 0;
        for (CountWords word : countWords) {
            if (predicate.test((CountWords) words)) {
                word.equals(words);
               i ++;
           }
           consumer.accept((CountWords) words);
        }
    }



}
