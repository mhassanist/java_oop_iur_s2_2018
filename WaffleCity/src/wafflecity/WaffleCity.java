
package wafflecity;

import java.util.ArrayList;

public class WaffleCity {
    
    
    public static void main(String[] args) {
        
        Order o1 = new Order();
        
        Juice j = new Juice();
        j.setType("Orange");
        
        o1.addItem(j);
       
        
        
        Juice j2 = new Juice();
        j2.setType("Havuc");
        
        o1.addItem(j2);
        
        ArrayList<Item> allitems = o1.getOrderItems();
        
        for (int i = 0; i < allitems.size(); i++) {
            System.out.println(allitems.get(i).getPrice());
        }
        
        //////////////////////
        /*int [] num = new int[4];
        num[0] = 5;
        num[1] = 4;
        
        
        ArrayList<String> data = new ArrayList<>();
        String s1 = new String("Hello");
        data.add(s1);
        
        String s2 = new String("Hello2");
        data.add(s2);
        
        data.get(0);
        */
        
        
        
        
        
    }
    
}
