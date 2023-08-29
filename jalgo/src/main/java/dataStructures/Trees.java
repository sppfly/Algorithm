package dataStructures;



import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/3/1 20:24
 */
public class Trees {


    /**
     * @Description: 先序遍历
     * @author liuyi
     * @date 2021/3/1 20:36
     */
    public static void VLRTraverse(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.getValue());
        VLRTraverse(treeNode.getLeft());
        VLRTraverse(treeNode.getRight());
    }

    /**
     * @Description: 中序遍历
     * @author liuyi
     * @date 2021/3/1 21:18
     */
    public static void LVRTraverse(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        LVRTraverse(treeNode.getLeft());
        System.out.println(treeNode.getValue());
        LVRTraverse(treeNode.getRight());
    }

    /**
     * @Description: 后序遍历
     * @author liuyi
     * @date 2021/3/1 21:19
     */
    public static void LRVTraverse(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        LRVTraverse(treeNode.getLeft());
        LRVTraverse(treeNode.getRight());
        System.out.println(treeNode.getValue());
    }

    /**
     * @Description: 层序遍历，层序遍历需要用到队列
     * @author liuyi
     * @date 2021/3/29 20:32
     */
    public static void levelOrderTraverse(TreeNode treeNode) {
        Queue<TreeNode> deque = new ArrayDeque<>();
        subTraverse(treeNode, deque);
    }

    private static void subTraverse(TreeNode treeNode, Queue<TreeNode> deque) {
        System.out.println(treeNode.getValue());
        if (treeNode.getLeft() != null) {
            deque.offer(treeNode.getLeft());
        }
        if (treeNode.getRight() != null) {
            deque.offer(treeNode.getRight());
        }
        if (!deque.isEmpty()) {
            subTraverse(deque.poll(), deque);
        }
    }


    /**
     * 二叉树中序非递归遍历
     * @param treeNode
     */
    public static void VLRNoRecursionTraverse(TreeNode treeNode) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        while (true) {
            if (treeNode != null) {
                deque.push(treeNode);
            }
            break;

        }

    }

    /**
     * @Description: 求二叉树的高度
     * @author liuyi
     * @date 2021/3/29 20:50
     */
    public static int height(TreeNode treeNode) {
        if (treeNode.getRight() == null && treeNode.getLeft() == null) {
            return 1;
        }
        if (treeNode.getLeft() == null) {
            return height(treeNode.getRight()) + 1;
        } else if (treeNode.getRight() == null) {
            return height(treeNode.getLeft()) + 1;
        } else {
            return Math.max(height(treeNode.getLeft()), height(treeNode.getRight())) + 1;
        }
    }

//    public static TreeNode init(int[] arrays) {
//        if (arrays[0] == 0) {
//            return null;
//        }
//        Queue<TreeNode> queue = new LinkedList<>();
//        TreeNode treeNode = new TreeNode();
//        treeNode.setValue(arrays[0]);
//        queue.offer(treeNode);
//        for (int i = 1; i< arrays.length; i++) {
//            TreeNode node;
//            if (arrays[i] == 0) {
//                node = null;
//            } else {
//                node = new TreeNode();
//                node.setValue(arrays[i]);
//            }
//            if (queue.element().getLeft())
//        }
//    }
}
