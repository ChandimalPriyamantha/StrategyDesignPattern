public class Order {

    private int totalCost;
    private boolean isClosed;
    private PaymentStrategy paymentStrategy;

    public Order(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder() {
        if (!isClosed && paymentStrategy != null) {
            if (paymentStrategy.pay(totalCost)) {
                System.out.println("Payment successful.");
                isClosed = true;
            } else {
                System.out.println("Payment failed. Please try again.");
            }
        } else {
            System.out.println("Order already closed or payment strategy not set.");
        }
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
}
