public class List {
    Node head = null; //Gösterici konumundalar
    Node tail = null;
    void addToHead(int x){
        Node object = new Node();
        object.data = x;
        if (head == null) {
            object.next = null;
            head = object;
            tail = object;
            System.out.println("list created and first node added");
        }else {
            object.next = head;
            head = object;
            System.out.println("node added to head");
        }
    }
    void addToTail(int x){
        Node object = new Node();
        object.data = x;
        if (head == null) {
            object.next = null;
            head = object;
            tail = object;
            System.out.println("list created and first node added");
        }else {
            tail = object;
            tail.next = object;
            System.out.println("added node to the end of the list");
        }
    }
    void addToBetween(int index ,int x){
        Node object = new Node();
        object.data = x;
        if (head == null && index == 0) {
            object.next = null;
            head = object;
            tail = object;
            System.out.println("list created and first node added");
        }else if (head != null && index == 0) {
            object.next = head;
            head = object;
            System.out.println(index + ". node added to head");
        }else {
            int n = 0;
            Node temp = head;
            Node tempTwo = head;
            while(temp.next != null) {
                n++;
                tempTwo = temp;
                temp = temp.next;
            }
            if (n == index){
                tempTwo.next = object;
                object.next = temp;
                System.out.println("node in added");
            }else {
                temp = head;
                tempTwo = head;
                int i = 0;
                while(i != index){
                    tempTwo = temp;
                    temp = temp.next;
                    i++;
                }
                tempTwo.next = object;
                object.next = temp;
                System.out.println(index + ". node added to queue.");
            }
        }
    }
    void  listing(){
        if (head == null){
            System.out.println("List is empty");
        }else {
            Node temp = head;
            System.out.print("head -> ");
            while(temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(" tail.");
        }
    }
    void deleteHead(){
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) { //Listede tek düğüm olduğunda silme için çalışacak kod
            head = null;
            tail = null;
            System.out.println("The last node in the list has also been deleted");
        }else {
            head = head.next;
            System.out.println("first node deleted");
        }
    }
    void deleteTail(){
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) { //Listede tek düğüm olduğunda silme için çalışacak kod
            head = null;
            tail = null;
            System.out.println("The last node in the list has also been deleted");
        }else {
            Node temp = head;
            Node tempTwo = head;
            while (temp.next != null) {
                tempTwo = temp; //Temp2 son elemanın bir öncekisini tutuyor.
                temp = temp.next; //temp son elemana kadar gidiyor.
            }
            tempTwo.next = null; //TempTwo'nun next'ine null denildiğinde otamatikmen temp silinmiş olur çünkü aradaki bağlantı kopartılmıştır.
            tail = tempTwo;
            System.out.println("trailing node deleted");
        }
    }
    void deleteBetween(int index){
        if (head == null) {
            System.out.println("list is empty");
        } else if (head.next == null && index == 0) { // Listede tek düğümün silinmesi işlemi
            head = null;
            tail = null;
            System.out.println("The last node in the list has also been deleted");
        } else if (head.next != null && index == 0) {
            head = head.next;
            System.out.println("first node deleted");
        } else {
            int i = 0;
            Node temp = head;
            Node tempTwo = head;
            while (temp != null) {
                i++;
                tempTwo = temp;
                temp = temp.next;
            }
            if (i == index) {
                tempTwo.next = null;
                tail = tempTwo;
                System.out.println("trailing node deleted");
            }else {
                temp = head;
                tempTwo = head;
                int j = 0;
                while (j != index){
                    tempTwo = temp;
                    temp = temp.next;
                    j++;
                }
                tempTwo.next = temp.next;
                System.out.println("Between node deleted");
            }
        }
    }
}
