import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.print("Nhập nhiệt độ: ");
        temp = scanner.nextDouble();

        System.out.print("Chuyển đổi sang độ C hay F? (C/F): ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 5/9) + 32;

        System.out.printf("Nhiệt độ sau khu đổi: %.1f°%s", newTemp, unit);
        scanner.close();
    }
}
