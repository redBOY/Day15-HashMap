package bridgelabzHashMap;

public class MyHashTable<K,V> {
    LinkedList<K,V> linkedList;

    public MyHashTable() {
        this.linkedList = new LinkedList<>();
    }

    public boolean containsKey(String key){
        return linkedList.containsKey(key);
    }

    public void put(K word,V count){
        linkedList.add(word,count);
    }

    public void print(){
        linkedList.print();
    }

    public int get(String word){
        return linkedList.get(word);
    }

    public void replace(K key, V value){
        linkedList.replace(key,value);
    }
}

