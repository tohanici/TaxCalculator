public class Main {
    public static void main(String[] args) {
        double price = 35.80;
        double tax = 2.30;
        int quantity = 10;
        double total = 0;
        String message;
        message = "i want to buy " + quantity + " shirt!";
        total = price * quantity * tax;
        System.out.println(message);
        System.out.println("Total cost with tax is: " + total );

    }
}
