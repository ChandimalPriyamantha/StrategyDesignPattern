public class Demo {

    public static void main(String[] args) {

        // Client code demonstrating the use of the Strategy pattern
        PayByPayPal paypalStrategy = new PayByPayPal("paypal@example.com", "password123");
        PayByCreditCard creditCardStrategy = new PayByCreditCard("Chandimal","1234 5678 9012 3456", "1234", "26/01");

        Order order = new Order(paypalStrategy);
        order.setTotalCost(100);

        // Process order using PayPal
        order.processOrder();

        // Change payment strategy to Credit Card
        Order order2 = new Order(creditCardStrategy);
        order2.setClosed(false);
        order2.setTotalCost(200);
        order2.processOrder();

    }



}
