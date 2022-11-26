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
public class Progress {
    private Worker worker;
    private Work work;
    private double totalFees;
    private String description;

    public Progress(Worker worker, Work work, double totalFees, String description) {
        this.worker = worker;
        this.work = work;
        this.totalFees = this.work.getFees() + this.worker.getFees();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void show_progress() {
        System.out.println("Worker Name: " + this.worker.getName());
        System.out.println("Job: " + this.work.getName());
        System.out.println("Total Fees: " + this.totalFees);
        System.out.println("Description: " + this.description);
    }
}
