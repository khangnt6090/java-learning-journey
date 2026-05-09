import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException { //throws InterruptedException dùng cho sleep, wait
        //for loop = lặp lại code trong giới hạn, dùng khi mình biết khi nào dừng
        //for(bắt đầu, kết thúc (thường là trước kết thúc 1 bước), số bước nhày
//        for(int i = 0; i < 10; i++){
//           System.out.println(i);
//        }
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Bạn muốn lặp lại bao nhiêu lần: ");
//        int max = scanner.nextInt();
//
//        for(int i = 1; i <= max; i++){
//            System.out.println(i);
//        }

        //Đếm ngược
        System.out.print("Bạn muốn đếm ngược mấy giây: ");
        int start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("Bùm!");

        scanner.close();
    }
}
