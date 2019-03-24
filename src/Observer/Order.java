package Observer;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class Order {
    private double dPrice;
    private double sTotalPrice;
    private double dItemCount;



    protected double dDiscount;
    private String sID;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(String id) {
        this.sID = id;
    }

    public void attached(OrderObserver observer) {
        observers.add( observer );
    }

    public void detached(OrderObserver observer) {
        observers.remove( observer );
    }

    public void setdPrice(double dPrice) {
        this.dPrice = dPrice;
        this.sTotalPrice += dPrice;
        this.dItemCount++;
        observers.forEach( ordObs->ordObs.update( this ) ); // PASS Order
        System.out.println("observers size" + observers.size());
        /*for (OrderObserver obs : observers) {
            obs.update( this );
        }*/
        this.UpdatePrice();
    }

    public double getdPrice() {
        return dPrice;
    }

    public double getsTotalPrice() {
        return sTotalPrice - dDiscount;
    }

    public void UpdatePrice() {
        this.sTotalPrice -= dDiscount;
    }


    @Override
    public String toString() {
        return "Order{" +
                "dPrice=" + dPrice +
                ", sTotalPrice=" + sTotalPrice +
                ", dItemCount=" + dItemCount +
                ", dDiscount=" + dDiscount +
                ", sID='" + sID + '\'' +
                ", observers=" + observers +
                '}';
    }
}
