public class Tree {
    Node root = null;

    Node createNewNode(int data) {
        root = new Node(data);
        return root;
    }
    Node insert(Node root, int data) {
        if (root != null) {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        } else {
            root = createNewNode(data);
        }
        return root;
    }
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    Node delete(Node root, int data) {
        Node temp, tempTwo;
        if (root == null) {
            return null;
        } else if (root.data == data) {
            if (root.left == root.right) { // Left ve Right birbirine eşit ise her ikisi de boştur.
                root = null;
                return null;
            } else if (root.left == null) {
                temp = root.right;
                return temp ;
            } else if (root.right == null) {
                temp = root.left;
                return temp ;
            } else { // Silinecek düğümün sağı ve solu dolu ise buradaki işlem gerçekleşir.
                temp = tempTwo = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                temp.left = root.left;
                return tempTwo;
            }
        } else {
            if (data < root.data) {
                root.left = delete(root.left, data); // Recursive bir yapı, fonksiyon tekrar tekrar çağırılıyor.
            } else {
                root.right = delete(root.right, data);
            }
        }
        return root;
    }
}
