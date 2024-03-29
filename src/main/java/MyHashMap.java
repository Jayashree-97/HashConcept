import K.K;
import MyLinkedList.MyLinkedList;
import V.V;

public class MyHashMap<K, V> {
    MyLinkedList<K> myLinkedList;

    public MyHashMap(){

        this.myLinkedList = new MyLinkedList<K>();
    }
    public V get(K key){

        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
        return  (myMapNode == null) ? null : myMapNode.getValue();

        }
        public void add(K key, V value){
            MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
            if(myMapNode == null){
                myMapNode = new MyMapNode<>(key, value);
                this.myLinkedList.append(myMapNode);
            }
            else {
                myMapNode.setvalue1(value);
            }
        }
        @Override
                public String toString(){

        return "MyHashMapNodes{" + myLinkedList + '}';
        }
    }
}
