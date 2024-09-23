import java.util.*;
public class LongestSubsequenceWord {
    String characters;
    ArrayList<String> words;

    public LongestSubsequenceWord(String characters, ArrayList<String> words){
        this.characters = characters;
        this.words = words;
    }

    public String getLongestSubsequenceWord(){
        ArrayList<String> matches = new ArrayList<>();
        StringBuilder temp = new StringBuilder(characters);
        String result = null;

        for(int i = 0; i < words.size(); i++){
            result = search(temp.deleteCharAt(i).toString());
            if(result != null){
                matches.add(result);
            }
            temp = new StringBuilder(characters);
        }
        return getLargestWord(matches);
    }

    private String search(String word){
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).equals(word)){
                return words.get(i);
            }
        }
        return null;
    }

    private String getLargestWord(ArrayList<String> wordList){
        String largest = "";

        for(int i = 0; i < wordList.size(); i++){
            if(largest.length() < wordList.get(i).length()){
                largest = wordList.get(i);
            }
        }
        return largest;
    }

    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        String characters = "abppplee";

        words.add("able");
        words.add("ale");
        words.add("apple");
        words.add("bale");
        words.add("kangaroo");

        LongestSubsequenceWord myLongestWord = new LongestSubsequenceWord(characters, words);
        System.out.println("\n\nThe longest word is: " + myLongestWord.getLongestSubsequenceWord());
    }

}
