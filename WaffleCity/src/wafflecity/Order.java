/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package wafflecity;

import java.util.ArrayList;

/**
 *
 * @author MSAUDI
 */
public class Order {
    private ArrayList<MenuItem> orderItems;
    
    
    ArrayList<MenuItem> getOrderItems(){
        return orderItems;
    }
    public Order(){
        orderItems = new ArrayList<>();
    }
    
    void addItem(MenuItem i){
        orderItems.add(i);
    }
    
    
    
}
