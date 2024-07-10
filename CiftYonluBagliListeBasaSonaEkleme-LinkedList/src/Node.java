public class Node {
    int data;
    Node next; // Sonrakini gösterir
    Node prev; // Öncekini gösterir

    public Node(int data) { // Method çağırıldığında data sı da isteniyor. Bununla birlikte next ve prevleri de null olarak geliyor.
        this.data = data;
        next = null;
        prev = null;
    }
}
