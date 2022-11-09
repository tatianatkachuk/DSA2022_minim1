import java.util.*;

public class ProductManagerImpl implements ProductManager{

    private List<Product> productsList = new ArrayList<>(); // product list
    private Queue<Order> orderQueue =  new LinkedList<>(); // orders queue
    private HashMap<String, User> userList= new HashMap<>();  // user system list

    private int cnt=0;



    //////////////////////////////////////////////////////////////////////////////////
    // USERS
    //////////////////////////////////////////////////////////////////////////////////

    @Override
    public int numUsers() {
        return userList.size();
    }

    public void addUser(String userId, User user) {
        userList.put(userId,user);
        user.setUserId(userId);
    }

    public Collection<User> getAllUsers(){

        return (Collection<User>) userList.values();

    }



    //////////////////////////////////////////////////////////////////////////////////
    // PRODUCTS
    //////////////////////////////////////////////////////////////////////////////////

    @Override
    public int numProducts() {
        return productsList.size();
    }

    public void addProduct(String productId, String name, double price) {
        Product p = new Product(productId, name, price);
        productsList.add(p);
    }

    public List<Product> getAllProducts() {
        return productsList;
    }

    @Override
    public List<Product> productsByPrice() {
        List<Product> plist = new ArrayList<>(this.productsList);
        if (!plist.isEmpty()){
        Collections.sort(plist, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        return plist;
        }else return  null;
    }

    @Override
    public List<Product> productsBySales() {
        List<Product> plist = new ArrayList<>(this.productsList);

        if (!plist.isEmpty()) {
            Collections.sort(plist, new Comparator<Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    return Integer.compare(o2.getNumSales(), o1.getNumSales());
                }

            });

            return plist;


        }else return  null;
    }




    //////////////////////////////////////////////////////////////////////////////////
    // ORDERS
    //////////////////////////////////////////////////////////////////////////////////

    public Queue<Order> getOrders(){
        return orderQueue;
    }


    @Override
    public int numOrders() {
        return orderQueue.size();
    }

    @Override
    public int numSales(String b001) {
        return 0;
    }

    @Override
    public Order addOrder(Order order) {
        orderQueue.add(order);
        return order;
    }

    @Override
    public List<Order> ordersByUser(String userId) {
        User u = userList.get(userId);
        return u.getOrdersUser();
    }

    @Override
    public Order processOrder() {

        Order order = orderQueue.poll();  // order from queue

        List<String> prods = order.getProducts();

        for(String name:prods){

            int quant = order.getQuantity(order);
            if(quant==0){
                return null;

            }else{
                for(Product p: productsList){
                    if(name.equals(p.getName())){
                        p.setNumSales(quant);
                    }
                }
            }
        }return order;
    }


}
