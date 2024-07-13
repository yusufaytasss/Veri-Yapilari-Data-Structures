public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 8);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 9);

        System.out.print("preOrder      : ");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.print("inOrder       : ");
        tree.inOrder(tree.root);
        System.out.println();
        System.out.print("postOrder     : ");
        tree.postOrder(tree.root);

        System.out.println("\nTree height   : " + tree.height(tree.root));
        System.out.println("Tree size     :" + tree.size(tree.root));
    }
}