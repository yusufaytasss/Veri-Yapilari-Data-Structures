public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 4);
        tree.root = tree.insert(tree.root, 8);
        tree.root = tree.insert(tree.root, 12);

        tree.root = tree.delete(tree.root, 4);
        System.out.println("\nSilme işleminden sonra:");
        tree.inOrder(tree.root);
    }
}