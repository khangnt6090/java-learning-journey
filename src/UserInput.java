import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        System.out.print("Nhap ten cua ban: ");
        String name = scanner.nextLine();

        System.out.print("Nhap tuoi cua ban: ");
        int age = scanner.nextInt();

        System.out.print("GPA cua ban la bao nhieu?: ");
        double gpa = scanner.nextDouble();

        System.out.print("Ban co phai la sinh vien khong? (true/false): ");
        boolean sinhvien = scanner.nextBoolean();

        System.out.println("Xin chao "+name);
        System.out.println("Ban "+age+" tuoi!");
        System.out.println("GPA cua ban la "+ gpa);
        if(sinhvien){
            System.out.println("Ban la sinh vien");
        }
        else{
            System.out.println("Ban khong phai la sinh vien");
        }

        scanner.close();

    }
}
