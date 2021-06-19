import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class Cart extends LineItem {

    ArrayList<LineItem> lineItemsList = new ArrayList<>();

    public Cart() {
    }

    public double totalPrice() {
        double result = 0;
        if(getLineItems() == null)
        {
            // Test case one.
            result = 0d;
        }
        else {
            for (LineItem item : getLineItems()) {
                if(item.unit == 0) {
                    // 2 Parameter for test case two.
                    result += item.price;
                }
                else {
                    // 3 Parameter for test case three.
                    double cal = item.price * item.unit;
                    result += cal;
                }
            }
        }

        return result;
    }

    @Override
    public ArrayList<LineItem> getLineItems() {
        return lineItemsList;
    }
}
