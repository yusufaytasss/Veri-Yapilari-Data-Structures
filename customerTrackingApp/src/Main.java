import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List list = new List();
        int result = -1;
        while (result != 0) {
            System.out.println("1- Added");
            System.out.println("2- Deleted");
            System.out.println("3- Update");
            System.out.println("4- Customer Search");
            System.out.println("5- Listing");
            System.out.println("0- Exit");
            result = scanner.nextInt();
            scanner.nextLine();
            switch (result) {
                case 1:
                    list.add();
                    break;
                case 2:
                    list.delete();
                    break;
                case 3:
                    list.update();
                    break;
                case 4:
                    list.search();
                    break;
                case 5:
                    list.listing();
                    break;
                case 0:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Wrong Choice [0-5]");
                    break;
            }
        }
    }
}