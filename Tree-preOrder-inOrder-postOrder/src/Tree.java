public class Tree {
    Node root = null;
    Node createNewNode(int data) { // Yeni düğümün oluşturulduğu yer.
        this.root = new Node(data);
        return this.root;
    }
    Node insert(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = this.insert(root.left, data);
            } else {
                root.right = this.insert(root.right, data);
            }
        } else {
            root = this.createNewNode(data);
        }
        return root;
    }
    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }
    int height(Node root) {
        if (root == null) { // Kök yoksa yükseklik -1 döndürülür.
            return 0;
        } else {
            int left, right = 0;
            left = height(root.left);
            right = height(root.right);
            if (left > right)
                return left + 1;
            else
                return right + 1;
        }
    }
    int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            return size(root.left) + 1 + size(root.right);
        }
    }
}
