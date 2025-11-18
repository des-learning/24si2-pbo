import java.util.Scanner;

public class PaymentProcessor {
    // factory
    public Payment createPayment(String paymentType) {
        if (paymentType.equals("cash")) {
            return new CashPayment();
        }
        if (paymentType.equals("credit")) {
            return new CreditCardPayment();
        }

        throw new IllegalArgumentException("invalid payment type: " + paymentType);
    }

    //client
    public static void main(String []args) {
        //Payment p = new PaymentProcessor().createPayment("cash");
        Payment p = new PaymentProcessor().createPayment("credit");

        p.inputPaymentDetail();
        p.printPaymentReceipt();
    }
}

// API
interface Payment {
    void inputPaymentDetail();
    void printPaymentReceipt();
}

class CashPayment implements Payment {
    private double total;
    Scanner input = new Scanner(System.in);

    public void inputPaymentDetail() {
        System.out.print("total: ");
        total = input.nextDouble();
    }

    public void printPaymentReceipt() {
        System.out.println("Payment (Cash): " + total);
    }
}

class CreditCardPayment implements Payment {
    private String cardNumber;
    private String cardExpireDate;
    private double total;
    Scanner input = new Scanner(System.in);

    public void inputPaymentDetail() {
        System.out.print("Input total: ");
        total = input.nextDouble(); input.nextLine();
        System.out.print("Card Number: ");
        cardNumber = input.nextLine();
        System.out.print("Expire Date: ");
        cardExpireDate = input.nextLine();
    }

    public void printPaymentReceipt() {
        System.out.println("Payment (CreditCard) - " + cardNumber + " : " + total);
    }
}