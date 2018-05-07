/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package wafflecity.logic;

import java.util.ArrayList;
import wafflecity.model.Order;


/**
 *
 * @author MSAUDI
 */
public class ShopManager {
    
    private static int orderNumber = 0;
    private static ArrayList<Order> currentOrders = new ArrayList<>();;
    
    public static void makeNewOrder(String customrName){
        
        /*if (currentOrders == null) {
        currentOrders = new ArrayList<>();
        }*/
        orderNumber ++;
        
        Order o = new Order();
        o.setCustomerName(customrName);
        o.setId(orderNumber);
        
        currentOrders.add(o);
        
    }
    
    public static ArrayList<Order> getAllOrders(){
        
        return currentOrders;
    }
    
    public static Order getOrderById(int orderId){
        
        for (int i = 0; i < currentOrders.size(); i++) {
            if(currentOrders.get(i).getId() == orderId)
                return currentOrders.get(i);
        }
       
        return null;
    }
    
}
