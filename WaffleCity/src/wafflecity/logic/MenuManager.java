/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wafflecity.logic;
import java.util.ArrayList;
import wafflecity.model.DatabaseManager;
import wafflecity.model.MenuItem;
import wafflecity.model.Order;


/**
 *
 * @author MSAUDI
 */
public class MenuManager {
    
    private static ArrayList<MenuItem> menuItems = new ArrayList<>();;
    private static int itemId; // 0 by default
    
    public  static void addMenuItem(MenuItem item) {
        item.setId(itemId);
        
        //Add item in database
        itemId = DatabaseManager.saveMenuItem(item);
        menuItems.add(item);
    }
    
    public  static ArrayList<MenuItem> getAllItems(){
        return DatabaseManager.getMenuItems();
    }

    public static MenuItem getMenuItemById(int itemId) {
        
        for (int i = 0; i < menuItems.size(); i++) {
            if(menuItems.get(i).getId() == itemId)
                return menuItems.get(i);
        }
     return null;
    }
    
    
}
