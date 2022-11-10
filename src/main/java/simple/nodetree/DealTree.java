package simple.nodetree;

/**
 * 剪枝
 */
public class DealTree {

    public static NodeTreeSearch deal(NodeTreeSearch nodeTreeSearch) {

        if (nodeTreeSearch == null) {
            return null;
        }

        nodeTreeSearch.left = deal(nodeTreeSearch.left);
        nodeTreeSearch.right = deal(nodeTreeSearch.right);

        if (nodeTreeSearch.left == null && nodeTreeSearch.right == null && nodeTreeSearch.data == 0) {
            // 返回的空对象覆盖左节点或右节点
            return null;
        }

        return nodeTreeSearch;
    }

}
