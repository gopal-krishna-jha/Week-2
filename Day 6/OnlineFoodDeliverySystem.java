package com.encapsulationandpolymorphism.day06;

// Abstract class representing a food item
abstract class FoodItem {
   // Private instance variables to store item details
   private String itemName;
   private double price;
   private int quantity;

   // Constructor to initialize food item details
   public FoodItem(String itemName, double price, int quantity) {
       this.itemName = itemName;
       this.price = price;
       this.quantity = quantity;
   }

   // Abstract method to calculate the total price of the food item
   abstract double calculateTotalPrice();

   // Method to return details of the food item as a formatted string
   public String getItemDetails() {
      String str = "Item Name: " + itemName;
      str += "\nPrice of the Item: " + price;
      str += "\nTotal Quantity: " + quantity;

      return str;
   }

   // Getter method to access the price of the food item
   public double getPrice() {
       return price;
   }

   // Getter method to access the quantity of the food item
   public int getQuantity() {
       return quantity;
   }
}

// Class representing a vegetarian food item, extending FoodItem
class VegItem extends FoodItem {
   // Constructor to initialize vegetarian food item details
   public VegItem(String itemName, double price, int quantity) {
       super(itemName, price, quantity);
   }

   // Overridden method to calculate the total price of a vegetarian food item
   public double calculateTotalPrice() {
       return getPrice() * getQuantity();
   }
}

// Class representing a non-vegetarian food item, extending FoodItem
class NonVegItem extends FoodItem {
   // Additional charge for non-vegetarian items
   public double nonVegCharge;

   // Constructor to initialize non-vegetarian food item details
   public NonVegItem(String itemName, double price, int quantity, double nonVegCharge) {
       super(itemName, price, quantity);
       this.nonVegCharge = nonVegCharge;
   }

   // Overridden method to calculate the total price, including the non-veg charge
   public double calculateTotalPrice() {
       return getPrice() * getQuantity() + nonVegCharge;
   }
}

// Interface defining discount-related functionality
interface Discountable {
   // Method to calculate the final price after applying a discount
   double applyDiscount(double totalPrice, double discount);

   // Method to return discount details as a string
   String getDiscountDetails(double amount, double discountPercent);
}

// Class implementing the Discountable interface to provide discount functionality
class GetDiscount implements Discountable {

   // Overridden method to calculate the price after applying a discount
   public double applyDiscount(double totalPrice, double discount) {
       return (totalPrice - totalPrice * (discount / 100));
   }

   // Overridden method to generate discount details as a formatted string
   public String getDiscountDetails(double amount, double discountPercent) {
       return "After Discount Final Bill is: " + applyDiscount(amount, discountPercent);
   }
}

// Main class to test and demonstrate the food delivery system
public class OnlineFoodDeliverySystem {
   public static void main(String[] args) {
       // Create an object for a vegetarian food item
       FoodItem getVegItem = new VegItem("Butter Paneer", 280, 2);

       // Create an object for a non-vegetarian food item
       FoodItem getNonVegItem = new NonVegItem("Butter Chicken", 250, 4, 50);

       // Create an object for applying discounts
       GetDiscount discount = new GetDiscount();

       // Display details and calculate prices for vegetarian items
       System.out.println("VEG Item: \n" + getVegItem.getItemDetails());
       System.out.println("Total Price: " + getVegItem.calculateTotalPrice());
       System.out.println(discount.getDiscountDetails(getVegItem.calculateTotalPrice(), 10));

       // Display details and calculate prices for non-vegetarian items
       System.out.println("\nNON-VEG Item: \n" + getNonVegItem.getItemDetails());
       System.out.println("Total Price: " + getNonVegItem.calculateTotalPrice());
       System.out.println(discount.getDiscountDetails(getNonVegItem.calculateTotalPrice(), 10));
   }
}
