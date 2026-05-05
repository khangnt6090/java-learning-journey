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

import java.util.Scanner;

public class ThucHanh1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String SinhVien;
        double DiemToan;
        double DiemLy;
        double DiemHoa;
        double tinhDiemTB;
        String XepLoai;

        System.out.print("Nhập tên sinh viên: ");
        SinhVien = scanner.nextLine();

        System.out.print("Nhập điểm toán: ");
        DiemToan = scanner.nextDouble();

        System.out.print("Nhập điểm lý: ");
        DiemLy = scanner.nextDouble();

        System.out.print("Nhập điểm hoá: ");
        DiemHoa = scanner.nextDouble();

        tinhDiemTB = (DiemToan + DiemLy + DiemHoa) / 3;

        if (tinhDiemTB >= 8){
            XepLoai = "Giỏi";
        }
        else if (tinhDiemTB >= 6.5 ){
            XepLoai = "Khá";
        }
        else if (tinhDiemTB >= 5) {
            XepLoai = "Trung bình";
        }
        else {
            XepLoai = "Yếu";
        }

        System.out.println("Tên: " + SinhVien);
        System.out.println("Điểm TB: " + tinhDiemTB);
        System.out.println("Xếp loại: " + XepLoai);

        scanner.close();
    }
}
