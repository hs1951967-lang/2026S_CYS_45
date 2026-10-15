class Student2 {
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
public class TASK2 {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Hamza", 19);
        System.out.println("Name: "+s1.getName());
        System.out.println("Age: "+s1.getAge());


    }
}