class inf{
    String name;
    int age;
    long cnic;
}
public class Task4 {
    public static void main(String[] args) {
        inf i1 = new inf();
        i1.name="Muhammad Hamza Shafiq";
        i1.age=19;
        i1.cnic=3660201234567l;

        System.out.println("Name: "+i1.name);
        System.out.println("Age: "+i1.age);
        System.out.println("CNIC: "+i1.cnic);
    }
}