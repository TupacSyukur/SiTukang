/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package situkang;
import work.Work;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author user
 */
public class Worker extends Customer{
    Connection connection;
    private String expertise;
    private int fees;
    private String experience;
    private double rating;
    private ArrayList<Work> work_list = new ArrayList<Work>();
    private Customer[] work_order = new Customer[25];
    private int numberOfOrderWorker = 0;
    private int numberOfWork = 0;

    public Worker(int id, String name, int phone_number, String address, String sex, int age) {
        super(id, name, phone_number, address, sex, age);
        this.fees = 0;
        this.rating = 0.0;
    }

    public Worker(String expertise, int fees, String experience, double rating, int id, String name, int phone_number, String address, String sex, int age) {
        super(id, name, phone_number, address, sex, age);
        this.expertise = expertise;
        this.fees = 0;
        this.experience = experience;
        this.rating = 0.0;
    }
    
    public void startConnection() {
        this.connection = DatabaseConnection.getCon();
    }

    public ArrayList<Work> getWork_list() {
        return work_list;
    }

    public Customer[] getWork_order() {
        return work_order;
    }

    public int getnumberOfOrderWorker() {
        return numberOfOrderWorker;
    }

    public int getNumberOfWork() {
        return numberOfWork;
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
    
    public void addWorkList() {
        //this.work_list.add(w);
        int id;
        double fees;
        String name;
        String category;
        int estimation;
        String description;
        String query = "select * from work";
        try {
            startConnection();
            PreparedStatement st = connection.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                id = rs.getInt(1);
                fees = rs.getDouble(2);
                name = rs.getString(3);
                category = rs.getString(4);
                estimation = rs.getInt(5);
                description = rs.getString(6);
                Work w = new Work(id, fees, name, category, estimation, description);
                this.work_list.add(w);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void accept_book(Customer c) {
        this.work_order[this.numberOfOrderWorker] = c;
        this.numberOfOrderWorker += 1;
    }
    
    public void access_progress() {
        
    }
    
    public void add_bill(int add) {
        this.fees += add;
    }
    
    public double income() {
        double sum = 0;
        
        for (int i = 0; i < this.numberOfOrderWorker; i++) {
            sum += this.work_order[i].getBill();
        }
        
        return sum;
    }
    
}
