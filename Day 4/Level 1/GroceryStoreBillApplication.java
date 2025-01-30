//Create a class Product to indicate the details of product
class Product {
    // Create instance variable name, quantity and pricePerUnit
    public String productName;
    public double quantity, pricePerUnit;

    // Parameterized constructor to initialize values
    public Product(String productName, double quantity, double pricePerUnit) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

}

// Create a class Customer to indicate customer details
class Customer {
    // Create a static variable to count the product
    public int productCount = 0;

    // Create instance variable customerName to store name of the Customer
    public String customerName;

    // Create an array of reference
    public Product[] products;

    // Parameterized constructor to initialize values
    public Customer(String customerName, int maxProducts) {
        this.customerName = customerName;
        this.products = new Product[maxProducts];
        this.productCount = 0;
    }

    // Create an method addProduct to add the product
    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Cannot add more products. Maximum limit reached.");
        }
    }

}

// Create a class BillGenerator to calculate price and generate bill
class BillGenerator {

    // Create a method to get the total price
    public double getTotalPrice(Customer customer) {
        double total = 0;
        for (Product product : customer.products) {
            if (product != null) {
                total += product.quantity * product.pricePerUnit;
            }
        }
        return total;
    }
}

// Create a class GroceryStoreBillApplication to access BillGenerator, Product
// and Customer
public class GroceryStoreBillApplication {
    public static void main(String[] args) {
        // Create products class onject apples and milk
        Product apples = new Product("Apples", 2, 3);
        Product milk = new Product("Milk", 1, 2);

        // Crate an object of customer class
        Customer customer = new Customer("Alice", 5);

        // Call a method to Add products to the customer
        customer.addProduct(apples);
        customer.addProduct(milk);

        // Create a BillGenerator class object
        BillGenerator billGenerator = new BillGenerator();

        // Create a variable totalBill and call a method
        double totalBill = billGenerator.getTotalPrice(customer);

        // Print the result
        System.out.println("Total bill for " + customer.customerName + " is : $" + totalBill);
    }
}
