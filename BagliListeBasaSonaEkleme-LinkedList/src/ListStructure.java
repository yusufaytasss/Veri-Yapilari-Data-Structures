public class ListStructure {
    Node head = null;
    Node tail = null;

    void basaEkle(int x){
        Node eleman = new Node(); // Eklenecek eleman
        eleman.data = x;

        if (head == null) {
            eleman.next = null;
            head = eleman; /* İlk eleman ekleme işlemi yapılmıştır. */
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi.");
        }
        else {
            eleman.next = head;
            head = eleman;
            System.out.println("Başa eleman eklendi.");
        }
    }

    void sonaEkle(int x){
        Node eleman = new Node();
        eleman.data = x;

        if (head == null) {
            eleman.next = null;
            head = eleman; /* İlk eleman ekleme işlemi yapılmıştır. */
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi.");
        }
        else {
            tail.next = eleman; // Ekleme yapıldı.
            tail = eleman; // İsim güncellendi.
            System.out.println("Sona eleman eklendi.");
        }
    }

    void listele(){

        if (head == null) {
            System.out.println("Liste yapısı boş !!");
        }
        else {
            Node temp = head;
            System.out.print("Bas -> ");
            while(temp != null){
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
            System.out.println("<- Son");
        }
    }
}
