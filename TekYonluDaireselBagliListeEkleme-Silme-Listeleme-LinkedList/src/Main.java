import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        Scanner scanner = new Scanner(System.in);
        int result = -1;
        while (result != 0) {
            System.out.println("1- Add Head");
            System.out.println("2- Add Tail");
            System.out.println("3- Add Between");
            System.out.println("4- Delete Head");
            System.out.println("5- Delete Tail");
            System.out.println("6- Delete Between");
            System.out.println("0- Exit");
            System.out.print("Your choice: ");
            result = scanner.nextInt();
            scanner.nextLine();
            switch (result) {
                case 1:
                    list.addHead();
                    break;
                case 2:
                    list.addTail();
                    break;
                case 3:
                    list.addBetween();
                    break;
                case 4:
                    list.deleteHead();
                    break;
                case 5:
                    list.deleteTail();
                    break;
                case 6:
                    list.deleteBetween();
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Wrong choice! [0-6]");
                    break;
            }
            list.listing();
        }
    }
}