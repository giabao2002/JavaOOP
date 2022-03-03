public class Student {
    String name;
    int age;
    int score;

    Student() {

    }

    Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Student student = new Student("Le Huu Trung", 21, 10);
        // Student student("Le Huu Trung", 21, 10);
        student.display();
    }
}
