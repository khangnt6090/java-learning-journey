//chức năng của substring là quét và in ra chữ như trước và sau @ trong email
import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.print("Nhap email cua ban: ");
        email = scanner.nextLine();

        if (email.contains("@")) {
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Khong hop le!");
        }


        scanner.close();
    }
}
