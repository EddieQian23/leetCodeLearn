package simple.nodetree;

public class NodeTreeSearch {

    int data;
    NodeTreeSearch left;
    NodeTreeSearch right;

    public NodeTreeSearch() {
        super();
    }

    public NodeTreeSearch(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // 左子树的点永远小于根节点，右子树永远大于根节点
    public void insert(NodeTreeSearch root, int data) {
        if (data > root.data) {
            if (root.right == null) {
                root.right = new NodeTreeSearch(data);
            } else {
                insert(root.right, data);
            }
        } else {
            if (root.left == null) {
                root.left = new NodeTreeSearch(data);
            } else {
                insert(root.left, data);
            }
        }
    }

    public static void inOrder(NodeTreeSearch root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }

    public static int find(NodeTreeSearch root, int data) {

        if (data > root.data) {
            if (root.right == null) {
                return -1;
            }
            return find(root.right, data);
        } else if (data <= root.data) {
            if (data == root.data) {
                return root.data;
            }
            if (root.left == null) {
                return -1;
            }
            return find(root.left, data);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {3, 14, 7, 1, 1, 8};
        NodeTreeSearch nodeTreeSearch = new NodeTreeSearch(data[0]);
        for (int i = 1; i < data.length; i++) {
            nodeTreeSearch.insert(nodeTreeSearch, data[i]);
        }
        System.out.println("中序遍历");
        inOrder(nodeTreeSearch);
        System.out.println(find(nodeTreeSearch, 9));
    }

}
