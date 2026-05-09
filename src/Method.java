public class Method {
    public static void main(String[] args) {
//        String name = "Khang";
//        int age = 20;
//
//        happyBirthday(name, age);
//        double result = cube(3);
//        System.out.println(result);

//        String fullName = getFullName("Nguyên Thái", "Khang");
//        System.out.println(fullName);

        int age = 20;
        if(ageCheck(age)){
            System.out.println("You may enter the club");
        }
        else{
            System.out.println("You are too young to enter the club");
        }
    }
    static void happyBirthday(String name, int age){
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Have a nice day!");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static String getFullName(String first, String last){
        return first + " " + last;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}
