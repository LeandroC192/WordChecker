import java.util.ArrayList;

public class Main {
    public static void main (String[] args){
        ArrayList<String> words = new ArrayList<String>(); 
        WordChecker w = new WordChecker(words);
        words.add("an");
        words.add("band");
        words.add("band");
        words.add("abandon");
        System.out.println(w);
        System.out.println(w.isWordChain());
        System.out.println(w.createList("b"));
 
        ArrayList<String> word = new ArrayList<String>(); 
        WordChecker x = new WordChecker(word);
        word.add("to");
        word.add("too");
        word.add("stool");
        word.add("tools");
        System.out.println(x);
        System.out.println(x.isWordChain());
        System.out.println(x.createList("to"));

        ArrayList<String> wordsTwo = new ArrayList<String>(); 
        WordChecker y = new WordChecker(wordsTwo);
        wordsTwo.add("catch");
        wordsTwo.add("bobcat");
        wordsTwo.add("catchacat");
        wordsTwo.add("cat");
        wordsTwo.add("at");
        System.out.println(y);
        System.out.println(y.isWordChain());
        System.out.println(y.createList("cat"));
        System.out.println(y.createList("catch"));
        System.out.println(y.createList("dog"));

    }
}