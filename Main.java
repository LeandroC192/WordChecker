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
        WordChecker x = new WordChecker(words);
        words.add("to");
        words.add("too");
        words.add("stool");
        words.add("tools");
        System.out.println(x);
        System.out.println(x.isWordChain());
        System.out.println(w.isWordChain());
    }
    
}
