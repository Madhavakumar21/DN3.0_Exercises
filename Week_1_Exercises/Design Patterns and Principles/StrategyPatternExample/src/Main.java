// Main.java
public class Main {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432", "Madhavakumar D");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.pay(250.75);

        PaymentStrategy payPalPayment = new PayPalPayment("madhavakumar.d@gmail.com");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.pay(150.00);
    }
}

