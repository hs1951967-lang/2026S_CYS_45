import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,3,6,32,78,6,54,9,8,12};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start number: ");
        int s = sc.nextInt();
        System.out.print("Enter End number: ");
        int a = sc.nextInt();
        System.out.print("Enter incriment number: ");
        int b = sc.nextInt();
        for(int i = s;i < a;i+= b) {
            System.out.println(arr[i]);
        }
    }
}
