package BaiTapThucHanhJava;

//Lập trình tính n!

import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n;
        int factorial = 1;

        System.out.print("Nhap so nguyen n: ");
        n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Nhap sai! Vui long nhap lai.");
            System.exit(0);
        }
        else{
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("N! = " + factorial);
        }
        scanner.close();
    }
}
