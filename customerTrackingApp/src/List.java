import java.util.Scanner;

public class List {
    Customer head = null;
    Customer tail = null;
    Scanner scanner = new Scanner(System.in);
    int id;
    String name;
    String lastName;
    String phoneNumber;
    String address;
    String product;

    void add() {
        System.out.println("Enter Customer İnformation");
        System.out.print("id            : "); id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("name          : "); name = scanner.nextLine();
        System.out.print("last name     : "); lastName = scanner.nextLine();
        System.out.print("phone number  : "); phoneNumber = scanner.nextLine();
        System.out.print("address       : "); address = scanner.nextLine();
        System.out.print("product       : "); product = scanner.nextLine();

        Customer object = new Customer(id, name, lastName, phoneNumber, address, product);

        if (head == null) {
            head = object;
            tail = object;
            System.out.println("list created and first customer added!");
        } else {
            object.next = head;
            head.prev = object;
            System.out.println(id + ". customer number added");
        }
    }
    void delete() {
        boolean result = false;
        if (head == null) {
            System.out.println("list is empty!");
        } else {
            System.out.println("Enter Deleted Customer İnformation");
            System.out.print("id: "); id = scanner.nextInt();
            scanner.nextLine();

            if (head.next == null && head.id == id) {
                head = null;
                tail = null;
                System.out.println(id + ". customer number deleted");
                result = true;
            } else if (head.next != null && head.id == id) {
                head = head.next;
                head.prev = null;
                System.out.println(id + ". customer number deleted");
                result = true;
            } else if (tail.id == id) {
                tail = tail.prev;
                tail.next = null;
                System.out.println(id + ". customer number deleted");
                result = true;
            } else {
                Customer temp = head;
                while (temp != null) {
                    if (temp.id == id) {
                        temp.next.prev = temp.prev;
                        temp.prev.next = temp.next;
                        result = true;
                        break;
                    }
                    temp = temp.next;
                }
            }
            if (!result) {
                System.out.println(id + ": Customer number is not on the list!");
            }
        }
    }
    void update() {
        boolean result = false;
        if (head == null) {
            System.out.println("list is empty!");
        } else {
            System.out.println("Enter Update Customer İnformation");
            System.out.print("id: "); id = scanner.nextInt();
            scanner.nextLine();

            Customer temp = head;
            while (temp != null) {
                if (temp.id == id) {
                    System.out.println(id + ", Customer İnformation");
                    System.out.println("name         : " + temp.name);
                    System.out.println("last name    : " + temp.lastName);
                    System.out.println("phone number : " + temp.phoneNumber);
                    System.out.println("address      : " + temp.address);
                    System.out.println("product      : " + temp.product);

                    System.out.print("Update product information: ");
                    temp.product = scanner.nextLine();
                    System.out.println("product update successful!");
                    result = true;
                    break;
                }
                temp = temp.next;
            }
            if (!result) {
                System.out.println(id + ": Customer number is not on the list!");
            }
        }
    }
    void search() {
        boolean result = false;
        if (head == null) {
            System.out.println("list is empty!");
        } else {
            System.out.println("Search Customer İnformation");
            System.out.print("id: "); id = scanner.nextInt();
            scanner.nextLine();

            Customer temp = head;
            while (temp != null) {
                if (temp.id == id) {
                    System.out.println(id + ", Customer İnformation");
                    System.out.println("name         : " + temp.name);
                    System.out.println("last name    : " + temp.lastName);
                    System.out.println("phone number : " + temp.phoneNumber);
                    System.out.println("address      : " + temp.address);
                    System.out.println("product      : " + temp.product);

                    result = true;
                    break;
                }
                temp = temp.next;
            }
            if (!result) {
                System.out.println(id + ": Customer number is not on the list!");
            }
        }
    }
    void listing() {
        if (head == null) {
            System.out.println("list is empty!");
        } else {
            System.out.println("İd\tname\tlast name\tphone number\taddress\tproduct name\n");

            Customer temp = head;
            while (temp != null) {
                System.out.println(temp.id + "\t" + temp.name + "\t" + temp.lastName + "\t" + temp.phoneNumber + "\t" + temp.address + "\t" + temp.product);
                temp = temp.next;
            }
        }
    }
}
