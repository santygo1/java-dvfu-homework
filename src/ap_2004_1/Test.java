package ap_2004_1;

public class Test {

    public static void main(String[] args) {
        WordList animals = new WordList("cat", "mouse", "frog", "dog", "dog");

        testNumWords(animals);
        testRemoveWords(animals);
    }

    private static void testNumWords(WordList wordList){
        System.out.println("=== test 1 ===");
        System.out.println("description: search count of list word by length");

        System.out.println("List: " + wordList);

        System.out.println("4: " + wordList.numWordsOfLength(4));
        System.out.println("3: " + wordList.numWordsOfLength(3));
        System.out.println("2: " + wordList.numWordsOfLength(2));

        System.out.println("==============");
    }

    private static void testRemoveWords(WordList wordList){
        System.out.println("=== test 2 ===");
        System.out.println("description: remove words from list by length");

        System.out.println("List: " + wordList);

        wordList.removeWordsOfLength(4);
        System.out.println("4: " + wordList);

        wordList.removeWordsOfLength(3);
        System.out.println("3: " + wordList);

        wordList.removeWordsOfLength(2);
        System.out.println("2: " + wordList);

        System.out.println("==============");
    }
}
