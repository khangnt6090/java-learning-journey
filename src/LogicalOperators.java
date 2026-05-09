import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args){
        //&&: AND
        //||: OR
        //!: NOT

//        double temp = -10;
//        boolean isSunny = true;
//
//        if(temp <= 30 && temp >=0 && isSunny){
//            System.out.println("Nhiệt độ khá tốt");
//            System.out.println("Trời nắng!");
//        }
//        else if (temp <= 30  && temp >= 0 && !isSunny) {
//            System.out.println("Nhiệt độ khá tốt");
//            System.out.println("Trời nhiều mây!");
//        }
//        else if (temp > 30 || temp < 0) {
//            System.out.println("Thời tiết xấu!");
//        }

        //tạo username với điều kiện từ 4 đến 12 chữ, không chứa khoảng cách
        Scanner scanner = new Scanner(System.in);
        String username;

        System.out.print("Nhap username: ");
        username = scanner.nextLine();

        if(username.length() >= 4 && username.length() <= 12 && !username.contains(" ")){
            System.out.println("Chào mừng bạn, " + username + "!");
        }
        else {
            System.out.println("Xin vui lòng nhập lại!");
            System.out.println("Nhắc nhở: Tên phải từ 4 đến 12 ký tự và không chứa khoảng cách");
        }
    }
}
