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
    void addBetween(int index, int data) {
        Node object = new Node(data);
        if (head == null) {
            head = object;
            tail = object;
        } else if(head != null && index == 0) {
            object.next = head;
            head.prev = object;
            head = object;
        }else {
            int n = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                n++;
            }
            temp = head;
            if (index > n) {
                tail.next = object;
                object.prev = tail;
                tail = object;
            } else {
                int i = 0;
                while (i != index) {
                    temp = temp.next;
                    i++;
                }
                object.prev = temp.prev;
                temp.prev.next = object; //Önemli bir yer
                object.next = temp;
                temp.prev = object;
                
            }
        }
    }
    void deleteHead(){
        if (head != null) { // Listede eleman varsa;
            if (head.next == null) { // Listede tek bir eleman varsa koşulu;
                head = null;
                tail = null;
            } else { // Listenin başındaki elemanı silme;
                head = head.next;
                head.prev = null;
            }
        }
    }
    void deleteTail() {
        if (head != null) {
            if (head.next == null) { // Listedeki tek bir elemanı silme işlemi 'deleteTail' için de geçerli.
                head = null;
                tail = null;
            } else { // Listenin sonundaki elemanı silme;
                tail = tail.prev;
                tail.next = null;
            }
        }
    }
    void deleteBetween(int index) {
        if (head != null) {
            if (head.next == null && index == 0) { // Listede tek bir eleman varsa ve indis numarası da 0 olarak verildiyse o elemanı siler.
                head = null;
                tail = null;
            } else if (head.next != null && index <= 0) { // Listenin başındaki elemanı silip arkasındaki elemanı listenin başına getiriyoruz
                head = head.next;
                head.prev = null;
            } else {
                int n = 0;
                Node temp = head;
                while (temp != null) {
                    n++;
                    temp = temp.next;
                } if (index >= n - 1) { // Tail silinmek istenirse n'in tuttuğu liste uzunluğu ile silme işlemi gerçekleştiriyoruz.
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp = head;
                    int i = 0;
                    while (i < index) {
                        i++;
                        temp = temp.next;
                    }
                    temp.next.prev = temp.prev; // Çift yönlüde silme işleminin en önemli noktası. 
                    temp.prev.next = temp.next;
                }
            }
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
