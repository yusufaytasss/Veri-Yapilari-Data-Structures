import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List list = new List();

        int choose = 1;
        int number, index;
        Scanner scanner = new Scanner(System.in);

        while (choose != 0) {
            System.out.println("1. Added Head");
            System.out.println("2. Added Tail");
            System.out.println("3. Added Between");
            System.out.println("4. Deleted Head");
            System.out.println("5. Deleted Tail");
            System.out.println("6. Deleted Between");
            System.out.println("0. Exit");
            System.out.print("your choice: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("Number: ");
                    number = scanner.nextInt();
                    list.addToHead(number);
                    break;
                case 2:
                    System.out.print("Number: ");
                    number = scanner.nextInt();
                    list.addToTail(number);
                    break;
                case 3:
                    System.out.print("Number");
                    number = scanner.nextInt();
                    System.out.print("İndex: ");
                    index = scanner.nextInt();
                    list.addToBetween(index, number);
                    break;
                case 4:
                    list.deleteHead();
                    break;
                case 5:
                    list.deleteTail();
                    break;
                case 6:
                    System.out.print("İndex: ");
                    index = scanner.nextInt();
                    list.deleteBetween(index);
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("wrong number entry!");
            }
            list.listing();
        }
    }
}