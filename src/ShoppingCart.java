import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        //Shopping Cart

        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        String currency = "VNĐ";
        double total;

        System.out.print("Bạn muốn mua gì: ");
        item = scanner.nextLine();

        System.out.print("Giá bao nhiêu: ");
        price = scanner.nextDouble();

        System.out.print("Số lượng bao nhiêu: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("Bạn đã mua " + quantity + " " + item );
        System.out.println("Số tiền thanh toán: " + total + currency);

        scanner.close();
    }
}
