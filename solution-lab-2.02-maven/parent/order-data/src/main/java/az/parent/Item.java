package az.parent;

import com.google.gson.annotations.SerializedName;

public class Item {
    private String name;
    private double price;
        private int quantity;


    @SerializedName("purchace_type")
    private PurchaceType purchaceType;// kilo ile ya eded ile

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PurchaceType getPurchaceType() {
        return purchaceType;
    }

    public void setPurchaceType(PurchaceType purchaceType) {
        this.purchaceType = purchaceType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    

}
