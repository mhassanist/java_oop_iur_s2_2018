/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package wafflecity.model;

import java.util.ArrayList;

/**
 * @author MSAUDI
 */
public class Order {
    private ArrayList<MenuItem> orderItems;
    
    private int id;
    private String customerName;
    
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    private double getOrderTotal(){
        double sum = 0;
        for (int i = 0; i < orderItems.size(); i++) {
            sum += orderItems.get(i).getPrice();
        }
        
        return sum;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public ArrayList<MenuItem> getOrderItems(){
        return orderItems;
    }
    public Order(){
        orderItems = new ArrayList<>();
    }
    
    public void addItem(MenuItem i){
        orderItems.add(i);
    }
    
    @Override
    public String toString() {
        return "Id:" + id + "\nName:"
                + customerName
                + "\nItems:"
                + orderItems
                + "\nOrder Total:" + getOrderTotal(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void removeItemFromOrder(MenuItem i1) {
        orderItems.remove(i1);
    }
    
    
    
    
}
