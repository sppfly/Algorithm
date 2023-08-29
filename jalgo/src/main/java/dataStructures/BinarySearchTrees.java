package dataStructures;

/**
 * @author shuxiahua
 * @Description: 二叉搜索树的相关操作
 * @date 2021/3/29 21:30
 */
public class BinarySearchTrees {


    /**
     * @Description: 平衡二叉树的查找
     * @author liuyi
     * @date 2021/3/29 21:41
     */
    public static TreeNode find(int x, TreeNode treeNode) {
        if (treeNode == null) {
            return null;
        }
        while(treeNode != null) {
            if (treeNode.getValue() == x) {
                return treeNode;
            } else if (treeNode.getValue() > x) {
                treeNode = treeNode.getLeft();
            } else {
                treeNode = treeNode.getRight();
            }
        }
        return null;
    }

    /**
     * @Description: 二叉查找树查找最大的
     * @author liuyi
     * @date 2021/3/29 21:46
     */
    public static int findMin(TreeNode treeNode) {
        while (treeNode.getLeft() != null) {
            treeNode = treeNode.getLeft();
        }
        return treeNode.getValue();
    }

    /**
     * @Description: 二叉查找树查找最小的
     * @author liuyi
     * @date 2021/3/29 21:47
     */
    public static int findMax(TreeNode treeNode) {
        while (treeNode.getRight() != null) {
            treeNode = treeNode.getRight();
        }
        return treeNode.getValue();
    }


    /**
     * @Description: 二叉搜索树的插入
     * @author liuyi
     * @date 2021/3/29 22:17
     */
    public static void insert(int x, TreeNode treeNode) {
        if (treeNode == null) {
            treeNode = new TreeNode();
            treeNode.setValue(x);
        } else if (treeNode.getValue() > x) {
            insert(x, treeNode.getLeft());
        } else if (treeNode.getValue() < x){
            insert(x, treeNode.getRight());
        }
    }
}
