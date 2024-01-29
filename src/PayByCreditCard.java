public class PayByCreditCard implements PaymentStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public PayByCreditCard(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }


    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using Credit Card.");
        // Connect with PayPal API to process payment
        return true; // Dummy return for demonstration
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Collecting payment details for PayPal.");
    }
}
