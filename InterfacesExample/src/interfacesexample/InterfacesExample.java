/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexample;

import interfacesexample.mbcompany.Motherboard;
import interfacesexample.vgacardcompany.ATIVGACard;

/**
 *
 * @author MSAUDI
 */
public class InterfacesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create mootherboard
        Motherboard m = new Motherboard();
        
        //Create VGA Card
        int[] res = {1024 , 860};
        String model = "ATI1485";
        ATIVGACard card = new ATIVGACard(res,model);
        
        
        //Use the motherboard to dipaly something on the vga card
        
        m.display(card);
        
    }
    
}
