import java.util.ArrayList;
import java.util.List;

public class Wordrobe {
    private List<Shell> shellOnTheWordrobe= new ArrayList<Shell>();
    private int wordrobID;
    private String wordrobClassifier;
    private int wordrobDemenshionInShell;

    public int getWordrobID() {
        return wordrobID;
    }

    public void setWordrobID(int wordrobID) {
        this.wordrobID = wordrobID;
    }

    public String getWordrobClassifier() {
        return wordrobClassifier;
    }

    public void setWordrobClassifier(String wordrobClassifier) {
        this.wordrobClassifier = wordrobClassifier;
    }

    public int getWordrobDemenshionInShell() {
        return wordrobDemenshionInShell;
    }

    public void setWordrobDemenshionInShell(int wordrobDemenshionInShell) {
        this.wordrobDemenshionInShell = wordrobDemenshionInShell;
    }

    public Wordrobe(int wordrobID, String wordrobClassifier, int wordrobDemenshionInShell) {
        this.wordrobID = wordrobID;
        this.wordrobClassifier = wordrobClassifier;
        this.wordrobDemenshionInShell = wordrobDemenshionInShell;
    }

    @Override
    public String toString() {
        return "Wordrobe{" +
                "wordrobID=" + wordrobID +
                ", wordrobClassifier='" + wordrobClassifier + '\'' +
                ", wordrobDemenshionInShell=" + wordrobDemenshionInShell +
                '}';
    }

    public void addShellToWordrobe(Shell shell){
        while (shellOnTheWordrobe.size()!=wordrobDemenshionInShell){
            shellOnTheWordrobe.add(shell);
        }
    }
}
