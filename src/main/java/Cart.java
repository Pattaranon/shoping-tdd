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
            result = 0d;
        }
        else {
            for (LineItem item : getLineItems()) {
                if(item.unit > 0) {
                    // 3Parameter
                    double cal = item.price * item.unit;
                    result += cal;
                }
                else {
                    // 2 Parameter
                    result += item.price;
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
