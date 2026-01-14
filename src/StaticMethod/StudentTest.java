package StaticMethod;

public class StudentTest {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1, "Mambo");
        Student s2 = new Student(2, "Hachimi");

        s1.display();
        s2.display();
    }
}
