import java.util.*;

public class Dictionary implements AbleToTranslate{
    private String targetLanguage;
    private String sourceLanguage;
    private Map<String, String> dictionary;


    public void addWordOrTranslate(Map<String, String> dictionary) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some word in English");
        sourceLanguage = scanner.nextLine().toLowerCase();

        System.out.println("Enter its translation into Russian");
        targetLanguage = scanner.nextLine().toLowerCase();

        dictionary.putIfAbsent(sourceLanguage, targetLanguage);

        if (!dictionary.get(sourceLanguage).toLowerCase().contains(targetLanguage.toLowerCase())) {
            String newString = dictionary.get(sourceLanguage) + ", " + targetLanguage;
            dictionary.put(sourceLanguage, newString);
        }
    }

    public void removeWord(String word, Map<String, String> dictionary){
        if (dictionary.containsKey(word)){
            dictionary.remove(word, dictionary.get(word));
        } else {
            System.out.println("There's no this word in dictionary");
        }
    }

    public void removeTranslate(String fromWord, String translate, Map<String, String> dictionary){
        if (dictionary.containsKey(fromWord) && dictionary.get(fromWord).toLowerCase().contains(translate.toLowerCase())) {
            if (dictionary.get(fromWord).startsWith(translate) && dictionary.get(fromWord).length() == translate.length()) {
                dictionary.remove(fromWord, dictionary.get(fromWord));
            } else if (dictionary.get(fromWord).startsWith(translate)) {
                String newString = dictionary.get(fromWord).replaceFirst(translate + ", ", "");
                dictionary.put(fromWord, newString);
            } else {
                String newString = dictionary.get(fromWord).replaceFirst(", " + translate, "");
                dictionary.put(fromWord, newString);
            }
        } else {
            System.out.println("There's no this word in dictionary");
        }
    }

    public void search(Map<String, String> dictionary) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter some word for search");
        String word = scanner.nextLine().toLowerCase();
        
        if(dictionary.containsKey(word)){
            System.out.println(word + " translates as:");
            System.out.println(dictionary.get(word));
        } else {
            System.out.println("The word wasn't found");
        }
    }


    public String getTargetLanguage() {
        return targetLanguage;
    }

    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, String> dictionary) {
        this.dictionary = dictionary;
    }


    @Override
    public void translate(String word, Map<String, String> dictionary) {
        word = word.toLowerCase();

        if (dictionary.containsKey(word)){
            System.out.println(word + " translates as:");
//            for (String translate : dictionary.get(word)) {
//                System.out.println(i + ". " + translate);
//                i ++;
//            }
            System.out.println(dictionary.get(word));
        } else {
            System.out.println("There's no this word. Do you want to add it into dictionary?");
        }

    }


}
