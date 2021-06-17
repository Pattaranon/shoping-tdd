import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WongnaiTest {
    private Cart cart;

    @Before
    public void setUp() throws Exception {
        cart = new Cart();
    }

    @Test
    public void testEmptyCart() {
        Assert.assertThat(cart.totalPrice(), Matchers.equalTo(0d));
    }

    @Test
    public void testChocolateAndPocky() {
        cart.getLineItems().add(new LineItem("Chocolate", 10d));
        cart.getLineItems().add(new LineItem("Pocky", 20d));

        Assert.assertThat(cart.totalPrice(), Matchers.equalTo(30d));
    }

    @Test
    public void testChocolateAndPockyHaveQuantity() {
        cart.getLineItems().add(new LineItem("Chocolate", 16d, 2));
        cart.getLineItems().add(new LineItem("Pocky", 20d, 2));

        Assert.assertThat(cart.totalPrice(), Matchers.equalTo(72d));
    }
}
