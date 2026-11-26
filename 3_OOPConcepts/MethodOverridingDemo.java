/**
 * Program 3.5: Demonstrates Method Overriding in Java.
 * A subclass provides its own implementation of a method defined in its parent class.
 */
class Bank {
    double getInterestRate() {
        return 4.0;
    }
}

class SavingsBank extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class FixedDepositBank extends Bank {
    @Override
    double getInterestRate() {
        return 7.75;
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Bank generalBank = new Bank();
        SavingsBank savings = new SavingsBank();
        FixedDepositBank fixedDeposit = new FixedDepositBank();

        System.out.println("General Bank Interest Rate: " + generalBank.getInterestRate() + "%");
        System.out.println("Savings Bank Interest Rate: " + savings.getInterestRate() + "%");
        System.out.println("Fixed Deposit Bank Interest Rate: " + fixedDeposit.getInterestRate() + "%");
    }
}
