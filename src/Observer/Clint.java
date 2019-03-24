package Observer;

public class Clint {
    public static void main(String[] args) {
        System.out.println("Observer Pattern");
Order orderObject = new Order( "10" );
OrderObserver priceObserverObj = new PriceObserver();
orderObject.attached(priceObserverObj); // now if priceObserverObj will continuously watch price
        orderObject.setdPrice( 100 );
        orderObject.setdPrice( 200 );
        orderObject.setdPrice( 300 );
        System.out.println(orderObject.toString());
    }
}
