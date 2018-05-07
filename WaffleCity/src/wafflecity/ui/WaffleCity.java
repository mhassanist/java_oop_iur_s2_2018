
package wafflecity.ui;

import java.util.ArrayList;
import java.util.Scanner;
import wafflecity.logic.MenuManager;
import wafflecity.logic.ShopManager;
import wafflecity.model.*;

public class WaffleCity {
    
    
    public static void main(String[] args) {
        
        while(true){
            //Make new order
            System.out.println("1- Make New Order");
            System.out.println("2- List Opened Orders");
            System.out.println("3- Add Item To Order");
            System.out.println("4- Add Item To Menu Items");
            System.out.println("5- List Menu Items");
            System.out.println("6- Remove Item From Order");
            
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            
            switch(choice){
                case 1:
                    //Make new order
                    System.out.println("Enter Customer Name:");
                    s.nextLine(); // to solve the scanner issue
                    String customerName = s.nextLine();
                    ShopManager.makeNewOrder(customerName);
                    
                    break;
                case 2:
                    //List orders
                    printOrders();
                    break;
                case 3:
                    //Add item to order
                    printOrders();
                    printItems();
                    
                    System.out.println("Enter Order Id:");
                    int orderId = s.nextInt();
                    
                    System.out.println("Enter Item Id:");
                    int itemId = s.nextInt();
                    
                    //Get order with the id orderId
                    Order o     = ShopManager.getOrderById(orderId);
                    MenuItem i = MenuManager.getMenuItemById(itemId);
                    o.addItem(i);
                    break;
                    
                case 4:
                    //add items to menu
                    Juice j = new  Juice();
                    j.setName("Apple");
                    j.setType("Bottle");
                    j.setPrice(15);
                    j.setDescription("Medium size Bottle Apple");
                    
                    MenuManager.addMenuItem(j);
                    break;
                case 5:
                    //Show menu items
                    printItems();
                    break;
                    
                case 6:
                    //Remove item from order
                    printOrders();
                    printItems();
                    
                    System.out.println("Enter Order Id:");
                    int orderId1 = s.nextInt();
                    
                    System.out.println("Enter Item Id:");
                    int itemId1 = s.nextInt();
                    
                    Order o1     = ShopManager.getOrderById(orderId1);
                    MenuItem i1 = MenuManager.getMenuItemById(itemId1);
                    o1.removeItemFromOrder(i1);
                    break;
                    
                    
            }
            
            
        }
    }
    
    public static void printItems(){
        ArrayList<MenuItem> allItems = MenuManager.getAllItems();
        System.out.println("\nMenu Items:\n" + allItems);
    }
    public static void printOrders(){
        ArrayList<Order> allOrders = ShopManager.getAllOrders();
        System.out.println("\nOrders:\n" + allOrders);
    }
    
}
