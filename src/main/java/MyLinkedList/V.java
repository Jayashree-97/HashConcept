public class V {
    public V get(K key) {
        int index = this.getBuckIndex(key);
        MyLinkedList<K> myLinked List = this.myBucketArray.get(index);
        if (myLinkedList == null) return null;
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }
    public void add(K key, V value){
        int index = this.getBucketIndex(key);
        MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
        if(myMapNode == null){
            myMapNode = new MyMapNode<>(key, value);
            myLinkedList.append(myMapNode);
        }
        else{
            myMapNode.setValue(value);
        }
    }
    @Override
    public  String toString(){
        return  " MyLinkedHashMap List{" + myBucketArray +'}';
    }
}