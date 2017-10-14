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
public class Builder{
    private CarBuilder builder;
    
    public Builder(final CarBuilder builder){
        this.builder=builder;
    }
    
    public Car construct(){
        return builder.setWheels(4)
                            .setColor("red")
                            .build();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final CarBuilder builder = new CarBuilderImpl();
        final Builder carBuildDirector = new Builder(builder);
        System.out.println(carBuildDirector.construct());
    }    
}
