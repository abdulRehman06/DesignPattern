package Observer;

public class PriceObserver implements OrderObserver {
    @Override
    public void update(Order order) {
        double total = order.getsTotalPrice();
        if (total > 400) {
            order.dDiscount = 50;
        } else if (total > 200) {
            order.dDiscount = 20;
        }
    }
}
