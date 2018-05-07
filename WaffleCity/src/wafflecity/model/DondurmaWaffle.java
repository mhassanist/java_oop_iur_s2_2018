/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package wafflecity.model;

/**
 *
 * @author MSAUDI
 */
public class DondurmaWaffle extends BaseWaffle{
    String layerOneFruitName;
    String layerTowFruitName;
    IceCream tops[];

    public String getLayerOneFruitName() {
        return layerOneFruitName;
    }

    public void setLayerOneFruitName(String layerOneFruitName) {
        this.layerOneFruitName = layerOneFruitName;
    }

    public String getLayerTowFruitName() {
        return layerTowFruitName;
    }

    public void setLayerTowFruitName(String layerTowFruitName) {
        this.layerTowFruitName = layerTowFruitName;
    }

    public IceCream[] getTops() {
        return tops;
    }

    public void setTops(IceCream[] tops) {
        this.tops = tops;
    }

    
}
