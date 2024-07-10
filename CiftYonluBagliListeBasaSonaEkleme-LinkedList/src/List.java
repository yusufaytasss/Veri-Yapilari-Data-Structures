public class List {
    Node head = null;
    Node tail = null;
    void addHead(int data) {
        Node object = new Node(data);
        if (head == null) {
            head = object;
            tail = object;
        } else {
            object.next = head; // Object.next ile head'in önüne eleman ekleniyor. Ardından head.prev ile object gösteriliyor bu sayede listede eleman varsa head'in önüne ekleniyor.
            head.prev = object;
            head = object; // Yeni head artık objectin değeri
        }
    }
    void addTail(int data) {
        Node object = new Node(data);
        if (head == null) {
            head = object;
            tail = object;
        } else {
            tail.next = object; // tail.next ile tail den sonra object elemanını ekliyoruz.
            object.prev = tail; // object.prev ile de objenin bir önceki elemanı tail olarak veriliyor
            tail = object; // En sonunda ise tail'i objeye eşitliyoruz.
        }
    }
    void listingHead() { // Baştan sonra kadar listeler
        Node temp = head;
        System.out.print("head -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(" tail");
    }
    void listingTail() { // Sondan başa doğru listeler
        Node temp = tail;
        System.out.print("tail -> ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.prev; // Next'e değil artık prev e gidecek.
        }
        System.out.println(" head");
    }
}
