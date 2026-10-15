import java.util.Scanner;

class Student{
    private int roll;
    private String Subject;
    private int marks;

    public Student(int roll, String subject, int marks) {
        this.roll = roll;
        Subject = subject;
        this.marks = marks;
    }
    void display(){
        System.out.println();
        System.out.println("Student Roll Number: " + this.roll);
        System.out.println("Subject: " + this.Subject);
        System.out.println("Marks: " + this.marks);
    }
}
public class Task3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Student number: ");
        int n = input.nextInt();

        Student[] students= new Student[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter Student Roll No : ");
            int roll = input.nextInt();
            System.out.print("Enter Student Subject : ");
            String subject = input.next();
            System.out.print("Enter Marks : ");
            int marks = input.nextInt();
            students[i]= new Student(roll, subject, marks);
            System.out.println();

        }
        System.out.println("----All students are: ----");
        for(int i = 0; i < n; i++){
            students[i].display();
        }
    }
}