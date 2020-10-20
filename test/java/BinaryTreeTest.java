import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeTest {
    @Test
    public void given3Numbers_WhenAddedToBinaryTree_ShouldBeAddedCorrectly() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        boolean result = myBinaryTree.getRoot().key.equals(56) &&
                myBinaryTree.getRoot().left.key.equals(30) &&
                myBinaryTree.getRoot().right.key.equals(70);
        Assert.assertTrue(result);
    }
}