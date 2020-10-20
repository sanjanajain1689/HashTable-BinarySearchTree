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

    @Test
    public void givenANumber_WhenExistsInBinaryTree_ShouldReturnTrue() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(11);
        myBinaryTree.add(65);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        boolean result = myBinaryTree.search(63);
        Assert.assertTrue(result);
    }
}