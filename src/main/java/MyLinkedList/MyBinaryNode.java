package MyLinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyBinaryNode<K extends Comparable<K>> {
    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    public MyBinaryNode(K key){
        this.key =key;
        this.left = null;
        this.right = null;

    }
    public class MyBinaryTreeTest{
        @Test
        public void given3NumbersWhenAddedToBSTShouldReturnSize3(){
            MyBinarTree<Integer> myBinarTree = new MyBinarTree<Integer>();
            myBinarTree.add(56);
            myBinarTree.add(30);
            myBinarTree.add(70);
            int size = myBinarTree.getSize();
            Assert.assertEquals(3,size);
        }
    }
}
