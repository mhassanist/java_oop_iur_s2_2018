/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexample.vgacardcompany;

import interfacesexample.mbcompany.IVGACard;

/**
 *
 * @author MSAUDI
 */
public class ATIVGACard implements IVGACard{
    // attributes 
    int[] resolution;
    String model;
    
    //Methods
    
    public ATIVGACard( int[] resolution, String model){
        this.resolution = resolution;
        this.model      = model;
    }

    @Override
    public int[] getResolution() {
        return resolution;
    }

    @Override
    public String getVGAModel() {
        return model;
    }
    
    
}
