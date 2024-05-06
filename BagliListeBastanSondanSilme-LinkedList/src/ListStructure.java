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

    void ArayaEkle(int indis, int x){
        Node eleman = new Node();
        eleman.data = x;

        if (head == null && indis == 0) {
            eleman.next = null;
            head = eleman; /* İlk eleman ekleme işlemi yapılmıştır. */
            tail = eleman;
            System.out.println("Liste yapısı oluşturuldu, ilk eleman eklendi.");
        }
        else if (head != null && indis == 0){
            eleman.next = head;
            head = eleman;
            System.out.println(indis + " İndisinci sıraya yeni eleman eklendi.");
        }
        else {
            int n = 0;
            Node temp = head;
            Node temp2 = head; // Son elemanı tutması için oluşturduk

            /* Eleman sayısını bulma. Mantık listeledekiyle aynı çalışıyor ancak burada tanımladığımız n değişkeni bize kaç adet değişken olduğunu veriyor. */
            while (temp.next != null) {
                n++;
                temp2 = temp; // Son elemanı burada yakalıyoruz.
                temp = temp.next;
            }

            if (n == indis) {
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println("Eleman eklendi!");
            }

            else {
                temp = head;
                temp2 = head;
                int i = 0;
                while(i != indis) {
                    temp2 = temp;
                    temp = temp.next;
                    i++;
                }
                temp2.next = eleman;
                eleman.next = temp;
                System.out.println(indis + " İndisinci sıraya yeni eleman eklendi.");
            }
        }
    }

    void BastanSil(){
        /* Liste boş mu kontrol ediyor. */
        if (head == null) {
            System.out.println("Liste Boş, Silinecek Nesene Yok!");
        }
        /* Listede tek düğüm(node) olma durumunu kontrol eder. Tek düğüm varsa onu siler. */
        else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listedeki son eleman silindi.");
        }
        else {
            head = head.next;
            System.out.println("Baştaki eleman silindi.");
        }
    }

    void SondanSil() {
        /* Liste boş mu kontrol ediyor. */
        if (head == null) {
            System.out.println("Liste Boş, Silinecek Nesene Yok!");
        }
        /* Listede tek düğüm(node) olma durumunu kontrol eder. Tek düğüm varsa onu siler. */
        else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Listedeki son eleman silindi.");
        } else {
            Node temp = head;
            Node temp2 = head;

            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }
            temp2.next = null;
            tail = temp2;
            System.out.println("Sondan eleman silindi.");
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
