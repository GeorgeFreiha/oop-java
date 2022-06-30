public class DeluxeBurger extends Hamburger{



    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
        System.out.println("Deluxe burger on a " + super.getBreadRollType() + " with ");
        super.addHamburgerAddition1("chips", 3);
        super.addHamburgerAddition2("drinks", 5);
    }






}
