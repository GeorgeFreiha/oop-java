public class DeluxeBurger extends Hamburger{



    public DeluxeBurger() {
        super("Deluxe","sausage & bacon" ,14.54 , "white");
        super.addHamburgerAddition1("chips", 2.75);
        super.addHamburgerAddition2("drinks", 2);
    }
    //prevent a method to get called


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
