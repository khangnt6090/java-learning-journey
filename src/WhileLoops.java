import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){
        //while loop = repeat some code forever while condition is true
        Scanner scanner = new Scanner(System.in);

//        String name = "";
//
//        while(name.isEmpty()){ //nếu không nhập gì thì nó sẽ bắt nhập lại, không như if nếu không nhập thì nó vẫn bỏ qua
//            System.out.print("Please enter your name: ");
//            name = scanner.nextLine();
//        }
//
//        System.out.println("Hello " + name);

//        while(1 == 1){ //nguy hiểm, nó lăp lại mãi mãi gây lag máy
//            System.out.println("Looping forever");
//        }


//        String response = "";
//
//        while(!response.equals("Q")){ //chỉ khi nào nhập q hay Q mới cho thoát
//            System.out.println("Please enter Q to quit");
//            response = scanner.next().toUpperCase();
//        }
//        System.out.println("Goodbye!");


//        int age = 0;
//
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();
//
//        while(age < 0){
//            System.out.println("Age must be positive");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt(); //không có dòng này là loop mãi mãi
//        }
//
//        System.out.println("You are " + age + " years old");

        int number = 0;

        while(number < 1 || number > 10){
            System.out.print("Enter a number between 1 and 10: ");
            number = scanner.nextInt();
        }
        System.out.println("You entered " + number);

        scanner.close();
    }
}
