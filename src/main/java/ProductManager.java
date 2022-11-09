import java.util.*;

public interface ProductManager {

    public int numUsers();



    public int numProducts();

    public int numOrders();

    public int numSales(String b001);


    // USERS
    public void addUser(String userId, User user);//



    // PRODUCTS
    public void addProduct(String productId, String name, double price);//


    List<Product> productsByPrice();//

    List<Product> productsBySales();//

    List<Product> getAllProducts();//




    // ORDERS
    public Order addOrder(Order order);//

    public List<Order> ordersByUser(String userId);//

    public Queue<Order> getOrders();//


    public Order processOrder();//



}
