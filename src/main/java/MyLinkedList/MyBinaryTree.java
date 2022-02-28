package MyLinkedList;

public class MyBinaryTree<K extends Comparable<K>>{
    private static final Object K = null;
    private MyBinaryNode<K> root;
    public Object add(K key){
        MyBinaryNode<K> addRecursively ;boolean current;
        Object MyBinaryNode;
        (MyBinaryNode < K > current, K key){
            if(current == null)
                return new MyBinaryNode<>(key);
            int compareResult = key.compareTo(current.key);

            if(compareResult == 0) return current;
            if(compareResult < 0){
                current.right = addRecursively(current.right, key);
            }
            return current;
        }
        public int getSize(){
            return this.getSizeRecursive(root);
        }
        private int getSizeRecursive(MyBinaryNode<K> current){
            int i = current == null ? 0 : 1 + this.getSizeRecursive(current.left)
                    + this.getSizeRecursive(current.right);
            return i;
        }
    }

    private Object getSizeRecursive(MyBinaryNode<K> root) {
        return null;
    }
}
