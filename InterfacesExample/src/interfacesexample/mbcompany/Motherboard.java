/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexample.mbcompany;

/**
 *
 * @author MSAUDI
 */
public class Motherboard {
    
    
    public void display(IVGACard card){
        
        String model = card.getVGAModel();
        int[] res = card.getResolution();
        
        int screenWidth = res[0];
        int screenHeight= res[1];
        
        // ANY CODE TO DIPLAY INFORMATION ON GVA CARD
        
    }
    
    
}
