package az.parent;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class OrderData {

    @SerializedName("order_id")
    private int orderId;

    private String buyer;

    private List<Item> items;

    private double total;
    

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    


    
    
}
