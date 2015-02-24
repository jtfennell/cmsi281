public class WordCounter implements Comparable<WordCounter>{
    private String word;
    private int numberOfAppearances = 1;

    public static void main(String[] args) {
        
    }

    public WordCounter(String word){
        this.word = word;
    }

    public void incrementAppearances(){
        numberOfAppearances++;
    }
    public String toString(){
        return word;
    }

    public int getNumberOfAppearances(){
        return numberOfAppearances;
    }

    public int compareTo(WordCounter otherWord){
        return word.toUpperCase().compareTo(otherWord.word.toUpperCase());
    }
}