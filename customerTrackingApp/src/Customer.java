public class Customer { // Çift yönlü doğrusal bağlı liste yapısı mevcut.
    int id;
    String name;
    String lastName;
    String phoneNumber;
    String address;
    String product;
    Customer next;
    Customer prev;

    public Customer(int id, String name, String lastName, String phoneNumber, String address, String product) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.product = product;
        next = null;
        prev = null;
    }
}
