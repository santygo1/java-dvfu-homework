package ap_2004_1;

import java.util.ArrayList;
import java.util.Arrays;

public class WordList {

    private final ArrayList<String> myList;

    public WordList(String ... words){
        myList = new ArrayList<>(Arrays.asList(words));
    }

    /**
     * Returns the number of words that are exactly len letters long
     * @param len desired length for words
     * @return count of words, which has specified length
     */
    public int numWordsOfLength(int len){
        int matchCount = 0;

        for (String current : myList)
            if (current.length() == len) matchCount++;

        return matchCount;
    }

    /**
     * Removes elements, which has specified length
     * @param len length to remove elements
     */
    public void removeWordsOfLength(int len){
        myList.removeIf(s -> s.length() == len);
    }

    @Override
    public String toString() {
        return myList.toString();
    }
}
