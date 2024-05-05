public class Main {
    public static void main(String[] args) {
        /* Oluşturulan nesnelerin birbirleriyle bağlantıları bulunmamakta */
        sinif nesne1 = new sinif();
        sinif nesne2 = new sinif();
        sinif nesne3 = new sinif();

        /* Oluşturulan nesnelere(düğümlere) değer atamasının yapılması */
        nesne1.sayi = 11;
        nesne2.sayi = 22;
        nesne3.sayi = 33;

        /* Nesneler içerisindeki verilere(değerlere) erişme */
        System.out.println(nesne1.sayi);
        System.out.println(nesne2.sayi);
        System.out.println(nesne3.sayi);

        /*---------------------------------------------------------*/

        /* Düğümler arasında bağlama işlemi */
        nesne1.next = nesne2;
        nesne2.next = nesne3;
        nesne3.next = null; // nesne3 herhangi bir düğüm göstermemekte. null olarak kalıyor.

        sinif temp = nesne1; // Geçici bir değişken tanımlıyoruz. Başlangıç değeri 'nesne1' olan.

        while(temp != null) // temp null değerini bulana kadar koşul sağlansın.
        {
            System.out.println(temp.sayi); // yazdırma işlemi.
            temp = temp.next; // yazdırma işlemi bittikten sonra temp'in sonraki değere(aslında sonraki düğüme) geçmesini sağlar.
        }
    }
}