package ap_2010_1;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {

    private final List<CookieOrder> orders;

    public MasterOrder(){
        orders = new ArrayList<>();
    }

    public void addOrder(CookieOrder order){
        orders.add(order);
    }

    /**
     * Getting the total boxes count.
     * @return total boxes count
     */
    public int getTotalBoxes(){
        int totalBoxes = 0;

        for (CookieOrder order: orders){
            totalBoxes+=order.getNumBoxes();
        }

        return totalBoxes;
    }

    /**
     * Removes order from the order's list, which contains variety like specified variety,
     * and returns count of the deleted orders;
     * @param cookieVar variety value for delete
     * @return count of deleted orders
     */
    public int removeVariety(String cookieVar){
        int beforeLength = orders.size();
        orders.removeIf( order -> order.getVariety().equals(cookieVar));
        return beforeLength - orders.size();
    }

    @Override
    public String toString() {
        return orders.toString();
    }
}
