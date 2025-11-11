import java.util.Scanner;

public class ContohException {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);

        int a, b;
        try {
            System.out.print("Input a: ");
            a = input.nextInt();

            System.out.print("Input b: ");
            b = input.nextInt();

            System.out.println(a + "/" + b + "=" + (a/b));
        } catch (java.util.InputMismatchException e) {
            System.err.println("Nilai yang diinput harus berupa angka");
        } catch (java.lang.ArithmeticException e) {
            System.err.println("Kesalahan melakukan operasi aritmatika: " + e.getMessage());
        } catch (Exception e) {
            if (e.getMessage() != null) {
                System.err.println("Terjadi kesalahan: " + e.getMessage());
            } else {
                System.err.println("Terjadi Kesalahan: " + e.getClass().getName());
            }
        } finally {
            System.out.println("Program selesai");
            input.close();
        }
    }
}