class Payment{
    void pay(){
        System.out.println("Payment Done");
    }
}

class UPI extends Payment{
    void pay(){
        System.out.println("UPI Payment Successful");
    }
}

class Card extends Payment{
    void pay(){
        System.out.println("Card Payment Successful");
    }
}

class COD extends Payment{
    void pay(){
        System.out.println("Cash on Delivery");
    }
}

class Customer{
    String name;
    double cartAmount;

    Customer(String name, double cartAmount){
        this.name = name;
        this.cartAmount = cartAmount;
    }

    void checkout(Payment mode){
        System.out.println("Customer Name : " + name);
        System.out.println("Cart Amount : " + cartAmount);

        mode.pay();
        System.out.println();
    }
}

public class Ecommerce{
    public static void main(String[] args) {

        Customer obj1 = new Customer("Imaya", 2500);
        Payment p1 = new UPI();
        obj1.checkout(p1);

        Customer obj2 = new Customer("Swetha", 1800);
        Payment p2 = new Card();
        obj2.checkout(p2);

        Customer obj3 = new Customer("Priya", 3200);
        Payment p3 = new COD();
        obj3.checkout(p3);
    }
}