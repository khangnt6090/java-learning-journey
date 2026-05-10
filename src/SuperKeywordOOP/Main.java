package SuperKeywordOOP;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Nguyễn Thái", "Khang");
        Student student1 = new Student("Nguyễn Thái", "Khang", 3.41);
        Employee employee1 = new Employee("Elon", "Musk", 5000000);

        person1.showName();
        student1.showName();
        student1.showGPA();
        employee1.showSalary();
    }
}
