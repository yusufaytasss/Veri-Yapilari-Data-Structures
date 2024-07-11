import java.util.Scanner;

public class List {
    Scanner scanner = new Scanner(System.in);
    Node head = null;
    Node tail = null;

    void addHead() {
        int data;
        System.out.print("Data: ");
        data = scanner.nextInt();
        Node object = new Node(data);
        if (head == null) {
            head = object;
            tail = object;
            tail.next = head; // Dairselliği sağlayan kod parçacığı burada
        } else {
            object.next = head;
            head = object;
            tail.next = head;
        }
    }
    void addTail() {
        int data;
        System.out.print("Data: ");
        data = scanner.nextInt();
        Node object = new Node(data);
        if (head == null) {
            head = object;
            tail = object;
            tail.next = head; // Dairsel olmasının kuralı bu kod
        } else {
            tail.next = object;
            tail = object;
            tail.next = head;
        }
    }
    void addBetween() {
        int data, index;
        System.out.print("İndex: ");
        index = scanner.nextInt();
        System.out.print("Data: ");
        data = scanner.nextInt();
        Node object = new Node(data);
        if (head == null) {
            head = object;
            tail = object;
            tail.next = head; // Dairsel olmasının kuralı bu kod
        } else if (index == 0) {
            object.next = head;
            head = object;
            tail.next = head;
        } else {
            int n = 0;
            Node temp = head;
            Node tempTwo = head;
            while (temp != tail) { // Dikkat edilmesi gereken bir yer normalde null ifadesine eşit mi diye kontrol ediyorduk burada ise tail'e eşit mi diye kontrol ediyoruz.
                temp = temp.next;
                n++;
            }
            n++; // While da taile girmediğinden son düğümü ancak n'i bir arttırarak bulabiliriz.
            if (index >= n) {
                tail.next = object;
                tail = object;
                tail.next = head;
            } else {
                temp = head;
                tempTwo = temp;
                int i = 0;
                while (i < index) {
                    i++;
                    tempTwo = temp;
                    temp = temp.next;
                }
                tempTwo.next = object;
                object.next = temp;
            }
        }
    }
    void listing() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            System.out.print("head -> ");
            while (temp != tail) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data + " -> tail");
        }
    }
}
