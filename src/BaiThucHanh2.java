//Yêu cầu:
//
//Viết chương trình Java:
//
//Nhập:
//Một số nguyên n
//Xử lý:
//Nếu n chia hết cho 2 → số chẵn
//Ngược lại → số lẻ
//In ra:
//So chan
//
//hoặc
//
//So le
//Nâng cao: kiểm tra số đó có dương hay không?
import java.util.Scanner;

public class BaiThucHanh2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Nhap so nguyen n: ");
        n = scanner.nextInt();

        if (n % 2 == 0) {
            if (n > 0) {
                System.out.println("So chan va duong");
            }
            else{
                System.out.println("So chan va am");
            }
        }
        else{
            if (n > 0) {
                System.out.println("So le va duong");
            }
            else{
                System.out.println("So le va am");
            }
        }

        scanner.close();
    }
}

//code chuẩn:
//String chanLe;
//String dau;
//
//if (n % 2 == 0) chanLe = "So chan";
//        else chanLe = "So le";
//
//        if (n > 0) dau = "duong";
//        else if (n < 0) dau = "am";
//        else dau = "khong duong khong am";
//
//        System.out.println(chanLe + " va " + dau);
