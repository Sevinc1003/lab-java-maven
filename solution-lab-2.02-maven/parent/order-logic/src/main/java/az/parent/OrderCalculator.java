package az.parent;

import java.util.List;

public class OrderCalculator {

// this method is incomplete because buying with kilo or Shtuchniy(russian mentioned) is different
    public void orderTotalPrice(OrderData orderData){

       List<Item> items = orderData.getItems();
       double sum = 0;

       for (Item item : items) {

        sum+= item.getPrice() * item.getQuantity(); 

       }

       orderData.setTotal(sum);

       System.out.println(orderData.getBuyer()+"'s order number " + orderData.getOrderId()+"'s total is "+ sum);
        
    }

    public void filterByPrice(List<Item> items){

        List<Item> newList;

        for (Item item : items) {


            
        }


    }

    



}
