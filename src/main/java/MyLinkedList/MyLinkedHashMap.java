package MyLinkedList;


import java.util.ArrayList;

public class MyLinkedHashMap<K, V> {
    private final int numBuckets;
    ArrayList<MyLinkedList<K>> myBucketArray;

    public MyLinkedHashMap(){
        this.numBuckets = 10;
        this.myBucketArray = new ArrayList<>(numBuckets);
        //Created empty LinkedList
        for(int i = 0; i< numBuckets; i++)
            this.myBucketArray.add(null);
    }
    //implements Hash function to find index
    //for a key
    private  int getBucketIndex(K key){
        int hasCode = Math.abs(key.hashCode());
        int hashCode = 0;
        int index = hashCode % numBuckets;
        return index;
    }
    public K search(K key) {

        return key;
    }

    public void append(MyMapNode<K, V> myMapNode) {
    }
}
