//Bài tập: Quản lý 1 sinh viên
//        Yêu cầu:
//
//        Viết chương trình Java:
//
//        Nhập:
//        Tên sinh viên
//        Điểm Toán, Lý, Hóa
//        Xử lý:
//        Tính điểm trung bình
//        Xếp loại:
//
//        = 8 → Giỏi
//
//        = 6.5 → Khá
//
//        = 5 → Trung bình
//
//        < 5 → Yếu
//        In kết quả:
//        Tên: ...
//        Điểm TB: ...
//        Xếp loại: ...

//Viết menu cho bài SinhVien:
//
//        1 → nhập thông tin
//        2 → in ra thông tin
//        0 → thoát

import java.util.Scanner;

public class ThucHanh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến bên ngoài để các case đều dùng được
        String ten = "";
        double toan = 0, ly = 0, hoa = 0, trungBinh = 0;
        String xepLoai = "";
        int choice;

        do {
            System.out.println("\n--- MENU QUẢN LÝ ---");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. In ra thông tin & Xếp loại");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Xử lý trôi lệnh

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên sinh viên: ");
                    ten = scanner.nextLine();
                    System.out.print("Nhập điểm Toán: ");
                    toan = scanner.nextDouble();
                    System.out.print("Nhập điểm Lý: ");
                    ly = scanner.nextDouble();
                    System.out.print("Nhập điểm Hóa: ");
                    hoa = scanner.nextDouble();

                    // Tính toán ngay sau khi nhập
                    trungBinh = (toan + ly + hoa) / 3;

                    if (trungBinh >= 8) xepLoai = "Giỏi";
                    else if (trungBinh >= 6.5) xepLoai = "Khá";
                    else if (trungBinh >= 5) xepLoai = "Trung bình";
                    else xepLoai = "Yếu";

                    System.out.println("=> Đã lưu dữ liệu thành công!");
                    break;

                case 2:
                    if (ten.equals("")) {
                        System.out.println("Chưa có dữ liệu! Vui lòng chọn 1 để nhập.");
                    } else {
                        System.out.println("\n--- KẾT QUẢ ---");
                        System.out.println("Tên: " + ten);
                        System.out.printf("Điểm trung bình: %.2f\n", trungBinh);
                        System.out.println("Xếp loại: " + xepLoai);
                    }
                    break;

                case 0:
                    System.out.println("Đang thoát...");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        scanner.close();
    }
}
