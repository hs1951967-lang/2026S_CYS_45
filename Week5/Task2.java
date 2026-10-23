class student1{
    String name;

    public student1(String name) {
        this.name = name;
    }

}
class Teacher1{
    void teach(student1 s1){
        System.out.println(s1.name);
    }
}

public class Task2 {
    public static void main(String[] args) {
        student1 s = new student1("Hamza");
        Teacher1 t = new Teacher1();
        t.teach(s);
    }
}