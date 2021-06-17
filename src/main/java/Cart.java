import org.hamcrest.Matchers;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

public class Cart extends LineItem {

    public Cart() {
    }

    public Cart(String item, double price) {
        super(item, price);
    }

    public Cart(String item, double price, int unit) {
        super(item, price, unit);
    }

    public double totalPrice() {
        return 0;
    }

    public ArrayList<LineItem> getLineItems() {
        return new ArrayList<LineItem>();
    }
}
