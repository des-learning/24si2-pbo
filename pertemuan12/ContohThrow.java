import java.util.Scanner;

public class ContohThrow {
   public static void main(String []args) {
        InputAngka input = new InputAngka(1, 100);

        try { 
            int in = input.bacaInput("Input nilai 1-100: ");
            System.out.println("Nilai yang diinput: " + in);
        } catch (Exception e) {
            System.err.println("terjadi kesalahan");
        }
    }
}

class InputAngka {
    private int min, max;
    private Scanner input;

    public InputAngka(int min, int max) {
        this.min = min;
        this.max = max;
        this.input = new Scanner(System.in);
    }

    public int bacaInput(String prompt) {
        System.out.print(prompt);
        int in = input.nextInt();
        if (in < min || in > max) {
            // throw new IllegalArgumentException("Nilai harus di antara " + min + " dan " + max);
            throw new InvalidNilaiException("Nilai harus di antara " + min + " dan " + max);
        }

        return in;
    }
}

class InvalidNilaiException extends RuntimeException {
    public InvalidNilaiException(String message) {
        super(message);
    }
}