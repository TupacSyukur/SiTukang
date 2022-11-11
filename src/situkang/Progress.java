/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package situkang;

/**
 *
 * @author user
 */
public class Progress {
    private Worker w1;
    private int bill;
    private int[] range_time;
    private String item;
    private String description;

    public Progress(Worker w1, int bill, int[] range_time, String item, String description) {
        this.w1 = w1;
        this.bill = bill;
        this.range_time = range_time;
        this.item = item;
        this.description = description;
    }
    
    public void show_progress() {
        
    }
    
    
    
}
