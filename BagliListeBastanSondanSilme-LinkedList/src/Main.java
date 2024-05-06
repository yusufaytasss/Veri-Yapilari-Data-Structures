public class Main {
    public static void main(String[] args) {
        ListStructure liste = new ListStructure();
        liste.basaEkle(10);
        liste.basaEkle(20);
        liste.basaEkle(30);
        liste.basaEkle(40);
        liste.basaEkle(50);
        liste.basaEkle(60);

        liste.BastanSil();
        liste.SondanSil();
        liste.listele();
    }
}