package fundamental;

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
}
