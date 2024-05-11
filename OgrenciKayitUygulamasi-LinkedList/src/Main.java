import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secim = -1;
        List ComSciense = new List();
        Scanner scanner = new Scanner(System.in);

        while (secim != 0) {
            System.out.println();
            System.out.println("Bilgisayar bilimi öğrenci kayıt uygulaması.");
            System.out.println("1-Yeni Kayıt");
            System.out.println("2-Kayıt Sil");
            System.out.println("3-Kayıtları Listele");
            System.out.println("4-En Başarılı Öğrenci");
            System.out.println("0-Çıkış");
            System.out.print("Seciminiz: ");

            secim = scanner.nextInt();
            if (secim == 1) {
                ComSciense.Ekle();
            } else if (secim == 2) {
                ComSciense.Sil();
            } else if (secim == 3) {
                ComSciense.Yazdir();
            } else if (secim == 4) {
                ComSciense.EnBasariliOgrenci();
            } else if (secim == 0) {
                System.out.println("Program Sonlandırılıyor...");
            } else {
                System.out.println("Hatalı Seçim Yaptınız.");
            }

        }
    }
}