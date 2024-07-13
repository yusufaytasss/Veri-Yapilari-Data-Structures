public class Node {
    int data;
    Node right;
    Node left;

    public Node(int data) { // Constructor oluşturuldu.
        this.data = data;
        this.right = null; // Right ve Left göstericilerine default olarak null atandı.
        this.left = null;
    }
}
