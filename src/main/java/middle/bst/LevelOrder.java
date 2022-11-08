package middle.bst;

import java.util.ArrayList;
import java.util.List;

/**
 * 层次遍历
 *
 * 我们先考虑本题的递归解法。想到递归，我们一般先想到DFS。
 * 我们可以对该二叉树进行先序遍历（根左右的顺序），同时，记录节点所在的层次level，
 * 并且对每一层都定义一个数组，然后将访问到的节点值放入对应层的数组中。
 */
public class LevelOrder {

    public static List<List> dfs(TreeNode root, int level, List<List> res) {

        if (root == null) {
            return res;
        }

        if (res.size() == level) {
            res.get(level).add(root.getVal());
        } else {
            res.get(level).add(root.getVal());
        }

        res = dfs(root.getLeft(), level + 1, res);
        res = dfs(root.getRight(), level + 1, res);

        return res;
    }

    public static void main(String[] args) {
        List<List> res = new ArrayList<>(3);
        res.add(new ArrayList());
        res.add(new ArrayList());
        res.add(new ArrayList());

        TreeNode root = new TreeNode();
        root.setVal(3);

        TreeNode node1 = new TreeNode();
        node1.setVal(9);
        TreeNode node2 = new TreeNode();
        node2.setVal(20);
        root.setLeft(node1);
        root.setRight(node2);

        TreeNode node3 = new TreeNode();
        node3.setVal(15);
        TreeNode node4 = new TreeNode();
        node4.setVal(7);
        node2.setLeft(node3);
        node2.setRight(node4);

        List<List> res2 = dfs(root, 0, res);
        System.out.println(res2);
    }

}
