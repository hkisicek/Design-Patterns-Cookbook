/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author helena
 */
public interface SmartphoneBuilder {
    
    SmartPhone build();
    SmartPhone setScreenSize(final float size);
    SmartPhone setResolution(final int resolution);
    SmartPhone setBatteryLife(final int battery);
    SmartPhone setRam(final int ram);
    SmartPhone setCameraPixel(final float cameraPixel);
    SmartPhone setPrice(final float price);
}
