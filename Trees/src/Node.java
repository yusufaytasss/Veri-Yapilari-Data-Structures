public class Node {
    int data; // Her düğüm için bir veriye ihtiyacımız var.
    Node left; // Düğümün sağ ve sol olmak üzere iki tane göstericisi olmalı.
    Node right;

    public Node(int data) { // Node class'ı çağırıldığında datasının da mecburi olarak atanması gerekiyor.
        this.data = data;
        left = null; // Default olarak düğümün sağ ve sol göstericileri null olarak atanıyor.
        right = null;
    }
}
