public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Juicy lucy", "beef", 3.56, "regular");
        hamburger.itemizeHamburger();


        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total burger price is: " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition1("Lentils", 3.41);
        System.out.println("Total healthy burger price is: " +healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();




//        HealthyBurger healthyBurger = new HealthyBurger("gainz", "beef", 15, "Beef patty", 4, "onions", 1);
//        healthyBurger.addHamburgerAddition1("egg", 5.43);
//        System.out.println("Total Healthy burger price is : " + healthyBurger.itemizeHamburger());

//        healthyBurger.calculateFinalPrice();
//        System.out.println(healthyBurger.getAddition1Name());
//        System.out.println("The base price of this HealthyBurger is : " + healthyBurger.calculateBasePrice());
//        DeluxeBurger deluxeBurger = new DeluxeBurger("Big King", "beef", 20, "Rainbow bun");
//        System.out.println("The base price of this DeluxeBurger is : " + deluxeBurger.calculateBasePrice());
//        deluxeBurger.calculateFinalPrice();


    }
}