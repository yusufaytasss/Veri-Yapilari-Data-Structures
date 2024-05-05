public class node {
    int data; // Değerlerin tutulması için tanımlanan bir integer değişken.

    /* Oluşturulan her sınıf(class) için bellekte bir adres açılır. Biz de bu adresi kullanarak düğümleri(node) birbirlerine bağlayacağız. Bu nedenle next işlemi için sınıf adını kullanıyoruz. Çünkü bellekte oluşturulan bölgeye sınıf ismiyle erişim sağlayabiliyoruz. */
    node next;
}
