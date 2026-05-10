package Constructor;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Khang", 20, 3.41);
        Student student2 = new Student("Naruto", 20, 3.5);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        student1.study();
        student2.study();
    }
}
