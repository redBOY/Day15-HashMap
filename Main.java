package bridgelabzHashMap;

public class Main {
    public static void main(String[] args) {

        String paragraph = "A cat is sleeping under the bed";


        String[] splitArray = paragraph.split(" ");
        MyHashTable<String, Integer> hashTable = new MyHashTable<>();
        for (String word : splitArray) {
            if (hashTable.containsKey(word)) {
                int count = hashTable.get(word);
                hashTable.replace(word, count + 1);
            } else {
                hashTable.put(word, 1);
            }
        }
        hashTable.print();
    }
}

