/**
 * Program 3.8: Demonstrates Polymorphism (Runtime / Dynamic Method Dispatch) in Java.
 * A single parent reference can refer to different child objects and invoke their overridden behavior.
 */
class PaymentMethod {
    void pay(double amount) {
        System.out.println("Processing generic payment of " + amount);
    }
}

class CreditCardPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UpiPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

class CashPayment extends PaymentMethod {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " in Cash.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Parent-type array holding different child implementations
        PaymentMethod[] payments = {
            new CreditCardPayment(),
            new UpiPayment(),
            new CashPayment()
        };

        for (PaymentMethod payment : payments) {
            payment.pay(1250.00);
        }
    }
}
