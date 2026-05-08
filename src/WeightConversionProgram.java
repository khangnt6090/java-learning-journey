import java.util.Scanner;

public class WeightConversionProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.println("Chương trình chuyển đổi giữa Kg và Pound");
        System.out.println("1: Kg -> Pound");
        System.out.println("2: Pound -> Kg");

        System.out.println("Lựa chọn của bạn(1/2): ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Nhap số Pound: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("Số kg sẽ là: " + newWeight);
        }
        else if(choice == 2){
            System.out.print("Nhập số Kg: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("Số Pound sẽ là: " + newWeight);
        }
        else{
            System.out.println("Có lỗi!");
        }

        scanner.close();
    }
}
