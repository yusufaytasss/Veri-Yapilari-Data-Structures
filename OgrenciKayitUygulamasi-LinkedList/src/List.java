import java.util.Scanner;

public class List {
    Nodes head = null; // İlk değer ve son değeri tutan elemanlara başta null tanımlıyoruz.
    Nodes tail = null;
    Nodes temp = null;
    Nodes temp2 = null;

    int number;
    String Name;
    String LastName;
    int visa;
    int fınal;
    double average;
    String situation;

    Scanner scanner = new Scanner(System.in);

    /* Öğrenci bilgilerinin alınması */
    void Ekle(){
        System.out.println("Computer Science Students Info: ");
        System.out.println("Number: ");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name: ");
        Name = scanner.nextLine();
        System.out.println("Last Name: ");
        LastName = scanner.nextLine();
        System.out.println("Visa Notes: ");
        visa = scanner.nextInt();
        System.out.println("Final Notes: ");
        fınal = scanner.nextInt();

        /* Alınan değerler "work" elemanına eklendi. */
        Nodes work = new Nodes(number, Name, LastName, visa, fınal);

        if (head == null) {
            head = work;
            tail = work;
            System.out.println("İlk öğrencinin kaydı eklendi.");
        }
        else {
            work.next = head;
            head = work;
            System.out.println(number + " Numaraları öğrenci kayıt edildi.");
        }

    }

    void  Sil() {
        if (head == null){
            System.out.println("Liste boş, silinecek öğrenci yok.");
        }
        else {
            System.out.println("Silmek istediğiniz öğrencinin numarasını giriniz: ");
            number = scanner.nextInt();

            if (number == head.number && head.next == null) {
                head = null;
                tail = null;
                System.out.println(number + " Numaralı öğrenci silindi, listede kayıtlı öğrenci kalmadı.");
            }
            /* Listenin en başındaki elemanı silme koşulu. */
            else if (number == head.number && head.next != null) {
                head = head.next;
                System.out.println(number + " Numaralı öğrenci silindi.");
            }
            else {
                temp = head;
                temp2 = head;
                while (temp.next != null) {
                    if (number == temp.number){
                        temp2.next = temp.next;
                        System.out.println(number + " Numaralı öğrenci silindi.");
                    }
                    temp2 = temp;
                    temp = temp.next;
                }
                if (number == temp.number){
                    temp2.next = null;
                    tail = temp2;
                    System.out.println(number + " Numaralı öğrenci silindi.");
                }
            }
        }
    }

    void Yazdir() {
        if (head == null) {
            System.out.println("Liste Boş!");
        }
        else {
            temp = head;
            while (temp != null){
                System.out.println(temp.number + " Numaralı öğrenci bilgileri");
                System.out.println("********************************");
                System.out.println("Ad         : " + temp.Name);
                System.out.println("Soyad      : " + temp.LastName);
                System.out.println("Vize Notu  : " + temp.visa);
                System.out.println("Final Notu : " + temp.fınal);
                System.out.println("Ortalama   : " + temp.average);
                System.out.println("Durum      : " + temp.situation);
                System.out.println("********************************");
                temp = temp.next;
            }
        }
    }

    void EnBasariliOgrenci() {
        if (head == null) {
            System.out.println("Liste Boş!");
        }
        else {
            temp = head;
            double big = temp.average;
            while (temp != null){
                if (big < temp.average) {
                    big = temp.average;
                    number = temp.number;
                    Name = temp.Name;
                    LastName = temp.LastName;
                    visa = temp.visa;
                    fınal = temp.fınal;
                    average = temp.average;
                    situation = temp.situation;
                }
                temp = temp.next;
            }
            System.out.println("En başarılı öğrenci bilgileri");
            System.out.println("********************************");
            System.out.println("Ad         : " + Name);
            System.out.println("Soyad      : " + LastName);
            System.out.println("Vize Notu  : " + visa);
            System.out.println("Final Notu : " + fınal);
            System.out.println("Ortalama   : " + average);
            System.out.println("Durum      : " + situation);
            System.out.println("********************************");
        }
    }

}
