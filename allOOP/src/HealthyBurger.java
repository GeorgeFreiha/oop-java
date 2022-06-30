public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger( String meat, double price) {
        super("Healthy Burger", meat, price, "brown rye bread roll");

//        System.out.println("Healthy hamburger on a brown rye roll with " + meat + ", price is " + price);
    }

    public void addHealthAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }






}