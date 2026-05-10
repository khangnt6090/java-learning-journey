import java.util.Arrays;
public class Array {
    public static void main(String[] args) {

        String[] fruit = {"Apple", "Banana", "Orange", "Mango"};
        //Arrays.sort(fruit); //sắp xếp theo thứ tự chữ cái
        Arrays.fill(fruit, "Coconut");//ghi đè lên tất cả tên trái cây

//        fruit[0] = "Kiwi"; //ghi đè lên fruit trên
//        int numOfFruit = fruit.length; //đếm số trái cây đang có

//        for(int i = 0; i < fruit.length; i++){
//            System.out.println(fruit[i]);
//        }

        //tương tự như trên
        for(String fruits : fruit){
            System.out.println(fruits);
        }

    }
}
