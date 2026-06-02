interface Refundable {
    void refund();
}

abstract class Payment {
    final double TRANSACTION_FEE = 10.0;

    abstract void pay(double amount);

    void successMessage() {
        System.out.println("Payment Successful");
    }
}

class UPI extends Payment implements Refundable {

    void pay(double amount) {
        System.out.println("UPI Payment: " + amount);
    }

    public void refund() {
        System.out.println("UPI Refund Processed");
    }
}

class Card extends Payment implements Refundable {

    void pay(double amount) {
        System.out.println("Card Payment: " + amount);
    }

    public void refund() {
        System.out.println("Card Refund Processed");
    }
}

class COD extends Payment {

    void pay(double amount) {
        System.out.println("Cash on Delivery Payment: " + amount);
    }
}

public class PaymentGatewaySystem {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new Card();
        Payment p3 = new COD();

        p1.pay(500);
        p1.successMessage();

        p2.pay(1000);
        p2.successMessage();

        p3.pay(750);
        p3.successMessage();

        Refundable r1 = new UPI();
        Refundable r2 = new Card();

        r1.refund();
        r2.refund();
    }
}