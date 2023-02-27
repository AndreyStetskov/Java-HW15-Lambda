import java.util.Map;

@FunctionalInterface
public interface AbleToTranslate {

   void translate(String word, Map<String, String> dictionary);
}
