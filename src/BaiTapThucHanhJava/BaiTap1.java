package BaiTapThucHanhJava;
//Lập trình tính tổng 1 + 2 + .... + n

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.print("Nhap so nguyen n: ");
        n = scanner.nextInt();

        if (n < 1) {
            System.out.println("Nhap sai! Vui long  nhap lai.");
            System.exit(0);
        }
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Tong cac so nguyen tu 1 den " + n + " la: " + sum);

        scanner.close();

    }
}
