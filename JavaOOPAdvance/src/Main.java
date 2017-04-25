import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mihail on 3/23/2017.
 */
public class Main {
    public static void main(String[] args) {
        String firstString = "I am improve using programmer";
        String searchingWord = "am improve";

        String[] words = findWords(firstString, searchingWord);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static String[] findWords(String str1, String str2) {
        String[] sentence = str1.split("\\s+");
        String[] word = str2.split("\\s+");

        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < sentence.length; i++) {
            list1.add(sentence[i]);
        }

        List<String> list2 = new ArrayList<>();
        for (int i = 0; i < word.length; i++) {
            list2.add(word[i]);
        }

        List<String> result = new ArrayList<>();

        List<String> res = Arrays.stream(sentence).filter(el -> !list2.contains(el)).collect(Collectors.toList());

//        for (String s : list1) {
//            if (!list2.contains(s)) {
//                result.add(s);
//            }
//        }

        String[] items = new String[res.size()];
        for (int i = 0; i < res.size(); i++) {
            items[i] = res.get(i);
        }

        return items;
    }
}
