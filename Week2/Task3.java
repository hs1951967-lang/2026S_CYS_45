import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        int totalmin = sc.nextInt();
        int hours = totalmin/60;
        int hour = hours%12;
        int minutes = totalmin%60;
        System.out.println("Total minutes: " + hour + ":" + minutes);
    }
}