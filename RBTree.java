class RBNode {
    // 顏色，true 為紅色，false 為黑色
    boolean color;
    // 節點值
    int value;
    // 左子節點
    RBNode left;
    // 右子節點
    RBNode right;
    // 父節點
    RBNode parent;

    // 建構子，新增節點時使用
    RBNode(int value, boolean color, RBNode parent) {
        this.value = value;
        this.color = color;
        this.parent = parent;
    }
}

// 紅黑樹類別
class RBTree {
    // 根節點
    RBNode root;

    // 新增節點
    void add(int value) {
        // 如果根節點為空，則新增的節點為根節點
        if (root == null) {
            root = new RBNode(value, false, null); // 根節點顏色為黑色
            return;
        }

        RBNode current = root;
        RBNode parent = null;

        // 找到新節點的父節點
        while (current != null) {
            parent = current;
            if (value < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
        }

        // 建立新節點
        RBNode newNode = new RBNode(value, true, parent); // 新節點顏色為紅色
        if (value < parent.value) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }

    }
}
