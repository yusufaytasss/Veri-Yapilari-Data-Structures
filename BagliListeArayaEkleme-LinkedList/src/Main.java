public class Main {
    public static void main(String[] args) {
        ListStructure liste = new ListStructure();
        liste.basaEkle(11);
        liste.basaEkle(22);
        liste.basaEkle(5);
        liste.sonaEkle(33);
        liste.sonaEkle(44);
        liste.sonaEkle(55);

        liste.ArayaEkle(3, 25);

        liste.listele();
    }
}