public class Main {
    public static void main(String[] args) {
        /* Liste yapısının çağırılması ve değer atama işleminin yapılması. */
        listStructure liste = new listStructure();
        liste.ekle(11);
        liste.ekle(22);
        liste.ekle(33);
        liste.ekle(44);

        /* Listeleme methodunun çağırılması */
        liste.listele();




//        /* Düğümlerin(Node) oluşturulması. */
//        node A = new node();
//        node B = new node();
//        node C = new node();
//        node D = new node();
//
//        /* Düğümlere yani objelere değer ataması yaptık. */
//        A.data = 11;
//        B.data = 22;
//        C.data = 33;
//        D.data = 44;
//
//        /* Düğümleri birbirlerine bağladık. */
//        A.next = B;
//        B.next = C;
//        C.next = D;
//        D.next = null; // Bir düğümün değeri null ise o düğüm bağlı listenin son elemanıdır.

    }
}