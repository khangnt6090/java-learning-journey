public class JavaVariables {
    public static void main(String[] args){
        // int là dành cho các số nguyên
        int age = 20;
        int year = 2026;
        int quantity = 1;
        System.out.println("Bây giờ là năm " + year);

        // double là dành cho các số có . sau nó nhưng chỉ một .
        double gia_tien = 19.99;
        double gpa = 3.1;
        double nhiet_do = 29.5;
        System.out.println("$"+gia_tien);

        // char là kí tự
        char grade = 'A';
        char symbol = '!';
        char currency = '$';
        System.out.println(grade);

        // boolean là True or False
        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;
        System.out.println(isStudent);

        if(isStudent){
            System.out.println("Bạn là học sinh!");
        }
        else{
            System.out.println("Bạn không phải là học sinh!");
        }

        // string
        String name = "Khang";
        String food = "cơm tấm sườn nướng";
        String email = "noobvnkhang@gmail.com";
        String car = "BMW";
        String color = "Black";
        System.out.println(name + " rất thích " + food);
        System.out.println("Email của "+name+" là "+email);
        System.out.println("Xin chào "+name);
        System.out.println("Bạn "+age+" tuổi!");
        System.out.println("GPA của bạn là "+gpa);
        System.out.println("Xếp hạng của bạn là: "+grade);
        System.out.println("Lựa chọn của bạn là "+color+" "+car+" "+year +" với mức giá "+gia_tien);

        if(forSale){
            System.out.println("Xe "+ car+" này vẫn còn đang bán");
        }
        else{
            System.out.println("Xe "+car+" này đã cháy hàng");
        }


    }
}
