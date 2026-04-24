import java.util.Scanner;

public class JavaMath {
    public static void main(String[] args) {

        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        double result;
        // pow là luỹ thừa của số a
        result = Math.pow(2, 5);
        // 2 mũ 5 bằng 32

        //trị tuyệt đối
        result = Math.abs(-36);

        //căn bậc 2
        result = Math.sqrt(9);

        //làm tròn theo điều kiện < hoặc > 0.5
        result = Math.round(3.6);
        //làm tròn lên
        result = Math.ceil(3.1);
        //làm tròn xuống
        result = Math.floor(3.9);

        //tìm số lớn nhất
        result = Math.max(3, 6);
        //tìm số nhỏ nhất
        result = Math.min(3, 6);

//        System.out.println(result);

        Scanner scanner = new Scanner(System.in);

        //bài toán tính cạnh huyền tam giác
//        double a;
//        double b;
//        double c;
//
//        System.out.print("Nhap do dai canh a: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Nhap do dai canh b: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//
//        System.out.println("Do dai canh c la: " + c + " cm");

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * radius * radius;
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The area of the circumference is: " + circumference + " cm");
        System.out.println("The area of the volume is: " + area + " cm vuong");
        System.out.println("The area of the volume is: " + volume + " cm");

        scanner.close();
    }
}
