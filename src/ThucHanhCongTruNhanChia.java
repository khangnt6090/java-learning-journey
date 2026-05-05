//Yêu cầu:
//
//        Viết chương trình cho phép:
//
//        Nhập:
//        Số thứ nhất (double)
//        Số thứ hai (double)
//        Phép toán (+, -, *, /)
//        Xử lý:
//        Thực hiện phép toán tương ứng
//        In kết quả:
//        Kết quả: ...
//
//        Điều kiện:
//        Dùng Scanner
//        Dùng if-else hoặc switch
//        Xử lý chia cho 0 (bắt buộc)
//        Ví dụ chạy:
//        Nhập số 1: 5
//        Nhập số 2: 2
//        Nhập phép toán (+ - * /): *
//
//        Kết quả: 10
//        Gợi ý (đủ để làm):
//        Biến:
//        double a, b
//        char op
//        Nhập phép toán:
//        op = scanner.next().charAt(0);

import java.util.Scanner;

public class ThucHanhCongTruNhanChia {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        double a;
        double b;
        char op;
        double ketQua;

        System.out.print("Nhap so a: ");
        a = scanner.nextDouble();
        System.out.print("Nhap so b: ");
        b = scanner.nextDouble();
        System.out.print("Nhap phep toan (+, -, *, /): ");
        op = scanner.next().charAt(0);

        if (op == '+') {
            ketQua = a + b;
            System.out.println("Ket qua: " + ketQua);
        }
        else if (op == '-') {
            ketQua = a - b;
            System.out.println("Ket qua: " + ketQua);
        }
        else if (op == '*') {
            ketQua = a * b;
            System.out.println("Ket qua: " + ketQua);
        }
        else if (op == '/') {
            if(b == 0) {
                System.out.print("Khong hop le!");;
            }
            else {
                ketQua = a / b;
                System.out.println("Ket qua: " + ketQua);
            }
        }
        else {
            System.out.print("Khong hop le!");
        }

        scanner.close();
    }
}