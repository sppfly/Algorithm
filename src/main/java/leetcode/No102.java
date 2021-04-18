package leetcode;

import dataStructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author shuxiahua
 * @Description:
 * @date 2021/4/6 15:53
 */
public class No102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        Queue<TreeNode> treeNodes = new LinkedList<>();
        if (root == null) {
            return null;
        }
        treeNodes.offer(root);
        while (!treeNodes.isEmpty()) {
            int size = treeNodes.size();
            List<Integer> thisLevel = new ArrayList<>();
            for (int i = 0; i<size; i++) {
                TreeNode treeNode = treeNodes.poll();
                if (treeNode.left != null) {
                    treeNodes.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    treeNodes.offer(treeNode.right);
                }
                thisLevel.add(treeNode.getValue());
            }
            result.add(thisLevel);
        }
        return result;
    }
}
