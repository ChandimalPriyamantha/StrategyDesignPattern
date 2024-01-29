public class PayByPayPal implements PaymentStrategy{

    private String email;
    private String password;

    public PayByPayPal(String email, String password) {
        this.email = email;
        this.password = password;
    }


    @Override
    public boolean pay(int paymentAmount) {
        System.out.println("Paying " + paymentAmount + " using PayPal.");
        // Connect with PayPal API to process payment
        return true; // Dummy return for demonstration
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Collecting payment details for PayPal.");
    }
}
