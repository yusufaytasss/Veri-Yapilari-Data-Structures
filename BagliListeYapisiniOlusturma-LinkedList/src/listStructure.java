public class listStructure {
    /* Bu sınıfı açmamızın sebebi önceki bölümde yaptığımız düğümleri birbirine bağlama işleminde her düğüm aslında bellekte farklı bir yerdeydi. Liste yapısı ile bütün düğümleri tek bir yerde toplamayı amaçlıyoruz. */
    node head = null; // Başlangıç düğümü
    node tail = null; // Son düğüm

    void ekle(int x){
        node eleman = new node(); // Eklenecek olan düğüm(obje)
        eleman.data = x;
        eleman.next = null;

        if (head == null){
            head = eleman; // Burada head ve tail'a aynı değerin eklenmesinin sebebi listeye ilk defa eleman ekleniyor.
            tail = eleman;
            System.out.println("Liste oluşturuldu ve ilk düğüm eklendi.");
        }
        else {
            tail.next = eleman; // Son elemanın sonrasına yeni eleman ekleniyor.
            tail = eleman; // Yeni eleman eklendikten sonra tail artık yeni elemana eşit oluyor.
            System.out.println("Listenin sonuna yeni eleman eklendi");
        }
    }

    void listele() {
        if (head == null){ System.out.println("Liste Boş!"); } // Listeleme işleminde listenin boş olduğu durumdaki mesaj
        else {
            node temp = head;
            System.out.print("Bas -> ");
            while(temp!= null){
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
            System.out.println("<- Son");
        }
    }
}
