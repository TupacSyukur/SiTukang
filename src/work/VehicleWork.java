/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;

/**
 *
 * @author user
 */
public class VehicleWork extends Work {
    private String type;

    public VehicleWork(String type, int id, int[] range) {
        super(id, range);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
