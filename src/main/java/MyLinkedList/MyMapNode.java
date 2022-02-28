package MyLinkedList;

public class MyMapNode<K, V> {
    K key;
    V value;
    MyMapNode<K, V> next;

    public MyMapNode(K key, V value){

    }

    public K getKey(){
        return key;
    }
    public void setKey(K key){
        this.key = key;

    }
    public INode<K> getNext(INode<K> next){
        this.next = (MyMapNode<K, V>) next;
        return next;
    }
    public  V getValue(){
        return this.value;
    }
    public void setValue(){
        this.value = value;
    }
    @Override
    public String toString(){

        return null;
    }
}
