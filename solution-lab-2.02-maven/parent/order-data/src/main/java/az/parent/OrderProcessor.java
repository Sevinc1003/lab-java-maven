package az.parent;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class OrderProcessor {




    public static OrderData  processData(String json){


        Gson gson = new Gson();

        OrderData orderData = gson.fromJson(json, OrderData.class);


        System.out.println(json);

         return orderData;

    }




}
