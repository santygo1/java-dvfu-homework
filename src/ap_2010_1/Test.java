package ap_2010_1;

public class Test {

    public static void main(String[] args) {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));

        System.out.println(goodies);
        System.out.println("Get total boxes: " + goodies.getTotalBoxes());
        System.out.println("Deleted count \"Chocolate Chip\": " +
                goodies.removeVariety("Chocolate Chip"));
        System.out.println(goodies);

        System.out.println("Deleted count \"Brownie\": " +
                goodies.removeVariety("Brownie"));
        System.out.println(goodies);


    }
}
