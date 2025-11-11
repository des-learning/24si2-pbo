import java.util.Scanner;

public class ContohException {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        System.out.print("Input a: ");
        a = input.nextInt();

        try {
            System.out.print("Input b: ");
            b = input.nextInt();

            System.out.println(a + "/" + b + "=" + (a/b));
        } catch (Exception e) {
            System.out.println("Nilai yang diinput salah");
        }
    }
}