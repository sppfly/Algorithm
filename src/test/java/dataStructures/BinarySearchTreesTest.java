package dataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/29 21:30
 */
class BinarySearchTreesTest {

    TreeNode seven = new TreeNode();
    TreeNode six = new TreeNode();
    TreeNode five = new TreeNode();
    TreeNode four = new TreeNode();
    TreeNode three = new TreeNode();
    TreeNode two = new TreeNode();
    TreeNode one = new TreeNode();
    TreeNode eight = new TreeNode();

    @BeforeEach
    public void init() {
        eight.setValue(8);
        seven.setValue(7);
        six.setValue(6);
        five.setValue(5);
        four.setValue(4);
        three.setValue(3);
        two.setValue(2);
        one.setValue(1);
        five.setLeft(four);
        four.setLeft(two);
        four.setRight(three);
        two.setLeft(one);
        five.setRight(seven);
        seven.setLeft(six);
        seven.setRight(eight);
    }

    @Test
    public void test() {
        Trees.levelOrderTraverse(five);
    }


    @Test
    public void find() {
        System.out.println(BinarySearchTrees.find(four.getValue(), five));
    }

    @Test
    public void findMax() {
        System.out.println(BinarySearchTrees.findMin(five));
    }

    @Test
    public void insert() {
        BinarySearchTrees.insert(9, five);
        Trees.levelOrderTraverse(five);
    }

}