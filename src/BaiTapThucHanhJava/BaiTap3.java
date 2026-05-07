package BaiTapThucHanhJava;

//Lập trình hàm kiểm tra số nguyên n có là số nguyên tố hay không

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        boolean isPrime = true;

        System.out.print("Nhap so nguyen n: ");
        n = scanner.nextInt();

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }

        scanner.close();
    }
}
