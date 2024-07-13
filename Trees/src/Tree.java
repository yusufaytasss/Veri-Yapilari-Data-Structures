public class Tree {
    Node root; // root elemanı bizim ağacımızın ilk düğümüdür. Kök olarak da ifade edilir ve eklenecek her düğüm root elemanına göre belirlenir.
    public Tree() {
        root = null; // Yeni bir ağaç oluşturulduğunda, başlangıçta root null olarak ayarlanır.
    }
    Node createNewNode (int data) {
        root = new Node(data); // Yeni bir Node nesnesi oluşturulur ve root olarak ayarlanır.
        System.out.println(data + " added node to tree!"); // Konsola, eklenen düğümün verisi yazdırılır.
        return root; // Yeni oluşturulan düğüm döndürülür.
    }
    Node insert(Node root, int data) { // Ağaca düğüm ekleme işleminin gerçekleştirildiği kısım.
        if (root != null) { // Ağaç içerisinde düğüm olması durumunda eklenecek olan yeni düğümlerin root dan büyük mü küçük mü olması durumunda sağa veya sola eklenir.
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        } else { // Ağaç içerisi boş ise eklenecek ilk düğüm root olmalıdır.
            root = createNewNode(data); // Root'un eklenmesi durumu.
        }
        return root;
    }
}
