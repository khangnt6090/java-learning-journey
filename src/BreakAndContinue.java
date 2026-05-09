public class BreakAndContinue {
    public static void main(String[] args) {

        //break = thoát khỏi loop
        //continue = bỏ qua vòng lặp hiện tại

        //đếm tới 5 là dừng
//        for(int i = 0; i < 10; i++){
//            if(i == 5){
//                break;
//            }
//            System.out.println(i + " ");
//        }

        //bỏ qua thằng 5
        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i + " ");
        }
    }
}
