/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;

/**
 *
 * @author user
 */
public class Work {
    private int id;
    private double fees;
    private String name;
    private String category;
    private int estimation;

    public Work(int id, double fees, String name, String category, int estimation) {
        this.id = id;
        this.fees = 0;
        this.name = name;
        this.category = category;
        this.estimation = estimation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getEstimation() {
        return estimation;
    }

    public void setEstimation(int estimation) {
        this.estimation = estimation;
    }
    
    public void show_work() {
        
    }
    
}
