public class TernaryOperator {
    public static void main(String[] args) {
        //Ternary Operator là toán tử 3 ngôi
        //variable = (Điều kiện) ? Iftrue : Iffalse

        int score = 75;
        String grade = (score >= 90) ? "A" : "B";
        System.out.println(grade);

        int number = 10;
        String message = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(message);

        int hour = 10;
        String time = (hour < 12) ? "AM" : "PM";
        System.out.println(time);

        int income = 8000000;
        double tax = (income >= 15000000) ? 0.1 : 0;
        System.out.println(tax);
    }
}
