public class NestedIfStatement {
    public static void main(String[] args) {

        //Gia lap giam gia ve xem phim
        boolean isStudent = true;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                //neu vua la sinh vien vua la senior
                System.out.println("Ban duoc giam gia Senior 20%");
                System.out.println("Ban duoc giam gia sinh vien 10%");
                price *= 0.7;
            }
            else { //chi la sinh vien
                System.out.println("Ban duoc giam gia sinh vien 10%");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){//chi la senior
                System.out.println("Ban duoc giam gia Senior 20%");
                price *= 0.8;
            }
            else {//khong phai doi tuong duoc giam gia
                price *= 1;
            }
        }

        System.out.printf("Gia cua ve xem phim la: $%.2f", price);

    }
}
