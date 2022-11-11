/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package situkang;
import work.Work;

/**
 *
 * @author user
 */
public class Worker extends Customer{
    private String expertise;
    private int fees;
    private String experience;
    private double rating;
    private Work work_type;
    private final Customer[] work_order = new Customer[25];
    private int iter_work_order = 0;

    public Worker(String expertise, int fees, String experience, double rating, Work work_type, int id, String name, int phone_number, String address, String sex, int age) {
        super(id, name, phone_number, address, sex, age);
        this.expertise = expertise;
        this.fees = fees;
        this.experience = experience;
        this.rating = rating;
        this.work_type = work_type;
    }
    
    public Work getWork_type() {
        return work_type;
    }

    public void setWork_type(Work work_type) {
        this.work_type = work_type;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    public void accept_book(Customer c) {
        this.work_order[this.iter_work_order] = c;
        this.iter_work_order += 1;
    }
    
    public void access_progress() {
        
    }
    
    public void add_bill(int add) {
        this.fees += add;
    }
    
}
