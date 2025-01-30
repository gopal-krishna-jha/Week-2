// Define an Order class to indicate the order details
class Order {
    // Declare instance variables to store orderId and orderDate
    int orderId;
    String orderDate;

    // Parameterized constructor to initialize orderId and orderDate
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to display the order status
    void getOrderStatus() {
        System.out.println("Your Order is booked");
        System.out.println("Your order Id is: " + orderId);
        System.out.println("Your order date is: " + orderDate);
        System.out.println();
    }
}

// Define a ShippedOrder class to indicate the shipped details, which extends
// the Order class
class ShippedOrder extends Order {
    // Declare an instance variable to store the tracking number
    String trackingNumber;

    // Parameterized constructor to initialize orderId, orderDate, and
    // trackingNumber
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call the parent class constructor to initialize orderId and orderDate
        this.trackingNumber = trackingNumber;
    }

    // Override the getOrderStatus method to display the shipped order details
    void getOrderStatus() {
        // Print the result indicating that the order has been shipped
        System.out.println("Your order is Shipped");
        System.out.println("Your tracking number is: " + trackingNumber);
        System.out.println();
    }
}

// Define a DeliveredOrder class to indicate the delivered details, which
// extends the ShippedOrder class
class DeliveredOrder extends ShippedOrder {
    // Declare an instance variable to store the delivery date
    String deliveryDate;

    // Parameterized constructor to initialize orderId, orderDate, trackingNumber,
    // and deliveryDate
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call the parent class constructor to initialize the order details
        this.deliveryDate = deliveryDate;
    }

    // Override the getOrderStatus method to display the delivered order details
    void getOrderStatus() {
        // Print the result indicating that the order has been delivered
        System.out.println("Your Order is Delivered");
        System.out.println("Your delivery Date is: " + deliveryDate);
        System.out.println();
    }
}

// Define the OnlineRetailOrderManagement class to demonstrate the use of Order,
// ShippedOrder, and DeliveredOrder classes
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Create an Order object with order details
        Order order1 = new Order(1001, "24-01-2025");

        // Create a ShippedOrder object with order, shipping details, and tracking
        // number
        ShippedOrder order2 = new ShippedOrder(1005, "01-02-2023", "6513206560");

        // Create a DeliveredOrder object with order, shipping details, tracking number,
        // and delivery date
        DeliveredOrder order3 = new DeliveredOrder(1004, "10-01-2025", "321954651659", "2025-01-24");

        // Print the order status for order1
        System.out.println("Status of Order1:");
        order1.getOrderStatus();

        // Print the order status for order2 (shipped)
        System.out.println("Status of Order2: ");
        order2.getOrderStatus();

        // Print the order status for order3 (delivered)
        System.out.println("Status of Order3: ");
        order3.getOrderStatus();
    }
}
