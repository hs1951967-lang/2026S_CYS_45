import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your RollNo: ");
        int RollNo= sc.nextInt();
        System.out.println("Your name is: " + name);
        System.out.println("Your RollNo is: " + RollNo);
    }
}