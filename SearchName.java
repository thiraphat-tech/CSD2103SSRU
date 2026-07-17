import java.util.Scanner;

public class SearchName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Somchai", "Suda", "Anan", "Malee", "Krit"};
        boolean found = false;

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}