package ap_2010_1;

public class CookieOrder {
    private final String variety;
    private final int numBoxes;

    public CookieOrder(String variety, int numBoxes){
        this.variety = variety;
        this.numBoxes = numBoxes;
    }

    public String getVariety() {
        return variety;
    }

    public int getNumBoxes() {
        return numBoxes;
    }

    @Override
    public String toString() {
        return "{"+variety + ", " + numBoxes+"}";
    }
}
