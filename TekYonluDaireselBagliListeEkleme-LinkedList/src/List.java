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
            object.next = head; //Listede bir veya daha fazla eleman varsa uygulanacak kod
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
            Node tempTwo = null;
            // Dairesel bağlı listede listenin sonu ve başı birbirine bağlı olduğundan liste doluysa null ifadesi
            // hiçbir zaman olmayacak. Bu yüzden normal dairesel olmayan listelerdeki gibi null'a kadar aratma yapamıyoruz.
            // Bunun yerine tail(son eleman) e kadar aratma yaparak listedeki eleman sayısının bir eksiğini buluyoruz.
            // Döngüden sonra ise n i bir arttırarak listedeki eleman sayısını doğru bir şekilde bulabiliriz.
            while (temp != tail) { // Dikkat edilmesi gereken bir yer normalde null ifadesine eşit mi diye kontrol ediyorduk burada ise tail'e eşit mi diye kontrol ediyoruz.
                temp = temp.next;
                n++;
            }
            n++; // While da taile girmediğinden son düğümü ancak n'i bir arttırarak bulabiliriz.
            if (index >= n) { // Girilen index değeri liste uzunluğundan büyükse eklenecek data listenin sonuna yerleştirilir.
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
    void deleteHead() {
        if (head == null) {
            System.out.println("list is empty");
        } else if (head == tail) { // Listede tek bir eleman varsa silinmesi için uygulanan algoritma
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
    }
    void deleteTail() {
        if (head == null) {
            System.out.println("list is empty");
        } else if (head == tail) { // Listede tek bir eleman varsa silinmesi için uygulanan algoritma
            head = null;
            tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) { // temp listede tail e ulaşana kadar dolaşır
                temp = temp.next;
            }
            tail = temp; // burada tail temp sayesinde kendinden bir önceki elemana geçerek o elemanı tail yapar. Bu sayede son eleman silinir ve bir önceki eleman tail olur.
            tail.next = head; // yeni tail de head e bağlanır.
        }
    }
    void deleteBetween() {
        if (head == null) {
            System.out.println("list is empty");
        } else if (head == tail) { // Listede tek bir eleman varsa silinmesi için uygulanan algoritma
            head = null;
            tail = null;
        } else {
            int index, n = 0;
            System.out.print("İndex: ");
            index = scanner.nextInt();
            scanner.nextLine();
            Node temp = head;
            Node tempTwo = temp;
            while (temp != tail) {
                temp = temp.next;
                n++;
            }
            n++;
            temp = head;
            int i = 0;
            while (i < index) {
                tempTwo = temp;
                temp = temp.next;
                i++;
            }
            tempTwo.next = temp.next;
        }
    }
    void listing() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            System.out.print("head -> ");
            while (temp != tail) { // Dairesel olmayan listelerde null olana kadar aratıyorduk buradaki fark tail olana kadar.
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data + " -> tail");
        }
    }

}
