class student{
    String name="Hamza";


}
class Teacher{
    void teach(student s1){
        System.out.println(s1.name);
    }
}
public class Task1 {
    public static void main(String[] args) {
        student s = new student();
        Teacher t = new Teacher();
        t.teach(s);
    }
}